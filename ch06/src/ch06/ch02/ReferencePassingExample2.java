package ch06.ch02;

public class ReferencePassingExample2 {
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
		//���ο� �迭 ����
		int[] arr2=new int[intArray.length];
		//�迭�� �� ��� ����
		for(int i=0;i<arr2.length;i++)
			 arr2[i]=intArray[i];
		//���ο� �迭�� ��Ұ� ����
		arr2[2]=99;
		for(int i=0;i<arr2.length;i++)
		System.out.println(arr2[i]);
	}

}
