package ch05.ch08.verify;

import java.util.Scanner;

//Scanner�� ���� �Է¹޾Ƽ� Fruit��ü�� �����Ͽ� �迭�� �����ϰ�,
//�Ǹż����� ���� �������� ����
//�Ǹŷ��� ���� ���� ���ϰ�
//�Ǹŷ��� ���� ���� ������ ���
//�Ѽ��Ǹžװ� ����Ǹž��� ���
public class FruitMainExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Fruit�迭 ����
	     Fruit[] fruits = new Fruit[4];
		
	  for(int i=0;i<fruits.length;i++) {
		System.out.println("���ϸ��� �Է��ϼ���>");
		String kind=scanner.next();
		System.out.println("������ �Է��ϼ���>");
	    int price =scanner.nextInt();
	    System.out.println("�絵(LOW,MEDIUM,HIGH)�� �Է��ϼ���>");
	    String brix =scanner.next();
		
		Fruit fruit=new Fruit(kind, price, Brix.valueOf(brix));
		fruits[i]=fruit;
	  }
	  
	   //Fruit f=fruits[0]; f.setSale(20);
	   System.out.println("���Ϻ� �Ǹż��� �Է�");
	   
	 for(int i=0;i<fruits.length;i++) {  
	   System.out.println("������ �Է��ϼ���>");
	   int sale=scanner.nextInt();
	   fruits[i].setSale(sale);
	 }  
	 System.out.println("���� ���");
	 for(int i=0;i<fruits.length;i++)
		 System.out.println(fruits[i].toString());
	 
      double tot=0;
	 //�������� ����
	 for(int i=0;i<fruits.length;i++) {
		 for(int j=i+1;j<fruits.length;j++) {
			 if(fruits[i].getSale()>fruits[j].getSale()) {
				   Fruit f = fruits[i];
				   fruits[i]=fruits[j];
				   fruits[j]=f;
			 }
		 }
	 }
	 
	 //�հ� ���
	 for(int i=0;i<fruits.length;i++)
		  tot+=fruits[i].getPrice()*fruits[i].getSale();
	 
	 
	 System.out.println("���� �� ���� ���");
	 for(int i=0;i<fruits.length;i++)
		 System.out.println(fruits[i].toString());
	 
	 System.out.println("�ּ��Ǹŷ� ��������:"+fruits[0]);
	 System.out.println("�ִ��Ǹŷ� ��������:"+fruits[fruits.length-1]);
	 System.out.println("���Ǹž�:"+tot);
	 System.out.println("����Ǹž�:"+tot/fruits.length);
	 
	   
		/*
		 * //�Ǹż��� apple.setSale(20); banana.setSale(50); mango.setSale(35);
		 * grape.setSale(40);
		 * 
		 * Fruit[] fruits = { apple,banana,mango,grape };
		 * 
		 * for(int i=0;i<fruits.length;i++) { Fruit fruit=fruits[i];
		 * System.out.println(fruit.getKind()+":"+fruit.getSale()
		 * +":"+fruit.getPrice()*fruit.getSale()); }
		 */

	}

}
