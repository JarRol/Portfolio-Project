/**********************************************************************
* LinkedList.Java
* A Java implementation of a linked list class.
* A LinkedList is created from nodes of the Node class.
*
* B. Kell 11/2019
*
* Adapted from https://www.geeksforgeeks.org/ contributor Rajat Mishra.
***********************************************************************/

public class LinkedList
{
	/*******************************************************************************************
	* Fields: A linked list contains only one field variable: the address of the head node.
	*   It is marked 'public' so that the linked list can be used directly in other methods.
	*******************************************************************************************/
	public Node head;
	
	/*******************************************************************************************
	* Constructor: Create the head of the linked list.  Initially the head is null, 
	*    because the created linked list starts as the empty linked list
	*******************************************************************************************/
	public LinkedList() {
		this.head = null;
	}

	/*******************************************************************************************
	* push() will insert a new node at the beginning of the linked list
	*******************************************************************************************/
	public void push(int newData) 	{

		// Create a new node
		Node newNode = new Node(newData);
      
      newNode.next = this.head;
      this.head = newNode;
      
      
	}

	/*******************************************************************************************
	* insertAfter() will insert a new node after the specified node in the linked list
	*******************************************************************************************/
	public void insertAfter(Node prevNode, int newData) 	{

		// Create a new node
		Node newNode = new Node(newData);
      
      newNode.next = prevNode.next;
      prevNode.next = newNode;
		
	}

	/*******************************************************************************************
	* swapData() will swap the data values of node a and node b of the linked list
	*******************************************************************************************/
	public void swapData(Node a, Node b) {

      int holder = a.data;
      a.data = b.data;
      b.data = holder;
		
	}

	/*******************************************************************************************
	* append() will add a new node to the end of the linked list
	*******************************************************************************************/
	public void append(int newData) {
		// Create a new node
		Node newNode = new Node(newData);

		// If appending to an empty list, the newNode is the new head
		if (this.head == null) {
			this.head = newNode;
		}
		else {
			// newNode is going to be appended to the end, so its successor is null
			newNode.next = null;

			// Find the last node
			Node tempNode = this.head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}

			// After the while is done, tempNode is the last node.  Link it to newNode
			tempNode.next = newNode;
		}
	}

	/*******************************************************************************************
	* printList() will print the entire linked list
	*******************************************************************************************/
	public void printList() {
		// Start at the beginning and traverse the entire list
		Node tempNode = this.head;   
		while (tempNode != null) {
			System.out.print(tempNode.toString() + " ");  
			tempNode = tempNode.next;
		}
		System.out.println();
	}

	
	/*******************************************************************************************
	* remove() will remove the specified node from the linked list
	*******************************************************************************************/
	public void remove(Node removedNode) {

		// There are five possibilites:
		// 1. List has only one node; remove it if it is the right one
		if (this.head.next == null) {
			if (this.head == removedNode) {
				this.head = null;   // result is the empty list
			}
		}

		// 2. Node to be removed is the head node, but there are other nodes in the list
		else if (removedNode == this.head) {
			this.head = this.head.next;
		}

		// 3. Node to be removed is the tail node -- need to traverse the linked list to
		//    get to the predecessor of the tail and make that node the new tail.
		else if (removedNode.next == null) {

				// Find the next-to-last node
				Node tempNode = this.head;
				while (tempNode.next.next != null) {
					tempNode = tempNode.next;
				}
				// After the while loop, tempNode is the next-to-last node (predecessor of
				//   the tail). Set it to null so that the linked list ends one node sooner.
				tempNode.next = null ;  // Now it is the last node
		}

		// 4. The general case: removedNode is somewhere in the middle of the linked list
		//    Modify the list to skip over the removed node -- need to traverse the linked list
		//    to find the predecessor of the removedNode and make it point to removedNode's 
		//    successor.
		else if (this.head != null) {
				// Find removedNode's predecessor
				Node tempNode = this.head;
				while (tempNode.next != removedNode) {
					tempNode = tempNode.next;
				}
				if (tempNode.next == removedNode) {    // make sure we really found the node
					tempNode.next = removedNode.next;   // skip over it
				}
		}
      
		// 5. The remaining case is that the linked list must be empty.  Do nothing.
		else return;

	}
}
