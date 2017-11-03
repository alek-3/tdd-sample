package money;

class Sum implements Expression{
	Money augend; // 足される数
	Money addend; // 足す数
	Sum(Money augend, Money addend){
		this.augend = augend;
		this.addend = addend;
	}
	public Money reduce(String to) {
		int amount = augend.amount + addend.amount;
		return new Money(amount, to);
	}

}
