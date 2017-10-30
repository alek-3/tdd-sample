package money;

public class Money {
	protected int amount; // "Protected" enables child class to refer to
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount;
}


}
