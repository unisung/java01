package ch03.veryfy;
//클래스는 instance를 만들기위한 설계도
public class Stock {
	//속성
	private String item;//접근제한자 private로 접근 제한
	private double qty;//접근제한자 private로 접근 제한
	//기본 생성자
	Stock(){}
	//메소드
	public void setItem(String item){
	   this.item=item;
	}
	// 재고저장메소드
	// 기존 재고+amout;
	public void setQty(int amount){
        qty=amount;
	}
	
	public void inStock(int amount) {
		this.qty=this.qty+amount;
	}

	public double getQty(){
	   return qty;
	}
	// 출고메소드
	//캡슐화를 이용하여 메소드를 완성하고 
	//StockMainExam클래스에서
	//scanner를 이용하여, 재고를 입/출고 해보세요. 
	public void outQty(double amount){
		if(qty-amount<0) return;
		   qty-=amount;	
	}
}
