package Topic3;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int[] numbers = new int[10];
		int x;
		
		x = in.nextInt();

//		读入数值并保持到数组中，若读入-1则停止读入
		while( x != -1)
		{
			if(x >=0 && x <= 9)
			{
				numbers[x]++;
			}
			x = in.nextInt();
		}
		
		for(int i =0; i < 10; i++)
			System.out.println(i + " : " + numbers[i]);
	}
}
