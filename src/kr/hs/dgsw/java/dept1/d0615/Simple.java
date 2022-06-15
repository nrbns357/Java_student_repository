package kr.hs.dgsw.java.dept1.d0615;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Simple {

private Object value;
	
	public Object getValue() {
		return value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Simple simple = new Simple();
		simple.setValue(7);
		simple.setValue("afafafa");
		simple.setValue(new Date());
		
		Date date = (Date)simple.getValue();
		
		
		List list = new ArrayList();
		list.add("hello");
		list.add(134);
		list.add(new Date());
		
		String hello = (String)list.get(0);
		
		
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		
	}
}
