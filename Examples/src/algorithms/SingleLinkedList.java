package algorithms;

public class SingleLinkedList {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static SingleLinkedList insert(SingleLinkedList list, int key) {

		Node new_node = new Node(key);
		new_node.next = null;

		if (list.head == null) {

			list.head = new_node;
			
		} else {

			Node last = list.head;
			while (last.next != null) {

				last = last.next;
			}

			last.next = new_node;
		}
		return list;
	}

	public static SingleLinkedList delete(SingleLinkedList list, int key) {

		Node current_Node = list.head;
		Node prev = null;

		if (current_Node != null && current_Node.data == key) {

			list.head = current_Node.next;
			System.out.println(key + " found and deleted");
		}

		while (current_Node != null && current_Node.data != key) {

			prev = current_Node;
			current_Node = current_Node.next;
		}
		// Found
		if (current_Node != null) {

			prev.next = current_Node.next;

		}
		if (current_Node == null) {
			System.out.println(" not found");
		}

		return list;
	}

	public static void print(SingleLinkedList list) {

		Node currentNode = list.head;

		while (currentNode != null) {

			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleLinkedList list = new SingleLinkedList();

		System.out.print("LinkedList: ");
		//
		// ******INSERTION******
		//

		// Insert the values
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
		
		list = delete(list, 4);

		// Print the LinkedList
		print(list);
	}
}
