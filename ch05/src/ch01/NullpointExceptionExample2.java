package ch01;

public class NullpointExceptionExample2 {
	public static void main(String[] args) {
		//��ü ����
		String str=null;
		str="hello";//���ڿ� ���ͷ��� �����ϸ� new String()ó�� ������
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		
		str="hello";//���ڿ� ���ͷ��� �����ϸ� new String()ó�� ������
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		
		
		str=new String("hello");
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		str=new String("hello");
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		
		String str1=new String("hello");
		System.out.println(str.hashCode());//��ü ����� hash�ڵ尪
		System.out.println(System.identityHashCode(str));//��ü�� ����� ���������� �ּҰ�
		
		//str������ str1 ���������� ����Ű�� ��ü�� �����Ѱ�?false
		System.out.println(str==str1);
		//str������ ����Ű�� ��ü�� ����� str1������ ����Ű�� ��ü�� ������ ������?true
		System.out.println(str.equals(str1));
		
		System.out.println("�ѹ��ڼ�:"+str.length());
		
		

	}

}
