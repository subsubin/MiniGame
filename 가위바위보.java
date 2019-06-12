import java.util.Scanner;
public class Report_04_1604 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);																//Scanner을 사용하기 위해서 선언하였습니다.		
		String su[] = {"1: 가위  ","2: 바위  ", "3: 보"};													//배열을 이용해서 '가위', '바위', '보'를 초기화하였습니다.
		String num[] = new String[10];																		//각각의 결과를 표시하기 위해서 배열을 생성하였습니다.
		String you = "", computer = "";																		//코드를 작성하는데 필요한 변수를 선언하였습니다._(1)
		int input = 0, win = 0, lose= 0, draw = 0, per, ber = 0;											//코드를 작성하는데 필요한 변수를 선언하였습니다._(2)

		System.out.println("☆☆☆가위바위보 시작☆☆☆");													//가위바위보를 시작함을 알리는 문구입니다.
		System.out.println("");																				//한눈에 보기 쉽게 줄바꿈을 하였습니다.

		for(int z = 0; z <10; z++){																			//10번의 반복횟수가 정해져 있으므로 for문을 사용한다.											
			int com = (int)(Math.random()*3)+1;																//Math.random함수를 사용해서 무작위로 고르게 한다.
			System.out.print("원하는 값을 선택하세요 " + "(" + su[0] + su[1] + su[2] + ")" + " : ");			//사용자가 값을 입력하기 위한 안내 문장이다.
			input = sc.nextInt();																			//입력받을 수 있는 코드입니다.

			switch(com){																					//switch-case문으로 Math.random으로 고른 수에 따른
				case 1:			computer = "가위";		break;												//값을 다른 변수에 저장하도록 하였습니다.
				case 2:			computer = "바위";		break;
				case 3:			computer = "보";			break;
			}//switch_com

			switch(input){																					//switch-case문으로 사용자가 입력한 수에 따른 값을
				case 1:			you = "가위";			break;												//다른 변수에 저장하도록 하였습니다.
				case 2:			you = "바위";			break;
				case 3:			you = "보";				break;
			}//switch_input

			System.out.print("컴퓨터 : " + computer + "\t\t당신 : " + you + "\t\t");							//컴퓨터와 사용자가 각각 어떤 수를 입력했는지 출력합니다.

			if ((input==1)&&(com==1) || (input==2)&&(com==2) || (input==3)&&(com==3)){						//컴퓨터와 사용자의 값에 따라서 각각 다른 결과를 출력
				draw++;	num[ber]="\t\t○";		ber++;
				System.out.println("비겼습니다^^");
			}else if((input==1)&&(com==2) || (input==2)&&(com==3) || (input==3)&&(com==1)){
				lose++;	num[ber]="\t○";		ber++;
				System.out.println("졌습니다..ㅠㅠ");
			}else{
				win++;	num[ber]="○";		ber++;
				System.out.println("이겼습니다! /^0^/");
			}//if

			System.out.println("");																			//한눈에 보기 쉽게 줄바꿈을 하였습니다.
			
		}//for_z

		System.out.println("\t승\t패\t무");																	//결과에 따른 표의 첫 행을 구성하였습니다.
		System.out.println("");																				//한눈에 보기 쉽게 줄바꿈을 하였습니다.
		
		for (int i = 1; i <= 10; i++){																		//for문을 이용하여 결과에 따른 표를 출력하였습니다.
				System.out.println(i + "회\t" + num[i-1]);													//"_회	○"이런 식으로 결과가 나오도록 구성하였습니다.
		}//for_i

		per = win*10;																						//확률을 계산하여 다른 변수에 저장을 하였습니다.
		System.out.println();																				//한눈에 보기 쉽게 줄바꿈을 하였습니다.
		System.out.println("당신은 총 " + win + "번 이기고, " + draw + "번 비기고, " + lose + "번 졌습니다.");//몇 번 이/졌/비겼는지 출력합니다.
		System.out.println("승률은 "+ per +"% 입니다.");														//아까 확률을 계산한 변수를 불러와 마지막 문장을 실행합니다.
	}//main
}//class