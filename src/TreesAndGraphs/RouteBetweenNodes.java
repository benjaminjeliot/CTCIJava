package TreesAndGraphs;
import java.util.*;

public class RouteBetweenNodes {
	
	public static boolean IsRoute(Graph graph, Node first, Node second) {
		HashMap<Node, Boolean> visited = new HashMap<>();
		ArrayDeque<Node> queuedNodes = new ArrayDeque<>();
		queuedNodes.add(first);
		queuedNodes.add(second);
		while(queuedNodes.size() != 0) {
			Node currentNode = queuedNodes.pop();
			Boolean value = visited.get(currentNode);
			if (value != null) {
				return true;
			}
			visited.put(currentNode, true);
			for(Node adjacent: currentNode.adjacents) {
				queuedNodes.add(adjacent);
			}
		}
		return false;
	}
}
