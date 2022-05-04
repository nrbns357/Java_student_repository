package kr.hs.dgsw.java.dept1.d0504;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class ListStudy {
	private void study() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		List<String> stack = new Stack<String>();
		
		list1.add("Korea");
		list2.add("Korea");
		stack.add("Korea");

		
		list1.add("gana");
		list2.add("gana");
		stack.add("gana");
		
		System.out.println(list1.get(0));
		System.out.println(list2.get(0));
		System.out.println(stack.get(0));
		
		Stack<String> stack1 = (Stack<String>)stack;
		System.out.println(stack.get(0));
		stack1.push("ProTugal");
		//stack.push("Uruguay");	
		}
	
	public static void main(String[] args) {
		ListStudy study = new ListStudy();
		study.study();
	}
}
