package kr.hs.dgsw.java.dept1.d0427;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy {

	public void studyArrayList() {
		String[] array = new String[5];
		List<String> list = new ArrayList<String>();
		
		array[0] = "Korea";
		array[1] = "Germany";
		
		
		//리스트에 값을 추가하기
		list.add("Korea");
		list.add("Germany");
		list.add("China");
		
		//값을 읽어오기
		String value = array[0];
		value = array[1];

		value = list.get(0);
		value = list.get(1);

		//배열의 크기
		int sizeOfArray = array.length; // 배열의 전체 크기 {5가 리턴}
		int sizeOfList = list.size();   // 배열의 현재 값이 들어가있는 부분 까지의 크기 {2가 리턴}
		
		
		//특정한 배열 위치에 값 넣기
		list.add(1, "England"); // index위치를 지정을 안하면 맨 뒤에 값이 들어간다. (여기선 1로 지정) 이렇게 했을 때 원래 1의 자리에 있던 데이터는 뒤로 밀려난다
		
//		System.out.println(list.get(2));
		
		//삭제하기
		array[1] = null;
		
		String str = list.remove(1);
		
		System.out.println(str);
	
	}
	
	public static void main(String[] args) {
		ArrayListStudy arrayListStudy = new ArrayListStudy();
		arrayListStudy.studyArrayList();
	}
}
