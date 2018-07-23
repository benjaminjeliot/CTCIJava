package TreesAndGraphs;
import DummyUnit.*;

public class RouteBetweenNodesTest
{
	public static Graph BuildGraph0() {
		Graph graph = new Graph();
		for (int i = 0; i < 7; ++i) {
			graph.nodes.add(new TreesAndGraphs.Node());
		}
		graph.nodes.get(0).AddAdjacent(graph.nodes.get(1));
		graph.nodes.get(1).AddAdjacent(graph.nodes.get(2));
		graph.nodes.get(2).AddAdjacent(graph.nodes.get(0));
		graph.nodes.get(2).AddAdjacent(graph.nodes.get(3));
		graph.nodes.get(3).AddAdjacent(graph.nodes.get(2));
		graph.nodes.get(4).AddAdjacent(graph.nodes.get(6));
		graph.nodes.get(5).AddAdjacent(graph.nodes.get(4));
		graph.nodes.get(6).AddAdjacent(graph.nodes.get(5));
		return graph;
	}

	public static Graph BuildGraph1() {
		Graph graph = new Graph();
		for (int i = 0; i < 6; ++i) {
			graph.nodes.add(new TreesAndGraphs.Node());
		}
		graph.nodes.get(0).AddAdjacent(graph.nodes.get(4));
		graph.nodes.get(0).AddAdjacent(graph.nodes.get(5));
		graph.nodes.get(1).AddAdjacent(graph.nodes.get(3));
		graph.nodes.get(1).AddAdjacent(graph.nodes.get(4));
		graph.nodes.get(2).AddAdjacent(graph.nodes.get(1));
		graph.nodes.get(3).AddAdjacent(graph.nodes.get(2));
		graph.nodes.get(3).AddAdjacent(graph.nodes.get(4));
		return graph;
	}

	public static void RouteBetweenNodesGraph0() {
		Graph graph = BuildGraph0();
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(0), graph.get(1)));
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(0), graph.get(3)));
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(3), graph.get(0)));
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(0), graph.get(6)));
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(6), graph.get(0)));
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(6), graph.get(4)));
	}

	public static void RouteBetweenNodesGraph1() {
		Graph graph = BuildGraph1();
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(0), graph.get(3)));
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(0), graph.get(4)));
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(3), graph.get(1)));
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(4), graph.get(1)));
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(5), graph.get(0)));
		DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, graph.get(1), graph.get(0)));
	}

	public static void RouteBetweenNodesTests() {
		System.out.println("RouteBetweenNodesTest");
		RouteBetweenNodesGraph0();
		RouteBetweenNodesGraph1();
	}
}

