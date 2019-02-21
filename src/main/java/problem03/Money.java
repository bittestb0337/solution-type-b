package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		Money five  = new Money(this.amount + money.amount);
		return five;
	}

	public Money minus(Money money) {
		Money three  = new Money(this.amount - money.amount);
		return three;
	}

	public Money multiply(Money money) {
		Money ten  = new Money(this.amount * money.amount);
		return ten;
	}

	public Money devide(Money money) {
		Money two  = new Money(this.amount / money.amount);
		return two;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Money){
			Money mi = (Money)obj;
			return amount == mi.amount;
		}
		return false;
	}
}