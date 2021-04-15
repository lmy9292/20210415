package day15_pkg;

import java.util.*;
public class ArrList {

	public static void main(String[] args) {
		/*
		 * ArrayList
		 * Collection Framework :List,Set,Map
		 */
		//ArrayList 선언(저장데이터 타입: String)
		ArrayList<String> list =new ArrayList<String>();
		
		//list 에 데이터 저장 :add 메소드 호출
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add(1,"네번째");
		list.add(1,"다섯번째");
		//list에 담긴 데이터 출력
		System.out.println(list.get(0));//0은 인덱스 번호
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//list 크기 확인
		System.out.println(list.size());
		
		//list 데이터 삭제
		list.remove(1);//1 : 인덱스 값
		System.out.println(list.get(1));
		
		//for문을 이용하여  list에 담긴 모든 데이터 출력
		for(int i=0; i<	list.size(); i++) {
			System.out.println(list.get(i));
		}
		//list에 정수를 저장할 때
		//<>:Genenic 여기에는 클래스 이름만 올수있다
		List<Integer> list1=new ArrayList<Integer>();//Wrapper Class:Integer 감싸고 있는 것
		
		String var="값"; 
		 
		
	}

}
