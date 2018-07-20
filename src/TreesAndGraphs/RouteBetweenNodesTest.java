package TreesAndGraphs;

public class RouteBetweenNodesTest
{
	public static Graph BuildGraph0() {
		Graph graph = new Graph();
		for (int i = 0; i < 7; ++i) {
			graph.nodes.add(new TreesAndGraphs.Node());
		}
		graph.nodes.get(0).AddChild(graph.nodes.get(1));
		graph.nodes.get(1).AddChild(graph.nodes.get(2));
		graph.nodes.get(2).AddChild(graph.nodes.get(0));
		graph.nodes.get(2).AddChild(graph.nodes.get(3));
		graph.nodes.get(3).AddChild(graph.nodes.get(2));
		graph.nodes.get(4).AddChild(graph.nodes.get(6));
		graph.nodes.get(5).AddChild(graph.nodes.get(4));
		graph.nodes.get(6).AddChild(graph.nodes.get(5));
		return graph;
	}

	public static Graph BuildGraph1() {
		Graph graph = new Graph();
		for (int i = 0; i < 6; ++i) {
			graph.nodes.add(new TreesAndGraphs.Node());
		}
		graph.nodes.get(0).AddChild(graph.nodes.get(4));
		graph.nodes.get(0).AddChild(graph.nodes.get(5));
		graph.nodes.get(1).AddChild(graph.nodes.get(3));
		graph.nodes.get(1).AddChild(graph.nodes.get(4));
		graph.nodes.get(2).AddChild(graph.nodes.get(1));
		graph.nodes.get(3).AddChild(graph.nodes.get(2));
		graph.nodes.get(3).AddChild(graph.nodes.get(4));
		return graph;
	}

	public static void RouteBetweenNodesGraph0() {
		Graph graph = BuildGraph0();
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 0, 1));
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 0, 3));
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 3, 0));
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 0, 6));
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 6, 0));
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 6, 4));
	}

	public static void RouteBetweenNodesGraph1() {
		Graph graph = BuildGraph1();
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 0, 3));
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 0, 4));
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 3, 1));
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 4, 1));
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 5, 0));
		DummyUnit.DummyUnit.assertEquals(true, RouteBetweenNodes.IsRoute(graph, 1, 0));
	}

	public static void RouteBetweenNodesTests() {
		System.out.println("RouteBetweenNodesTest");
		RouteBetweenNodesGraph0();
		RouteBetweenNodesGraph1();
	}
}

