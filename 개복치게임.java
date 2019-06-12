import java.util.Scanner;
public class Project_01_1604 {

	public static void main(String[] args) {
		//개복치게임을 기반으로 제작하였습니다.
		//만약 모든 질문을 빠르게 확인하기를 원하시다면 처음 질문에는'y' 나머지 모든질문은 'n'로 하시면 빠릅니다.
		
		Scanner sc = new Scanner(System.in);	//게임을 진행하는데 필요한 답변을 입력받도록 하였습니다.
	    String you; String name = ""; int no = 0;	//이 소스에 필요한 변수들을 선언하였습니다.

		System.out.println("개복치 게임을 시작하시겠습니까?");	//이 게임을 실행하기 위한 질문입니다.
		System.out.print("[당신의 답변_Y or N] : ");
		you = sc.next();		//Scanner을 이용하여 답변을 받습니다.
		
		if(you.equalsIgnoreCase("n")) {		//만약 사용자의 대답이 N 또는 n 일 경우를 살핍니다.
			System.out.println();
			System.out.println("아이, 그래도 한번은 해야죠. 시작합니다:)\n그럼, Ready, Go!");
		}//if
		
		System.out.println();
		System.out.print("[개복치의 이름을 적어주세요] : ");		//이 게임을 실행하기 위한 질문입니다.
		you = sc.next();	name = you;		//이때, you에 입력받은 이름을 name에...
		System.out.println(name + "요? 정말 개성이 넘치군요!\n행운이 따르길 빌게요~ 그럼 안녕:)");
		System.out.println();
		
		System.out.println("오늘 정말 날씨가 화창하네요!\n" + name + "은 오늘 같은날 햇빛을 쬐고 싶어서 물이 얕은 곳으로 가고 싶대요!\n[Y : 가게 두자!]  [N : 아니야, 그냥 여기 있자ㅠ]");		//이 게임을 실행하기 위한 질문입니다.
		System.out.println();
		System.out.print("[당신의 선택] : ");
		you = sc.next();		//Scanner을 이용하여 답변을 받습니다.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;		//결과 값을 예측할 수 없게 Math.random함수를 돌립니다.
			if(num==1)	System.out.println("휴~ 다행히도 " + name + "에게 아무 일이 일어나지 않았어요!");
			else{System.out.println("앗 이런..ㅠ 아침의 해가 너무 강해서 그만 죽어버렸어요\n\t------GAME OVER------");
			System.exit(0);		//게임을 곧바로 종료되게 됩니다.
			}
		}else	no++;		//N 또는 n 을 선택한 횟수를 셉니다.
		
		
		System.out.println(name + "은 아침에 움직여서 배가 고픈 모양이에요~\n앗! 저기 있는 굴이 먹고싶다고 하네요?\n[Y : 마음껏 먹게 두자!]  [N : 아니야, 탈나면 어떡할려고ㅠ]");		//이 게임을 실행하기 위한 질문입니다.
		System.out.println();
		System.out.print("[당신의 선택] : ");
		you = sc.next();		//Scanner을 이용하여 답변을 받습니다.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;		//결과 값을 예측할 수 없게 Math.random함수를 돌립니다.
			if(num==1)	System.out.println("휴~ 다행히도 워낙 잘 먹는 " + name + "에게 아무 일이 일어나지 않았어요!");
			else{System.out.println("앗 이런..ㅠ 굴의 껍질이 " + name + "의 내장을 찔른 탓에 그만 죽어버렸어요\n\t------GAME OVER------");
			System.exit(0);		//게임을 곧바로 종료되게 됩니다.
			}
		}else	no++;		//N 또는 n 을 선택한 횟수를 셉니다.
		
		
		System.out.println(name + "은 정말로 배가 고픈 모양이에요~\n앗! 저기 있는 오징어가 먹고싶다고 하네요?\n[Y : 마음껏 먹게 두자!]  [N : 아니야, 탈나면 어떡할려고ㅠ]");		//이 게임을 실행하기 위한 질문입니다.
		System.out.println();
		System.out.print("[당신의 선택] : ");
		you = sc.next();		//Scanner을 이용하여 답변을 받습니다.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;		//결과 값을 예측할 수 없게 Math.random함수를 돌립니다.
			if(num==1)	System.out.println("휴~ 다행히도 위장이 커서 오징어를 10마리 먹은 " + name + "에게 아무 일이 일어나지 않았어요!");
			else{System.out.println("앗 이런..ㅠ " + name + "이 오징어를 너무 많이 먹은 탓에 그만 죽어버렸어요\n\t------GAME OVER------");
			System.exit(0);		//게임을 곧바로 종료되게 됩니다.
			}
		}else {	no++;		//N 또는 n 을 선택한 횟수를 셉니다.
			if(no==3) {
				System.out.println(name + "은... 지금까지 햇빛도 안 쐬고... 배고픈데 밥도 안 먹어서 괴로사했습니다...\n\t------GAME OVER------");
				System.exit(0);		//게임을 곧바로 종료되게 됩니다.
			}//if
		}//if_else
		
		System.out.println("배도 부르고 기분이 좋아진" + name + "은 바닷속을 헤엄치고 싶대요!\n[Y : 헤엄치게 두자!]  [N : 아니야, 그냥 여기 있자ㅠ]");		//이 게임을 실행하기 위한 질문입니다.
		System.out.println();
		System.out.print("[당신의 선택] : ");
		you = sc.next();		//Scanner을 이용하여 답변을 받습니다.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;
			if(num==1)	System.out.println("휴~ 다행히도 " + name + "은 아무도 만나지 않았어요!");
			else{System.out.println("앗 이런..ㅠ 처음보는 바다거북을 보고 너무 무서운 나머지 죽었어요..ㅠ\n\t------GAME OVER------");
			System.exit(0);			}		//게임을 곧바로 종료되게 됩니다.
		}else	no++;		//N 또는 n 을 선택한 횟수를 셉니다.
		
		
		System.out.println("평소에 친구들이 많이 없었던 " + name + "은 저기에 있는 꽃게와 함께 놀고 싶대요!\n[Y : 같이 놀게 두자!]  [N : 아니야, 그냥 여기에 가만히 있자ㅠ]");		//이 게임을 실행하기 위한 질문입니다.
		System.out.println();
		System.out.print("[당신의 선택] : ");
		you = sc.next();		//Scanner을 이용하여 답변을 받습니다.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;
			if(num==1)	System.out.println("하하하 " + name + "은 처음보는 꽃게와 재미있게 놀았어요!");
			else{System.out.println("앗 이런..ㅠ 처음보는 꽃게와 인사를 하다가 집게발에 끼여 죽었어요..ㅠ\n\t------GAME OVER------");
			System.exit(0);		//게임을 곧바로 종료되게 됩니다.
			}
		}else	no++;		//N 또는 n 을 선택한 횟수를 셉니다.
		if(no==5) {
			System.out.println(name + "은... 지금까지...하고싶은 것을 하나도 하지 못해서 괴로사하였습니다 :(\n\t------GAME OVER------");
			System.exit(0);		//게임을 곧바로 종료되게 됩니다.
		}//if
		
		
		System.out.println("이야~ 햇빛이 정말 좋은데요?ㅎㅎ\n" + name + "은 뭍으로 나가서 일광욕을 하고 싶대요!\n[Y : 일광욕을 하게 두자!]  [N : 아니야, 그냥 가만히 있자ㅠ]");		//이 게임을 실행하기 위한 질문입니다.
		System.out.println();
		System.out.print("[당신의 선택] : ");
		you = sc.next();		//Scanner을 이용하여 답변을 받습니다.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;		//결과 값을 예측할 수 없게 Math.random함수를 돌립니다.
			if(num==1)	System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋ 저것 좀 보세요 " + name + "은 많이 까매져서 돌아왔네요!");
			else{System.out.println("앗 이런..ㅠ 일광욕을 하다가 자버린 탓에 말라 죽었어요..ㅠ\n\t------GAME OVER------");
			System.exit(0);		//게임을 곧바로 종료되게 됩니다.
			}
		}else	no++;		//N 또는 n 을 선택한 횟수를 셉니다.
		
		System.out.println("오! 여기까지 " + name + "와 함께 오다니.. 축하드립니다:)\nF11을 눌러서 다시 게임을 해보세요~");	//여기까지 무사히 왔다면 이번게임은 클리어입니다.
	}//main
}//class