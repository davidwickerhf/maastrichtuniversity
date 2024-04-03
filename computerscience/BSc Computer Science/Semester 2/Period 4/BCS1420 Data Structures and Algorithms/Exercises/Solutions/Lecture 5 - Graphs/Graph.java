import java.util.List;
import java.util.ArrayList;

public class Graph {
    private final List<Vertex> vertexes;
    private final List<Edge> edges;

    public Graph(List<Vertex> vertexes, List<Edge> edges) {
        this.vertexes = vertexes;
        this.edges = edges;
    }

    public List<Vertex> getVertexes() {
        return vertexes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public boolean adjacent(String x, String y)	{
        boolean result = false;
        for(Edge edge: edges){
            // as this is supposed to be a directed graph, we only care if x is the source and y the destination
            result = (edge.getSource().getId().equals(x) && edge.getDestination().getId().equals(y));
            if(result)
                return true;
        }
        return false;
    }

    public List<Vertex> getNeighbours(String vertex) {
        List<Vertex> neighbours = new ArrayList<>();
        for(Edge edge : edges){
            // as this is supposed to be a directed graph, we only care if vertex is the source
            if(edge.getSource().getId().equals(vertex))
                neighbours.add(edge.getDestination());
        }

        return neighbours;
    }


}