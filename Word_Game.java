package 자바방과후;
import java.util.Scanner;

public class Word_Game {

	public static void main(String[] args) {
		String strArr[] = {"loveyourself", "iloveyou", "comebackhome", "둘!셋!(좋은날이더많기를)", "jenny"};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			String answer = getAnswer(strArr);
			String question= getScrambledWord(answer);
			char hint[] = new char[answer.length()];
			
			for(int i = 0; i < hint.length; i++) {
				hint[i] = '_';
			}//for
			
			while(true) {
				
				System.out.println("Question : " +  question);
				System.out.print("정답(종료: q 또는 Q) : ");
				String input = sc.next();		//사용자로부터 정답을 입력받는다
				
				if(input.equals("q") || input.equals("Q")) {		//equalsIgnoreCase를 사용해도 된다
					System.exit(0);		//사용자가 q 또는 Q를 입력하면 프로그램을 종료한다.
				}
				
				if(input.equalsIgnoreCase(answer)) {
					System.out.println("정답입니다 /^_^/");
					System.out.println(" ");
					break;
				} else {
					System.out.println(input+"은(는) 정답이 아닙니다. 다시 입력해주세요ㅠㅠ");
					System.out.println("Hint : " + getHint(answer,hint));
					System.out.println(" ");
				}	//사용자가 정답을 맞출 때 까지 반복하다가 맞추면 반복문을 빠져나간다.
			}//while_2
		}//while_1
	}//main
	
	
	public static String getHint(String answer, char hint[]) {
		int count = 0;
		
		for(int i = 0; i < hint.length; i++) {
			if(hint[i]=='_')
				count++;
		}//for_i
		
		if(count>2) {
			while(true) {
				int idx = (int)(Math.random()*answer.length());
				
				if(hint[idx]=='_') {
					hint[idx] = answer.charAt(idx);
					break;
				}//if
				
			}//while
		}//if
		return new String(hint);
	}//getHint
	
	
	public static String getAnswer(String strArr[]) {
		
		return strArr[(int)(Math.random()*strArr.length)];
	}//getAnswer
	
	
	public static String getScrambledWord(String str) {
		
		char chArr[]= str.toCharArray();
		
		for(int i=0; i < 10; i++) {
			
			int idx = (int)(Math.random() * chArr.length);//String을 Char배열로 변환; toCharArrat()사용
			
			char temp = chArr[0];//for문을 이용해서 배열의 위치를 랜덤으로 바꾼다.
			chArr[0] = chArr[idx];
			chArr[idx] = temp;
		}//for
		
		return new String(chArr);//Char배열을 String으로 변환
	}//getScrambledWord
	
}//class