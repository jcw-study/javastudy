public class Sum100 {

	public static void main(String[] args) {
		System.out.println("1. 1부터 100까지 합을 구하세요.");
		int sum =0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("합계 : "+sum);
		System.out.println();
	}

}
