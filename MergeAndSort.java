import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Node1 {
	int key;
	Node1 next;

	public Node1(int key) {
		this.key = key;
		next = null;
	}
}

public class MergeAndSort {

	public static Node1 newNode(int key) {
		return new Node1(key);
	}


	public static void main(String[] args) {

		Node1 c = new Node1(2);
		c.next = new Node1(15);
		c.next.next = new Node1(3);
		c.next.next.next = new Node1(30);

		Node1 d = new Node1(6);
		d.next = new Node1(7);
		d.next.next = new Node1(60);

		List<Integer> p = new ArrayList<>();
		while (c != null) {
			p.add(c.key);
			c = c.next;
		}

		while (d != null) {
			p.add(d.key);
			d = d.next;
		}

		Collections.sort(p);
		Node1 res = new Node1(-1);
		Node1 temp = res;
		for (int j = 0; j < p.size(); j++) {
			res.next = new Node1(p.get(j));
			res = res.next;
		}

		temp = temp.next;
		System.out.print(" Merged Linked List  : ");
		while (temp != null) {
			System.out.print(temp.key + " ");
			temp = temp.next;
		}
	}
}

