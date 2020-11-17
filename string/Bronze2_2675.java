package string;

import java.util.Scanner;

public class Bronze2_2675 {
	
	public static void main(String[]args) {
		
		/* 1. 처음 입력되는 숫자는 전체 진행할 케이스의 수
		 * 2. 문자열 쪼개기
		 * 3. 공백을 기준으로 앞에는 숫자 , 뒤에는 문자
		 * 4. 앞에 입력된 숫자는 반복될 숫자
		 * 5. 뒤에 입력된 문자열은 하나씩 쪼개서 반복하여 합친다
		 * 6. 합쳐진 문자열을 저장 후 출력하기
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		String[] answer = new String[num];
		
		for (int i = 0; i < num; i++) {
			String s = sc.nextLine();
			int repeat = s.charAt(0)-'0';
			
			String target = s.substring(2);
			String newString ="";
			
			for(int j = 0; j < target.length(); j++) {
			
				
				// append 메서드를 알면 조금 더 깔끔하게 처리가 가능해진다.
				for(int k =0 ; k<repeat; k++) {
					newString += String.valueOf(target.charAt(j));
				}
				
			}
			
			answer[i] = newString;
		}
		
		for(int i = 0; i<num;i++)
			System.out.println(answer[i]);
	}
}


/* 문자열 반복
문제
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
S에는 QR Code "alphanumeric" 문자만 들어있다.

QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. 
S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 

출력
각 테스트 케이스에 대해 P를 출력한다.

예제 입력 1 
2
3 ABC
5 /HTP

예제 출력 1 
AAABBBCCC
/////HHHHHTTTTTPPPPP
 */
