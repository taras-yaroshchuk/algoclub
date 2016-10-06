package com.algoclub.dijkstra;

import com.algoclub.bellmanford.BellmanFordEV;
import com.algoclub.common.DirectedEdge;
import com.algoclub.common.EdgeWeightedDigraph;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DijkstraTest {

    @Test
    public void testFinal() {
//        EdgeWeightedDigraph graph = new EdgeWeightedDigraph(6);
//        graph.addEdge(new DirectedEdge(0, 1, 2));
//        graph.addEdge(new DirectedEdge(0, 2, 1));
//        graph.addEdge(new DirectedEdge(0, 3, 4));
//        graph.addEdge(new DirectedEdge(1, 3, 7));
//        graph.addEdge(new DirectedEdge(1, 4, 2.5));
//        graph.addEdge(new DirectedEdge(2, 3, 5));
//        graph.addEdge(new DirectedEdge(2, 4, 10));
//        graph.addEdge(new DirectedEdge(2, 5, 4));
//        graph.addEdge(new DirectedEdge(3, 5, 5));
//        graph.addEdge(new DirectedEdge(4, 5, 4));
//
//        Dijkstra dijkstra = new Dijkstra(graph, 0);
//        BellmanFordEV bellmanFordEV = new BellmanFordEV(graph, 0);
//        BellmanFordLin bellmanFordLin = new BellmanFordLin(graph, 0);
//        assertTrue(bellmanFordEV.printDists().equals(dijkstra.printDists()));
//        assertTrue(bellmanFordLin.printDists().equals(bellmanFordEV.printDists()));

    }

    @Test
    public void testDijkstra() {
        EdgeWeightedDigraph graph = new EdgeWeightedDigraph(6);
        graph.addEdge(new DirectedEdge(0, 1, 7));
        graph.addEdge(new DirectedEdge(0, 5, 14));
        graph.addEdge(new DirectedEdge(0, 2, 9));
        graph.addEdge(new DirectedEdge(1, 2, 10));
        graph.addEdge(new DirectedEdge(1, 3, 15));
        graph.addEdge(new DirectedEdge(2, 5, 2));
        graph.addEdge(new DirectedEdge(2, 3, 11));
        graph.addEdge(new DirectedEdge(5, 4, 9));
        graph.addEdge(new DirectedEdge(3, 4, 6));

        String result = "\n" +
                " i = 0. Dist to i = 0.0\n" +
                " i = 1. Dist to i = 7.0\n" +
                " i = 2. Dist to i = 9.0\n" +
                " i = 3. Dist to i = 20.0\n" +
                " i = 4. Dist to i = 20.0\n" +
                " i = 5. Dist to i = 11.0\n\n";
        BellmanFordEV dijkstra = new BellmanFordEV(graph, 0);

        assertTrue(dijkstra.distTo(5) == 11);
        assertTrue(dijkstra.distTo(4) == 20);
        assertTrue(dijkstra.distTo(5) == 11);
        assertTrue(dijkstra.distTo(3) == 20);

    }

    @Test
    public void testBellmanFord() {
//        EdgeWeightedDigraph graph = new EdgeWeightedDigraph(6);
//        graph.addEdge(new DirectedEdge(0, 1, 7));
//        graph.addEdge(new DirectedEdge(0, 5, 14));
//        graph.addEdge(new DirectedEdge(0, 2, 9));
//        graph.addEdge(new DirectedEdge(1, 2, 10));
//        graph.addEdge(new DirectedEdge(1, 3, 15));
//        graph.addEdge(new DirectedEdge(2, 5, 2));
//        graph.addEdge(new DirectedEdge(2, 3, 11));
//        graph.addEdge(new DirectedEdge(5, 4, 9));
//        graph.addEdge(new DirectedEdge(3, 4, 6));
//
//
//        BellmanFordEV bellmanFordEV = new BellmanFordEV(graph, 0);
//
//        assertTrue(bellmanFordEV.distTo(5) == 11);
//        assertTrue(bellmanFordEV.distTo(4) == 20);
//        assertTrue(bellmanFordEV.distTo(5) == 11);
//        assertTrue(bellmanFordEV.distTo(3) == 20);

    }

}
