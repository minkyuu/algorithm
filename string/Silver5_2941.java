package string;

import java.util.Scanner;

public class Silver5_2941 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int num = 0;
		
		/*앞에서부터 접근하기
		 *c, d, l, n, s, z 
		 *
		 */
		
		
	}
}

/* 뒤에서 접근하는 코드 (런타임 에러)
 	* 문자열 쪼개기
	* 뒤에서부터 조회하면 -, = 를 빨리 만날 수 있다
	* 문자를 배열에 입력하고
	* 배열의 길이를 출력하면 크로아티아 문자 수 출력 가능
	
for(int i = str.length()-1; i >= 0; i--) {
			String s = String.valueOf(str.charAt(i));
			
			if(s.equals("-")) {
				i--;
				num++;
			}else if(s.equals("=")) {
				// c=, s=, z= , dz=
				if(String.valueOf(str.charAt(i-1)).equals("z")) {
					if((i-1)==0){
						//z=......
						i--;
						num++;
					}
					else if(String.valueOf(str.charAt(i-2)).equals("d")) {
						//z=인 경우 i-2의 접근을 하면 에러가 발생한다.
						//dz=인 경우
						i -= 2;
						num++;
					}else {
						//z=인 경우
						i--;
						num++;
					}
				}else {
					// c= , s=인 경우
					i--;
					num++;
				}
			} else if(s.equals("j")) {
				if(String.valueOf(str.charAt(i-1)).equals("l")) {
					i--;
					num++;
				}else if(String.valueOf(str.charAt(i-1)).equals("n")) {
					i--;
					num++;
				}else 
					num++;
			} else {
				num++;
			}
		}
			
		System.out.println(num);


 */

/* 크로아티아 알파벳
문제
예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

크로아티아 알파벳	변경
č	c=
ć	c-
dž	dz=
đ	d-
lj	lj
nj	nj
š	s=
ž	z=

예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 
위 목록에 없는 알파벳은 한 글자씩 센다.

입력
첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.

단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

출력
입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

예제 입력 1 
ljes=njak
예제 출력 1 
6
예제 입력 2 
ddz=z=
예제 출력 2 
3
예제 입력 3 
nljj
예제 출력 3 
3
예제 입력 4 
c=c=
예제 출력 4 
2
 */
