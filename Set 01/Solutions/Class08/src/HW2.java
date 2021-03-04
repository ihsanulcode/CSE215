
public class HW2 {

	public static void main(String[] args) {
		Queue queue = new Queue();

		// assigning values to queue
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i + 1);
		}

		//printing
		System.out.println("Display:");
		int size = queue.getSize();
		for (int j = 0; j < size; j++) {
			System.out.println(queue.dequeue());
		}

	}

}

class Queue {
	int[] elements;
	int size;

	Queue() {
		elements = new int[8];
	}

	void enqueue(int v) {
		if (size >= elements.length) {
			int[] arr = new int[elements.length * 2];
			System.arraycopy(elements, 0, arr, 0, elements.length);
			elements = arr;
		}
		elements[size] = v;
		size++;
	}

	int dequeue() {

		int[] arr = new int[elements.length - 1];
		int num = elements[0];

		System.arraycopy(elements, 1, arr, 0, elements.length - 1);
		elements = arr;
		size--;
		return num;
	}

	boolean empty() {
		
		return size == 0;
	}

	int getSize() {
		
		return size;
	}

}
