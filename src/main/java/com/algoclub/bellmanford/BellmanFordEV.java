package com.algoclub.bellmanford;

import com.algoclub.common.DirectedEdge;
import com.algoclub.common.EdgeWeightedDigraph;

import java.util.List;

public class BellmanFordEV {
    public double[] disTo;
    public DirectedEdge[] edgeTo;
    public EdgeWeightedDigraph edgeWeightedDigraph;

    public BellmanFordEV(EdgeWeightedDigraph edgeWeightedDigraph, int v) {
        disTo = new double[edgeWeightedDigraph.vCount];
        edgeTo = new DirectedEdge[edgeWeightedDigraph.vCount];
        this.edgeWeightedDigraph = edgeWeightedDigraph;

        for (int i = 0; i < edgeWeightedDigraph.vCount; i++) {
            disTo[i] = Double.POSITIVE_INFINITY;
        }

        disTo[v] = 0;

        List<DirectedEdge> allEdges = edgeWeightedDigraph.getEdges();
        for (int i = 0; i < edgeWeightedDigraph.vCount; i++) {
            for (DirectedEdge edge : allEdges) {
                relax(edge);
            }
        }

    }

    public void relax(DirectedEdge edge) {
        int v = edge.from;
        int w = edge.to;

        if (disTo[w] > disTo[v] + edge.weight) {
            disTo[w] = disTo[v] + edge.weight;
            edgeTo[w] = edge;


        }
    }

    public double distTo(int v) {
        return disTo[v];
    }


}
