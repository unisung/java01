package ch06.ch02;

public class ReferencePassingExample {
	public static void main(String[] args) {
		//�迭��ü ����
	   int[] arr= {1,2,3,4,5};
	   //�迭������ arr�� �ּҰ� ����
	   arrayMethod(arr);
	   //�޼ҵ� ���� �� �� ���
	   for(int i=0;i<arr.length;i++)
		   System.out.println(arr[i]);
	}
	//�Ű������� �ּҰ��� ����.
	static void arrayMethod(int[] intArray) {
		intArray[2]=99;
		for(int i=0;i<intArray.length;i++)
		System.out.println(intArray[i]);
	}

}
