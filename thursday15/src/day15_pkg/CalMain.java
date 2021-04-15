package day15_pkg;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		Cal c1 = new Cal();
		boolean run=true;
		int select=0;
		int num=0;
		int num2=0;
		double num3=0;
		double num4=0;
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.덧셈 2뺄셈 3곱셈 4.나눗셈");
			System.out.println("---------------------");
			System.out.print("계산>");
			select =scan.nextInt();
		
		if(select==1) {
			System.out.print("숫자 입력:");
			num=scan.nextInt(); num2=scan.nextInt();
			c1.add(num,num2);
		}
		else if(select==2) {
			System.out.print("숫자 입력:");
			num=scan.nextInt(); num2=scan.nextInt();
			c1.sub(num,num2);
		}
		else if(select==3) {
			System.out.print("숫자 입력:");
			num=scan.nextInt(); num2=scan.nextInt();
			int aa=c1.mul(num, num2);
			System.out.println(aa);
		}
		else if (select==4) {
			System.out.println("숫자 입력:");
			num3=scan.nextInt(); num4=scan.nextInt();
			System.out.println(c1.div(num3, num4));
		}else {
			run=false;
			System.out.println("종료");
		}
			
		}
		
	}

}
