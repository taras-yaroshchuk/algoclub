package com.algoclub.common;

public class IndexWeightTuple implements Comparable<IndexWeightTuple> {

    public double weight;
    public int index;

    public IndexWeightTuple(int v, double weight) {
        index = v;
        this.weight = weight;
    }

    @Override
    public int compareTo(IndexWeightTuple o) {
        return Double.compare(this.weight, o.weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndexWeightTuple that = (IndexWeightTuple) o;

        return index == that.index;

    }

    @Override
    public int hashCode() {
        return index;
    }
}
