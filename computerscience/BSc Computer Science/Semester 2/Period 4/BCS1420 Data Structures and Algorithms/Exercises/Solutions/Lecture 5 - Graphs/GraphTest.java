import java.util.*;

public class GraphTest {

    public static Graph createGraph(int size, int sizeEdges) {
        // create a random graph
        List<Vertex> vertices = new LinkedList<>();
        List<Edge> edges = new LinkedList<>();
        for(int i = 0; i < size; i++){
            Vertex vertex = new Vertex(""+i, ""+i);
            vertices.add(vertex);
        }

        Random r = new Random();
        List<Integer> sources = new LinkedList<>();
        List<Integer> destinations = new LinkedList<>();

        for(int i = 0; i < sizeEdges; i++){
            int r1 = r.nextInt(size);
            int r2 = r.nextInt(size);
            while (r1 == r2)
                r2 = r.nextInt(size);

            Edge edge = new Edge("" + i, vertices.get(r1), vertices.get(r2), 1);
            if (!edges.contains(edge))
                edges.add(edge);
        }
        List<Edge> temp = new LinkedList<>();
        for(Edge edge: edges){
            temp.add(new Edge(edge.getId(), edge.getSource(), edge.getDestination(), 1+r.nextInt(10)));
        }
        edges = temp;
        return new Graph(vertices, edges);
    }

    public static void graphTest(Graph g) {
        System.out.println(g.getVertexes());
        System.out.println(g.getEdges());
        // check correctness using a few random vertices
        System.out.println("Vertex from 0 to 1 exists: " + g.adjacent("0","1"));
        System.out.println("Vertex from 1 to 0 exists: " + g.adjacent("1","0"));
        System.out.println("Vertex from 0 to 2 exists: " + g.adjacent("0","2"));
        System.out.println("Vertex from 2 to 0 exists: " + g.adjacent("2","0"));
        System.out.println("Vertex from 1 to 2 exists: " + g.adjacent("1","2"));
        System.out.println("Vertex from 2 to 1 exists: " + g.adjacent("2","1"));
    }

    private static boolean hasCycle(Graph g, boolean[] visited, Vertex source) {
        for(Vertex neighbour: g.getNeighbours(source.getId())){
            if(!visited[Integer.parseInt(neighbour.getId())]) {
                visited[Integer.parseInt(neighbour.getId())] = true;
                return hasCycle(g, visited, neighbour);
            } else
                return true;

        }
        return false;
    }

    public static boolean cycleTest(Graph g) {
        // start with vertex 0 for simplicity
        for(Vertex v: g.getVertexes()){
            boolean[] visited = new boolean[g.getVertexes().size()];
            visited[Integer.parseInt(v.getId())] = true;
            if(hasCycle(g, visited, v))
                return true;
        }
        return false;
    }

    private static List<Integer> dfs(Graph g, Vertex start, Vertex current, boolean[] visited, List<Integer> cycleLengths, int length) {
        // if we already visited the current node before and it is the start node, calculate the cycle length
        if(current == start && visited[Integer.parseInt(current.getId())]) {
            cycleLengths.add(length);
            return cycleLengths;
        }

        // if we have visited the current node before or it's impossible to have a simple cycle, return the empty array
        if(length>g.getVertexes().size() || visited[Integer.parseInt(current.getId())])
            return cycleLengths;

        // set the current node to visited
        visited[Integer.parseInt(current.getId())] = true;

        // for all neighbours of the current node, recursively perform a dfs
        for(Vertex child: g.getNeighbours(current.getId())){
            cycleLengths.addAll(dfs(g, start, child, visited, new ArrayList<>(), length+1));
        }

        return cycleLengths;
    }

    public static int longestPath(Graph g, Vertex start) {
        int cycleLength = 3; // a cycle must have at least length 3
        List<Integer> cycleLengths = dfs(g, start, start, new boolean[g.getVertexes().size()], new ArrayList<>(), 0);
        if(cycleLengths.size() > 0) {
            cycleLengths.sort(Collections.reverseOrder());
            cycleLength = cycleLengths.get(0);
        }
        return cycleLength;
    }

    private static int[][] makeAdjacencyMatrix(Graph g){
        int size = g.getVertexes().size();
        int[][] adjMatrix = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                adjMatrix[i][j] = 0;
            }
        }
        for(Edge e: g.getEdges()){
            adjMatrix[Integer.parseInt(e.getSource().getId())][Integer.parseInt(e.getDestination().getId())] = e.getWeight();
        }

        return adjMatrix;
    }

    boolean[] visited;
    List<Vertex> cycle;

    private void findCycle(Vertex start, AdjacencyList edges){
        visited[Integer.parseInt(start.getId())] = true;
        cycle.add(start);
        if(edges.getAdjacent(start) == null)
            return;
        for(Edge e: edges.getAdjacent(start))
            if(!visited[Integer.parseInt(e.getDestination().getId())])
                findCycle(e.getDestination(), edges);

    }

    private void mergeCycle(List<Vertex> cycle, AdjacencyList list, AdjacencyList reversed, AdjacencyList outgoingEdges, AdjacencyList reversedOutgoingEdges){
        List<Edge> minCycle = new ArrayList<>();
        // find edge in cycle with lowest weight
        Edge minInternalEdge = null;
        for(Vertex v: cycle){
            for(Edge e: reversed.getAdjacent(v)){
                if(cycle.contains(e.getDestination())){
                    if(minInternalEdge == null || minInternalEdge.getWeight() > e.getWeight()){
                        minInternalEdge = e;
                    }
                } else{
                    minCycle.add(e);
                }
            }
        }

        // find the incoming edge with lowest weight
        Edge minExternalEdge = null;
        int minWeight = 0;
        for(Edge e: minCycle){
            int w = e.getWeight() - (reversedOutgoingEdges.getAdjacent(e.getSource()).get(0).getWeight() - minInternalEdge.getWeight());
            if(minExternalEdge == null || minWeight > w){
                minExternalEdge = e;
                minWeight = w;
            }
        }

        // add incoming edge and remove newly-created cycle
        Edge edgeToRemove = reversedOutgoingEdges.getAdjacent(minExternalEdge.getSource()).get(0);
        reversedOutgoingEdges.getAdjacent(minExternalEdge.getSource()).clear();
        reversedOutgoingEdges.addEdge(minExternalEdge.getDestination(), minExternalEdge.getSource(), minExternalEdge.getWeight());
        List<Edge> adjacentEdge = outgoingEdges.getAdjacent(edgeToRemove.getDestination());
        for(int i = 0; i < adjacentEdge.size(); i++){
            if(adjacentEdge.get(i).getDestination() == edgeToRemove.getSource()){
                adjacentEdge.remove(i);
                break;
            }
        }

        outgoingEdges.addEdge(minExternalEdge.getDestination(), minExternalEdge.getSource(), minExternalEdge.getWeight());
    }


    public void minimumSpanningTreeTest(AdjacencyList list, Vertex startVertex, int size){
        // Chu-Liu/Edmond's Algorithm for MST in a directed graph
        AdjacencyList reversed = list.getReversedEdges();
        visited = new boolean[size];
        cycle = new ArrayList<>();
        // remove edges entering the root
        if(reversed.getAdjacent(startVertex) != null)
            reversed.getAdjacent(startVertex).clear();

        // for each node, select incoming edge with smallest weight
        AdjacencyList outgoingEdges = new AdjacencyList();
        for(Vertex v: reversed.getSources()){
            List<Edge> incomingEdges = reversed.getAdjacent(v);
            if(incomingEdges.size() == 0)
                continue; // skip remainder of for each iteration

            Edge min = incomingEdges.get(0);
            for(Edge e: incomingEdges)
                min = e.getWeight() < min.getWeight() ? e : min;
            outgoingEdges.addEdge(min.getDestination(), min.getSource(), min.getWeight());
        }

        // detect if there are any cycles formed
        List<List<Vertex>> cycles = new ArrayList<>();
        List<Vertex> cycle = new ArrayList<>();
        findCycle(startVertex, outgoingEdges);
        if(cycle.size() > 0)
            cycles.add(cycle);
        for(Vertex v: outgoingEdges.getSources())
            if(!visited[Integer.parseInt(v.getId())]) {
                cycle = new ArrayList<>();
                findCycle(v, outgoingEdges);
                if(cycle.size() > 0)
                    cycles.add(cycle);
            }

        // merge all cycles
        if(cycles.size() > 0) {
            AdjacencyList reversedOutgoingEdges = outgoingEdges.getReversedEdges();
            for (List<Vertex> vertices : cycles) {
                if (vertices.contains(startVertex)) {
                    continue;
                }
                mergeCycle(vertices, list, reversed, outgoingEdges, reversedOutgoingEdges);
            }
        }

        // calculate MST cost
        int cost = 0;
        for(Edge e: outgoingEdges.getAllEdges()){
            cost += e.getWeight();
        }

        System.out.println("MST size: " + outgoingEdges.getAllEdges().size());
        System.out.println("MST cost: " + cost);
    }

    public static void main(String[] a) {
        int vertices = 7;
        int edges = vertices * vertices; // maximum number of edges to be generated
        int startVertex = 0;
        // create a random graph
        Graph g = createGraph(vertices, edges);
        // check if it is a graph
        graphTest(g);
        if(cycleTest(g)) { // first check if there is a cycle in the graph
            System.out.println("Cycle detected!");
            // only look for the longest cycle from the given node
            // can then also loop over all vertices to find all cycles and take the maximum one
            System.out.println("Longest cycle from node " + g.getVertexes().get(startVertex) + " has length " + longestPath(g, g.getVertexes().get(startVertex))); // then return the length of the longest cycle
        }

        // create an adjacency list
        AdjacencyList adjList = AdjacencyList.createFromGraph(g);
        // find the minimum spanning tree of a directed graph using Edmond's algorithm
        new GraphTest().minimumSpanningTreeTest(adjList, g.getVertexes().get(startVertex), vertices);
    }

}
