package money;

class Money {
	protected int amount; // "Protected" enables only child class to refer to
	protected String currency;

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	Money times(int muliplier) {
		return new Money(amount * muliplier, currency);
	};

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& currency.equals(money.currency);
	}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

}
