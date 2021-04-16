package day15_pkg;

import java.util.*;
public class Ex2_ArrListEx {

	public static void main(String[] args) {
		/*
		 * ArrayList에 영어로 된 단어 5개를 스캐너로 입력 받고
		 * 입력받은 단어를 모두 출력하고
		 * 마지막에는가장 긴 단어를 출력하세요.
		 */
		
		
		List<String>list=new ArrayList<String>();
		Scanner scan=new Scanner(System.in);
		String val="";
		int longword=0;
		for(int i=0; i<5; i++) {
			System.out.print("단어를 입력하세요 :");
			val = scan.next();		
			list.add(val);
			//list.add(scan.next());
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).length()>list.get(longword).length()) {
				longword=i;
			}
		}System.out.println("가장 긴 단어는 :"+list.get(longword));
		
		
	
	}

}
