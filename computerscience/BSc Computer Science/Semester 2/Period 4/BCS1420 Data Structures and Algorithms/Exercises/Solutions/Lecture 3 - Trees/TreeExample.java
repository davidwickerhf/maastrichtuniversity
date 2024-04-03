public class TreeExample {
 
	public static void main(String[] args) {
		Node<String> root = createTree();
		System.out.println("Tree:");
		printTree(root, " ");
		System.out.println("Cousin Tree:");
		printCousins(root, " ");
	}
 
	private static Node<String> createTree() {
		Node<String> root = new Node<>("root");
				
		Node<String> node1 = root.addChild(new Node<String>("node 1"));
		
		Node<String> node11 = node1.addChild(new Node<String>("node 11"));
		Node<String> node111 = node11.addChild(new Node<String>("node 111"));
		Node<String> node112 = node11.addChild(new Node<String>("node 112"));

		Node<String> node1121 = node112.addChild(new Node<String>("node 1121"));
		Node<String> node1122 = node112.addChild(new Node<String>("node 1122"));
		
		Node<String> node12 = node1.addChild(new Node<String>("node 12"));
		
		Node<String> node2 = root.addChild(new Node<String>("node 2"));
		
		Node<String> node21 = node2.addChild(new Node<String>("node 21"));
		Node<String> node22 = node2.addChild(new Node<String>("node 22"));

		Node<String> node211 = node21.addChild(new Node<String>("node 211"));
		Node<String> node2111 = node211.addChild(new Node<String>("node 2111"));
		return root;
	}
	
	 private static <T> void printTree(Node<T> node, String appender) {
		  System.out.println(appender + node.getData());
		  node.getChildren().forEach(each ->  printTree(each, appender + appender));
	 }

	 private static <T> void printCousins(Node<T> node, String appender){
		 System.out.println(appender + "Cousins of " + node.getData());
		 if(node.getCousins().size()>0)
			 node.getCousins().forEach(each -> System.out.println(appender + each.getData()));
		 else
			 System.out.println(appender + "None");
		 node.getChildren().forEach(each ->  printCousins(each, appender + appender));
	 }
}