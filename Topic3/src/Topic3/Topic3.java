/*
 *  数组
 */


package Topic3;

import java.util.Scanner;

public class Topic3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	
		Scanner in = new Scanner(System.in);
		
		int x;
		double sum = 0;
		int cnt = 0;
		int[] numbers = new int [100];
		
		x = in.nextInt();
		
//		读取数组以-1 结束
		while( x != -1)
		{
			numbers[cnt] = x;
			sum += x;
			cnt++;
			x = in.nextInt();
		}
		in.close();
		
//		若数组中有数据存入则计算平均值，并打印大于平均值的数
		if( cnt > 0)
		{
			double average = sum / cnt;	
			int j = 0;
			
			System.out.println(average);
			
			for(int i = 0; i < cnt; i++ )
			{
				
//				判定是数组中是否数值大于平均数，若有打印数值
				if(numbers[i] > average)
				{
					j++;
					if(j == 1)	
						System.out.println("the number(s) bigger than the average :");
					System.out.println(numbers[i]);
					
				}
			}
			
//			若数组中没有数值大于平均数则打印"there is no......"
			if(j == 0)
			{
				System.out.println("There is no number bigger than average");
			}
		}
	}	
	
}
