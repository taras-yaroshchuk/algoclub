package com.algoclub.dijkstra;

import com.algoclub.common.DirectedEdge;
import com.algoclub.common.EdgeWeightedDigraph;
import com.algoclub.common.IndexWeightTuple;

import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    public double[] disTo;
    public DirectedEdge[] edgeTo;
    public PriorityQueue<IndexWeightTuple> priorityQueue;
    public EdgeWeightedDigraph edgeWeightedDigraph;

    Dijkstra(EdgeWeightedDigraph edgeWeightedDigraph, int v) {
        disTo = new double[edgeWeightedDigraph.vCount];
        edgeTo = new DirectedEdge[edgeWeightedDigraph.vCount];
        priorityQueue = new PriorityQueue<IndexWeightTuple>();
        this.edgeWeightedDigraph = edgeWeightedDigraph;
        priorityQueue.add(new IndexWeightTuple(v, 0));

        for (int i=0; i < edgeWeightedDigraph.vCount; i++){
            disTo[i] = Double.POSITIVE_INFINITY;
        }

        disTo[v] = 0;

        while (!priorityQueue.isEmpty()){
            relax(priorityQueue.poll().index);
        }
    }

    public void relax(int v){
        List<DirectedEdge> edgesOfVertex = edgeWeightedDigraph.getEdgesOf(v);

        for (DirectedEdge egde: edgesOfVertex){
            int w = egde.to;

            if (disTo[w]> disTo[v]+ egde.weight) {
                disTo[w] = disTo[v]+ egde.weight;
                edgeTo[w] = egde;

//                if (priorityQueue.contains(w)){
//                    priorityQueue.remove()
//                }
                priorityQueue.add(new IndexWeightTuple(w, disTo[w]));
            }
        }
    }

    public double distTo(int v) {
        return disTo[v];
    }

}

