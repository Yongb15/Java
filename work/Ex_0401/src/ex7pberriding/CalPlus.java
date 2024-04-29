package ex7pberriding;

public class CalPlus extends Calculator{
	@Override
	public int getResult(int n1, int n2) {
		return super.getResult(n1 + n2);
	}
}
