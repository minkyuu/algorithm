package string;

import java.util.Scanner;

public class Bronze5_11654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int c = str.charAt(0);
		
		System.out.println(c);
	}
}

/* 아스키 코드
문제
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

입력
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

출력
입력으로 주어진 글자의 아스키 코드 값을 출력한다.

예제 입력 1 
A
예제 출력 1 
65
예제 입력 2 
C
예제 출력 2 
67
예제 입력 3 
0
예제 출력 3 
48
예제 입력 4 
9
예제 출력 4 
57
예제 입력 5 
a
예제 출력 5 
97
예제 입력 6 
z
예제 출력 6 
122
 */ 
