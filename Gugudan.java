public class Gugudan {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
				System.out.println("***"+i+"단***");
				for(int k=1;k<=9;k++) {
					System.out.println(i+"X"+k+"="+i*k);
				}
		}
		System.out.println();
	}

}