import java.util.ArrayList;
import java.util.List;
 
public class Node<T> {
 
	private T data = null;
 
	private List<Node<T>> children = new ArrayList<>();
 	private Node<T> parent = null;
 
	public Node(T data) {
		this.data = data;
	}
	
	public Node<T> getRoot() {
		if(parent != null)
			return parent.getRoot();
		else return this;
	}
 
	public Node<T> addChild(Node<T> child) {
		this.children.add(child);
		child.setParent(this);
		return child;
	}
 
	public void addChildren(List<Node<T>> children) {
		this.children.addAll(children);
	}
 
	public List<Node<T>> getChildren() {
		return this.children;
	}
 
	public T getData() {
		return this.data;
	}
 
	public void setData(T data) {
		this.data = data;
	}
 
	private void setParent(Node<T> parent) {
		this.parent = parent;
	}
 
	public Node<T> getParent() {
		return this.parent;
	}

	public List<Node<T>> getCousins(){
		List<Node<T>> cousins = new ArrayList<>();
		if(parent != null){
			if(parent.getParent() != null)
				for(Node<T> node: parent.getParent().getChildren()){
					if(node != parent)
						cousins.addAll(node.children);
				}
		}
		return cousins;
	}

}