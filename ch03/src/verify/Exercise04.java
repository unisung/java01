package verify;

public class Exercise04 {
	public static void main(String[] args) {
		int pencils=534;
		int students=30;
		
		int pencilsPerStudent = pencils/students;//����/����->���� (��)
		int pencilsLeft = pencils%students;//����%���� ->���� (������)
		
		System.out.println("�� �л��� :"+pencilsPerStudent+"��");
		System.out.println("������:"+pencilsLeft+"��");

	}
}
