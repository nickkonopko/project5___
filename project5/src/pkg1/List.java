package pkg1;

class List{
	Node first;
	Node last;
	
	public List() {
		first = null;
		last = null;
	}
	public void insertFirst(String name, double gdpPerCapita) {
		Node newLink = new Node(name,gdpPerCapita);
		if(isEmpty()) {
			last = newLink;
			newLink.nextNode = first;
			first = newLink;
		}
	}
	public void insertLast(String name, double gdpPerCapita){
		Node newLink = new Node(name, gdpPerCapita);
		if(isEmpty()) {
			first = newLink;
		}
		else {
			last.nextNode = newLink;
			last = newLink;
		}
			
	}
//	public Node find(int result) {
//		Node current = first;
//		int counter = 1;
//		while(current.result != result) {
//			counter++;
//			if(current.nextNode == null)
//				return null;
//			else
//				current = current.nextNode;
//		}
//		return current;
//	}
//	public Node deleteFirst() {
//		Node temp = first;
//		if(first.nextNode == null)
//			last = null;
//		first = first.nextNode;
//		return temp;
//	}
	public void displayList() {
		System.out.print("this is the Link list");
		Node current = first;
		while(current != null) {
			current.printNode();
			current = current.nextNode;
		}
		System.out.println("");
	}
	public boolean isEmpty() { //checks if it is empty
		return first==null;
	}
	public boolean isFull() { //checks if it is full
		return false;
	}
	 public void delete(String name) {
		Node result = find(name);
		if(result == null) {
			return ;
		}
		Node current = first;
//		while(result != current.gdpPerCapita()) {
//			current = current.nextNode;
//		}
			if(current.nextNode == null)
				last = null;
			current = current.nextNode;
	 }
	 public Node find(String name) {
		 	int counter = 1;	
		 	Node current = first;
			while(name.compareTo(current.countryName())!=0) {
				counter++;
				if(current.nextNode == null)
					return null;
				else
					current = current.nextNode;
			}
			System.out.println("Nodes visited:  " + counter);
			System.out.println("gdpPerCapitia:  " + current.gdpPerCapita());
			return current;
	 }
	 
}


