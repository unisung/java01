package ch05;
//��������(deep copy)
public class ArrayCopyExample32 {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		//���ο� �迭��ü�� �����Ͽ� �� ��ҵ��� ���� ����
		int[] arr2=new int[arr1.length];
		
		//arr2[0]=arr1[0];
		//arr2[1]=arr1[1];
		//arr2[2]=arr1[2];
		//arr2[3]=arr1[3];
		//arr2[4]=arr1[4];
		for(int i=0;i<arr1.length;i++)
			 arr2[i]=arr1[i];
		
		
		//�迭�� ������
		System.out.print("arr2:\t");
		for(int i=0;i<arr2.length;i++)
		     System.out.print(arr2[i]+"\t");
		System.out.println();
		System.out.print("arr1:\t");
		for(int i=0;i<arr2.length;i++)
		     System.out.print(arr2[i]+"\t");

		
		arr2[2]=99;
		//�迭�� ������
		System.out.println();
		System.out.print("arr1:\t");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+"\t");
		
		System.out.println();
		System.out.print("arr2:\t");
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+"\t");
		

	}

}
