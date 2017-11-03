package money;

public interface Expression {
	// 式の意
	Money reduce(Bank bank, String to);

}
