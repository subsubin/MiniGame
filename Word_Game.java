package �ڹٹ����;
import java.util.Scanner;

public class Word_Game {

	public static void main(String[] args) {
		String strArr[] = {"loveyourself", "iloveyou", "comebackhome", "��!��!(�������̴����⸦)", "jenny"};
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
				System.out.print("����(����: q �Ǵ� Q) : ");
				String input = sc.next();		//����ڷκ��� ������ �Է¹޴´�
				
				if(input.equals("q") || input.equals("Q")) {		//equalsIgnoreCase�� ����ص� �ȴ�
					System.exit(0);		//����ڰ� q �Ǵ� Q�� �Է��ϸ� ���α׷��� �����Ѵ�.
				}
				
				if(input.equalsIgnoreCase(answer)) {
					System.out.println("�����Դϴ� /^_^/");
					System.out.println(" ");
					break;
				} else {
					System.out.println(input+"��(��) ������ �ƴմϴ�. �ٽ� �Է����ּ���Ф�");
					System.out.println("Hint : " + getHint(answer,hint));
					System.out.println(" ");
				}	//����ڰ� ������ ���� �� ���� �ݺ��ϴٰ� ���߸� �ݺ����� ����������.
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
			
			int idx = (int)(Math.random() * chArr.length);//String�� Char�迭�� ��ȯ; toCharArrat()���
			
			char temp = chArr[0];//for���� �̿��ؼ� �迭�� ��ġ�� �������� �ٲ۴�.
			chArr[0] = chArr[idx];
			chArr[idx] = temp;
		}//for
		
		return new String(chArr);//Char�迭�� String���� ��ȯ
	}//getScrambledWord
	
}//class