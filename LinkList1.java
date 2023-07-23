class LinkList1 {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int v)
		{
			data = v;
			next = null;
		}
	}

	/* Function to remove duplicates from an
	unsorted linked list */
	void remove_dups()
	{
		Node ptr1 = null, ptr2 = null, dup = null;
		ptr1 = head;

		/* get elements one by one */
		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;

			/* Comp picked element with rest
				 elements */
			while (ptr2.next != null) {

				/* If duplicate  delete it */
				if (ptr1.data == ptr2.next.data) {

					
					ptr2.next = ptr2.next.next;
					System.gc();
				}
				else  {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
	}

	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args)
	{
		LinkList1 l1 = new LinkList1();
		l1.head = new Node(7);
		l1.head.next = new Node(15);
		l1.head.next.next = new Node(14);
		l1.head.next.next.next = new Node(14);
		l1.head.next.next.next.next = new Node(17);
		l1.head.next.next.next.next.next = new Node(11);
		l1.head.next.next.next.next.next.next
			= new Node(7);

		System.out.println(
			"LinkedList before rem duplicates : ");
		l1.printList(head);

		l1.remove_dups();
		System.out.println("\n");
		System.out.println(
			"LinkedList after rem duplicates : ");
		l1.printList(head);
	}
}
