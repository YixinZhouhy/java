/*
 *  ��������ֵ������
 */

package topic1;

import java.util.Scanner;

public class Topic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		float number_1;  // ����
		float number_2;  // ������
		float sum; 
		
		System.out.println("���������");
		number_1 = in.nextFloat();  // ��ȡ����
		System.out.println("�����뱻����");
		number_2 = in.nextFloat();  // ��ȡ������
		in.close(); //  �ر�����
		sum = number_1 + number_2;
		System.out.println("Sum = " + sum);
		
	}

}
