package ch02;

public class VariableScope1 {
	public static void main(String[] args) {
	  int var1;//main�޼ҵ峻���� ����� ���ú��� 
	  
	   if(true) {
		  int var2;
		  int var22;
		  var1=10;//main�޼ҵ峻�� if������ ��밡��
		  var2=20;
		  System.out.println("var1="+var1);
		  System.out.println("var2="+var2);
		 // System.out.println("var3="+var3); �ٸ� ������ �������Ұ�
	   }
	   
	   for(int i=0;i<10;i++) {
		   int var3;
		   int var4;
		   var3=i;//�������� var3�� �������� i�� ���� ����
		   var1=20;//main�޼ҵ峻�� for������ ��밡��
		   System.out.println("var3="+var3);
		   System.out.println("var1="+var1);
		   //System.out.println("var2="+var2); �ٸ������� ���� ���Ұ�
	   }
	   
	   System.out.println("var1="+var1);//main�޼ҵ峻���� ��밡��
	   //System.out.println("var2="+var2);//���������� ����� ������ ���������� ���Ұ�
	   //System.out.println("var3="+var3);//���������� ����� ������ ���������� ���Ұ�
	   
	}
}
