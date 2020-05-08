package ch10.ch01;

public class Television {
	//static멤버
	static String company="samsong";
	static String model;
	static String info;
	static int seq;
    //인스턴스 맴버
	String iInfo;
    
	//static초기화
	static{
		model="UHD4K";
		info=company+model;
	}
	//생성자
	Television(){ 
		iInfo=info + ++seq;
	}
	@Override
	public String toString() {
		return "Television [iInfo=" + iInfo + "]";
	}
	
	
}
