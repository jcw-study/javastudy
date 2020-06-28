import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		System.out.println("10.로그인 기능을 구현하세요");

		String id = "pink";
		String pwd = "pn1234";

		Scanner in = new Scanner(System.in);

		System.out.print("아이디를 입력하세요 : ");
		String in_id = in.nextLine();
		System.out.print("비밀번호를 입력하세요.");
		String in_pwd = in.nextLine();

		if(in_id.equals(id)) {
			if(in_pwd.equals(pwd)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

}