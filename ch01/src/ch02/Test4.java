package ch02;

public class Test4 {
	public static void main(String[] args) {
		int birthYear  = 2001; 
        int age = 2020 - birthYear +1;
       
        
        System.out.println("�ȳ��ϼ���	\t������\n");
        System.out.println("\n���� �̸��� \'ȫ�浿\'�Դϴ�.");
        System.out.println("�׸���, ���� �� �� ("+age+")�� �Դϴ�.");
        
        int thisYear=2020;
        int age1=1;
        
        while(birthYear<thisYear) {
        	age1++;
        	birthYear++;
        }
        
        System.out.println("�׸���, ���� �� �� ("+age1+")�� �Դϴ�.");
	}
}
