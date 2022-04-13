package kr.hs.dgsw.java.dept1.d0413;
import java.util.ArrayList;

public class Queue {
	
	public static final int SIZE = 10;
	
	private final String[] buffer;
	
	private int index, bottom;
	
	public Queue() {
	this.buffer = new String[SIZE];
	this.index = 0;
	this.bottom = 0;
	}
	public void add(String value) {
		if(this.index >= SIZE) {
			throw new RuntimeException("Full");
		}
		
		this.buffer[this.index] = value;
		this.index++;
	}
	
	public String poll() {
		if(this.index == 0) {
			throw new RuntimeException("Empty");
		}
		
		String result = this.buffer[0];
		this.index--;
		for(int i=0; i < this.index; i++) {
			this.buffer[i] = this.buffer[i + 1];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.add("Dog");
		queue.add("Lion");
		queue.add("Shark");
		queue.add("Butterfly");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
