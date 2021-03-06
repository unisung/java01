package verify.ch20;

public class Account {
	//필드
	private String ano;//계좌번호
	private String owner;//소유자
	private int balance;//잔고
	//생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	//메소드
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(this.balance +balance >0)// 10000 +(-50000)
		   this.balance += balance;
	}
	
	//toString()
	@Override
	public String toString() {
		return ano + "    "+owner+"    "+balance;
	}
	
	
	
	

}
