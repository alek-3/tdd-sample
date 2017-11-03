package money;

public interface Expression {
	// 式の意
	Expression times(int multipier);
	Expression plus(Expression addend);
	Money reduce(Bank bank, String to);

}
