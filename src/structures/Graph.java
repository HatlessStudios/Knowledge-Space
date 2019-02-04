package structures;

import knowledge.Atom;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph<T> {

    private Map<T, List<T>> adjacentVertices;

    public Set<T> getVertices(){
        return adjacentVertices.keySet();
    }

    public void addVertex(T t){
        adjacentVertices.putIfAbsent(t, new ArrayList<>());
    }

    public void removeAtom(T t){
        adjacentVertices.remove(t); //Feel this is redundant, but I'll leave it for now
    }

    public void addConnection(T t1, T t2){
        adjacentVertices.get(t1).add(t2);
        adjacentVertices.get(t2).add(t1);
    }

    public void removeConnection(T t1, T t2){
        if (adjacentVertices.get(t1) != null)
            adjacentVertices.get(t1).remove(t2);
        if (adjacentVertices.get(t2) != null)
            adjacentVertices.get(t2).remove(t1);
    }

    public List<T> getAdjacentVertices(T t){
        return adjacentVertices.get(t);
    }
}
