package string;

import java.util.Scanner;

public class Bronze2_5622 {

	public static void main(String[] args) {
		
		/* 문자열의 문자의 수가 몇인지 파악하기 위해서
		 * 0.문자열 짜르기
		 * 1.문자 파악하고 맞는 숫자로 변환하기
		 *   - 문자를 문자열로 바꿔서
		 *   - 메서드에 넣어주기
		 * 2.변환된 숫자를 합쳐서
		 * 3.출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int sum = 0;
		
		for(int i = 0; i<str.length(); i++) {
			String s = String.valueOf(str.charAt(i));
			sum += getNum(s);
		}
		
		System.out.println(sum);
	}
	
	public static int getNum(String s) {
		int num = 0;
		
		if(s.equals(null)||s.equals(" "))
			num = 1;
		if(s.equals("A")||s.equals("B")||s.equals("C"))
			num = 2;
		if(s.equals("D")||s.equals("E")||s.equals("F"))
			num = 3;
		if(s.equals("G")||s.equals("H")||s.equals("I"))
			num = 4;
		if(s.equals("J")||s.equals("K")||s.equals("L"))
			num = 5;
		if(s.equals("M")||s.equals("N")||s.equals("O"))
			num = 6;
		if(s.equals("P")||s.equals("Q")||s.equals("R")||s.equals("S"))
			num = 7;
		if(s.equals("T")||s.equals("U")||s.equals("V"))
			num = 8;
		if(s.equals("W")||s.equals("X")||s.equals("Y")||s.equals("Z"))
			num = 9;
		
		return num+1;
	}
}

/* 다이얼
문제
상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.
전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 
숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 
한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 
즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 
예를 들어, UNUCIC는 868242와 같다.

할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어는 2글자~15글자로 이루어져 있다.

출력
첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.

예제 입력 1 
UNUCIC
예제 출력 1 
36
 */

