package TreesAndGraphs;
import java.util.*;

public class Node
{
	public ArrayList<Node> adjacents = new ArrayList<>();

	public void AddAdjacent(Node node) {
		adjacents.add(node);
	}
}
