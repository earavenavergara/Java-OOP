package singlylinkedlist;

public class SinglyLinkedList {

	public Node head;

	public SinglyLinkedList() {
		this.head = null;
	}

	// Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar
	// nodos a la lista.
	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node runner = head;
			while (runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}

	public void remove() {
		Node runner = head;
		Node runnerAux = null;
		while (runner.next != null) {
			runnerAux = runner;
			runner = runner.next;
		}
		runnerAux.next = null;
	}

	public void printValues() {
		Node runner = head;
		while (runner.next != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
		System.out.println(runner.value);
	}

	public Node find(int value) {
		Node runner = head;
		while (runner.next != null) {
			if (runner.value == value) {
				break;
			}
			runner = runner.next;
		}
		System.out.println("return: " + runner.value);
		return runner;
	}

	public void removeAt(int value) {
		int count = 0;
		Node runner = head;
		while (runner.next != null) {
			if (count == value) {
				runner.next = null;
				break;
			}
			runner = runner.next;
			count++;

		}
	}
}
