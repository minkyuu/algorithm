package string;

import java.util.Scanner;

class Bronze2_1152 {

	/*
	 * 문제 풀이 
	 * 1.띄어쓰기를 한 부분의 인덱스정보를 얻어내기 
	 * 2.indexOf(String str, int startIndex) 메서드를 이용한다 
	 * 문자열 str을 찾는다 , startIndex부터 검색하기 시작 띄어쓰기가 없는 한 단어인 경우 indexOf이 -1값이 반환된다
	 * 띄어쓰기가 하다가 마지막 단어를 만나면 결국 띄어쓰기가 없기 때문에 -1이 나온다 
	 * 문자열의 앞과 뒤에는 공백이 있을 수 있다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * 입력에 단순히 공백만 입력했을 시 처리가 필요하다
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int idx = 0;
		int word = 0;

		if (!(str.equals(" "))) {

			if (str.startsWith(" "))
				str = str.substring(1, str.length());

			if (str.endsWith(" "))
				str = str.substring(0, str.length() - 1);

			do {
				idx = str.indexOf(" ", idx);
				word += 1;
				if (idx != -1)
					idx += 1;

			} while (idx != -1);
		}
		
		System.out.println(word);
	}

}

/* 단어의 개수
 * 문제
 * 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 
 * 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 * 
 * 입력 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 
 * 이 문자열의 길이는 1,000,000을 넘지 않는다. 
 * 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 
 * 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.
 * 
 * 출력 첫째 줄에 단어의 개수를 출력한다.
 * 
 * 예제 입력 1 
 * The Curious Case of Benjamin Button 
 * 예제 출력 1 
 * 6
 * 
 * 예제 입력 2 
 * Mazatneunde Wae Teullyeoyo 
 * 예제 출력 2 
 * 3
 * 
 * 예제 입력 3 
 * Teullinika Teullyeotzi 
 * 예제 출력 3 
 * 2
 * 
 */
