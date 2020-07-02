public class git{

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 5;
		int sum = adder(num1,num2);
		System.out.println("합계 : "+sum);
	}
	private static int adder(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}

}