package ch02;

public class WhileKeyControlExample {
	public static void main(String[] args)/*throws Exception */{
	 boolean run=true;
	 int speed=0;
	 int keyCode=0;
	 
	 while(run) {
		 if((keyCode!=13)&&(keyCode!=10)) {//EnterŰ
			 System.out.println("------------------");
			 System.out.println("1.���� |2.���� |3.����");
			 System.out.println("------------------");
			 System.out.print("����:");
		 }
		 
		 try {
		 keyCode=System.in.read();
		  }catch(Exception e) {System.out.println(e.getMessage());}
		 if(keyCode==49) {//Ű���� ����1
			 speed++;
			 System.out.println("����ӵ�="+speed);
		 }else if(keyCode==50) {//Ű���� ����2
			 speed--;
			 System.out.println("����ӵ�="+speed);
		 }else if(keyCode ==51) {//Ű���� ����3
			 run=false;
		 }		 
	 }//while��.
	  System.out.println("���α׷� ����");
	}
}
