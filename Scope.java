public class git{

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 5;
		int hap = adder(num1,num2);
		System.out.println("합계 : "+hap);
	}
	private static int adder(int num1, int num2) {
		int hap;
		hap = num1 + num2;
		return hap;
	}

}