package com.algoclub.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EdgeWeightedDigraph {
    public Map<Integer, List<DirectedEdge>> edges;
    public int vCount;
    public int eCount = 0;

    public EdgeWeightedDigraph(int v) {
        vCount = v;
        edges = new HashMap<>(v);
        for (int i = 0; i < v; i++) {
            edges.put(i, new ArrayList<>());
        }
    }

    public void addEdge(DirectedEdge e) {
        List<DirectedEdge> list = edges.get(e.from);
        list.add(e);
        eCount++;
    }

    public List<DirectedEdge> getEdgesOf(int v) {
        return edges.get(v);
    }

    public List<DirectedEdge> getEdges() {
        List<DirectedEdge> result = new ArrayList<>(eCount);

        for (List<DirectedEdge> list : edges.values()) {
            result.addAll(list);
        }
        return result;
    }
}
