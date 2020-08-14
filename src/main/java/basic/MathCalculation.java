package basic;

public class MathCalculation {

	public static void main(String[] args) {
		MathCalculation obj = new MathCalculation();
		obj.add(1, 2);
	}
	protected int add(int a, int b) {
		int c= a + b ;
		System.out.println("sum of two values :"+  a+b);
		return c;
	}

}
