package ch05.ch06.verify;

public class Fruit {
  private String kind;
  private int price;
  private Brix brix;
  
  //»ý¼ºÀÚ
  Fruit(String kind){
	  this.kind=kind;
  }
  Fruit(String kind,int price){
	  this(kind);
	  this.price=price;
  }
  Fruit(String kind,int price,Brix brix){
	  this(kind,price);
	  this.brix=brix;
  }
  
  public String toString(){
	return kind+","+price+","+brix;
}

  
}
