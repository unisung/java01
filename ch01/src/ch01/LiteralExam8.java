package ch01;
//���ͷ� - �� ������(true / false)
public class LiteralExam8 {
	public static void main(String[] args) {
	//�޼ҵ峻���� ����� ����(��������=���ú���)�� �ݵ�� �ʱ�ȭ �ؾ� ������ ����.
	 boolean isRun = false;//���� �ʱⰪ���� true/false �Է�
	 
	 if(isRun) {
	    System.out.println("����");	 
	 }else {
		 System.out.println("����");
	 }
	 int i=1;
	 while(isRun) {
		 System.out.println("i�� ��="+i);
		 i=i+1;
	 }
	 System.out.println("����");
	}
}
