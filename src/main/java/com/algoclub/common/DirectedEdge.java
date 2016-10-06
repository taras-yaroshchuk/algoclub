package com.algoclub.common;

public class DirectedEdge {
    public int from;
    public int to;
    public double weight;

    public DirectedEdge(int from, int to, double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}
