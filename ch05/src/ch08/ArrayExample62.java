package ch08;

public class ArrayExample62 {
	public static void main(String[] args) {
	//���̰� �ٸ� 1�����迭�� 2���� �迭�����
	int[][] s=new int[][] {{54,76,32},{54,21,65,87},{2,9}};
	for(int[] s1:s) {
		for(int s2:s1) {
			System.out.print(s2+"\t");
		}
		System.out.println();
	}

	}

}
