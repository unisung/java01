package ch04;
//StringŸ���� ����Ÿ�� �����Ҽ� �ִ� ���̰� 5�� �迭�� �����
//�迭�� index��ȣ�� ¦����°(index��ȣ�� 0,2,4)�� ��ҿ� 
//���� "hello", "hi", "hey" ��
//�Է��ϰ� ������ ����ϼ���.
public class ArrayExample27 {
	public static void main(String[] args) {
	 //String[] strArr = new String[5];
	// System.out.println(strArr[0]);
	 //strArr[0]="hello";//���ͷ��� String��ü ����
	 //strArr[2]=new String("hi");//new String()���� ��ü ����
	 //String str="hey";
	 //strArr[4]=str;
	 String[] strArr = {"hello",null,"hi",null,"hey"};
	 
	 //int i=0;
	 for(int i=0;i<strArr.length;i+=2) {
		 System.out.println(strArr[i]);
	 }
	 //System.out.println(strArr[i]);//
	 //System.out.println(strArr[i+=2]);
	 //System.out.println(strArr[i+=2]);
	 
	 
	 

	}

}
