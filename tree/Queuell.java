package tree;

public class Queuell <T> {
	Node<T> front;
	Node<T> rear;
	int count;
	
	public Queuell(){
		 front=null;
		 rear=null;
		 count=0;
	}
	
	private class Node<T>{
		T data;
		Node<T> next;
		Node(T data){
			this.data=data;
			this.next=null;
			
		}
	}
	public void add(T val) {
		Node<T> tmp=new Node<T>(val);
		if(rear!=null) {
			rear.next=tmp;
			rear=rear.next;
		}
		else {
			rear=tmp;
			front=tmp;
		}
		count++;
	}
	public T poll() {

		if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue - Queue is empty");
        }
		T val=front.data;
		front=front.next;
		count--;
		if(front==null) {
			rear=null;
		}
		return val;
	}
	public boolean isEmpty() {
		if(front==null&&rear==null) {
			return true;
		}
		return false;
	}
	
}
