package string;

import java.util.Scanner;

public class Bronze2_10809 {

	public static void main(String[] args) {
		String[] alpha = {"a","b","c","d","e","f",
				"g","h","i","j","k","l","m","n","o",
				"p","q","r","s","t","u","v","w","x","y","z"};
		int[] index = new int[26];
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		
		/* 1. 문자열의 인덱스에 따른 알파벳이 무엇인지 파악
		 * 2. 발견한 문자열과 일치하는 공간에 인덱스를 저장할 공간을 만들기
		 * 3. 인덱스 저장하기 전 공간의 값이 -1인지 체크
		 * 4. -1이 있으면 저장하고 아니라면 넘긴다.
		 * 5. 저장되어있는 공간의 인덱스를 출력
		 */
		
		/* 현재 문제는 저장공간을 어떻게 만들 것인가?
		 * 1. 해시, 2. ????
		 */
		
		
	}

}

/* 알파벳 찾기
문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

예제 입력 1 
baekjoon

예제 출력 1 
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1  
 */ 
