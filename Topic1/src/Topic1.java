// 变量及赋值 

import java.util.Scanner;


public class Topic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		int number_1;
		double number_2;
		
		System.out.println("请输入加数");
		number_1 = in.nextInt();
		System.out.println("请输入被加数");
		number_2 = in.nextDouble();
		
		System.out.println("Sum = " +(number_1 + number_2));
	}

}
