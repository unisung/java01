package ch06;

public class ArrayExample41 {
	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][0]=70;
		scores[0][1]=80;
		scores[0][2]=90;
		
		scores[1][0]=80;
		scores[1][1]=70;
		scores[1][2]=90;
		
		for(int i=0;i<scores.length;i++) {//2�����迭�� ���Ǽ� 2�����迭��.length
			for(int j=0;j<scores[i].length;j++) {//�� ���� 1�����迭�� ��Ұ��� 2�����迭��[���ȣ].length
			 System.out.print(scores[i][j]+"\t");
			}
			System.out.println();//���� �Ʒ���
		}
		
	    for(int i=0;i<scores[0].length;i++)
	    	System.out.println(scores[0][i]);
	    
	    for(int i=0;i<scores[1].length;i++)
	    	System.out.println(scores[1][i]);
	    
	    
	    	 for(int j=0;j<scores[0].length;j++)
	    		 System.out.print(scores[0][j]+"\t");
			
		

	}

}
