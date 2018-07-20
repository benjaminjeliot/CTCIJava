package TreesAndGraphs;
import java.util.*;

public class Node
{
	private ArrayList<Node> nodes = new ArrayList<>();

	public void AddChild(Node node) {
		nodes.add(node);
	}
}
