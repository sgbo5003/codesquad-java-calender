package honux.calender;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//입력: 키보드로 두 수의 입력을 받는다.
		//출력: 화면에 두 수의 합을 출력한다.
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요");
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println("두수의 합은" + (a + b) + "입니다.");
		scanner.close();
		
		
	}

}
