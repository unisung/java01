package ch02;

import java.util.Scanner;

public class InfinityAndNaNCheckExample2 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
		int x=5;
		double y;
		
		System.out.println("�Ǽ��� �Է��ϼ���:");
		y=scanner.nextDouble();
        
		double  z=x%y;
		
        if(Double.isNaN(z)){
        	System.out.println("���Ұ�");
        }else {
        	System.out.println(z+2); 
        }
	}

}
