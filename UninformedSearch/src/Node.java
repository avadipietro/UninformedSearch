import java.util.ArrayList;

public class Node {
	String name;
	ArrayList<Node> children;
	public ArrayList<Node> getChildren() {
		//should return a list of all connected nodes
		return children;
	}
	public void setChildren(ArrayList<Node> children) {
		//used to set the children of a Node
	}
	public String toString() {
		return "";
		//useful when we print the path found
	}
}
