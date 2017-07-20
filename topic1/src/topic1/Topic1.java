/*
 *  变量、赋值及计算
 */

package topic1;

import java.util.Scanner;

public class Topic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		float number_1;  // 加数
		float number_2;  // 被加数
		float sum; 
		
		System.out.println("请输入加数");
		number_1 = in.nextFloat();  // 读取加数
		System.out.println("请输入被加数");
		number_2 = in.nextFloat();  // 读取被加数
		in.close(); //  关闭输入
		sum = number_1 + number_2;
		System.out.println("Sum = " + sum);
		
	}

}
