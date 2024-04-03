import java.util.*;

public class AdjacencyList {
    private Map<Vertex, List<Edge>> adjacencyMap = new HashMap<>();

    public static AdjacencyList createFromGraph(Graph g){
        AdjacencyList list = new AdjacencyList();
        for(Edge e: g.getEdges()){
            list.addEdge(e.getSource(),e.getDestination(), e.getWeight());
        }
        return list;
    }

    public void addEdge(Vertex source, Vertex target, int weight){
        List<Edge> list;
        if(!adjacencyMap.containsKey(source)){
            list = new ArrayList<>();
            adjacencyMap.put(source, list);
        } else{
            list = adjacencyMap.get(source);
        }
        list.add(new Edge(""+source.getId()+" "+target.getId() + " " + weight, source, target, weight));
    }

    public List<Edge> getAdjacent(Vertex source){
        return adjacencyMap.get(source);
    }

    public Set<Vertex> getSources(){
        return adjacencyMap.keySet();
    }

    public Collection<Edge> getAllEdges(){
        List<Edge> edges = new ArrayList<>();
        for(List<Edge> e : adjacencyMap.values())
            edges.addAll(e);
        return edges;
    }

    public void reverseEdge(Edge e){
        adjacencyMap.get(e.getSource()).remove(e);
        addEdge(e.getDestination(), e.getSource(), e.getWeight());
    }

    public void reverseGraph(){
        adjacencyMap = getReversedEdges().adjacencyMap;
    }

    public AdjacencyList getReversedEdges(){
        AdjacencyList newList = new AdjacencyList();
        for(List<Edge> edges: adjacencyMap.values())
            for(Edge e: edges)
                newList.addEdge(e.getDestination(), e.getSource(), e.getWeight());

        return newList;
    }
}
