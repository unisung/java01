package ch05.ch09;

public class Parent {

public static void main(String[] args) {
    Parent p = new Parent();
    Child c;
     if(p instanceof Child)
	    c = (Child)p;	
     else
    	 System.out.println("����ȯ�� �Ҽ� �����ϴ�.");
    
	}
}
class Child extends Parent{}


