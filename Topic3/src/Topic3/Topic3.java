/*
 *  ����
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
		
//		��ȡ������-1 ����
		while( x != -1)
		{
			numbers[cnt] = x;
			sum += x;
			cnt++;
			x = in.nextInt();
		}

		
//		�������������ݴ��������ƽ��ֵ������ӡ����ƽ��ֵ����
		if( cnt > 0)
		{
			double average = sum / cnt;	
			
			System.out.println(average);
			
			for(int i = 0, j = 0; i < cnt; i++ )
			{
				if(numbers[i] > average)
				{
					System.out.println("the number(s) bigger than the average :");
					System.out.println(numbers[i]);
					j++;
				}
				if(j == 0)
				{
					System.out.println("There is no number bigger than average");
				}
			}
		}
		
	}

}