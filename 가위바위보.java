import java.util.Scanner;
public class Report_04_1604 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);																//Scanner�� ����ϱ� ���ؼ� �����Ͽ����ϴ�.		
		String su[] = {"1: ����  ","2: ����  ", "3: ��"};													//�迭�� �̿��ؼ� '����', '����', '��'�� �ʱ�ȭ�Ͽ����ϴ�.
		String num[] = new String[10];																		//������ ����� ǥ���ϱ� ���ؼ� �迭�� �����Ͽ����ϴ�.
		String you = "", computer = "";																		//�ڵ带 �ۼ��ϴµ� �ʿ��� ������ �����Ͽ����ϴ�._(1)
		int input = 0, win = 0, lose= 0, draw = 0, per, ber = 0;											//�ڵ带 �ۼ��ϴµ� �ʿ��� ������ �����Ͽ����ϴ�._(2)

		System.out.println("�١١ٰ��������� ���ۡ١١�");													//������������ �������� �˸��� �����Դϴ�.
		System.out.println("");																				//�Ѵ��� ���� ���� �ٹٲ��� �Ͽ����ϴ�.

		for(int z = 0; z <10; z++){																			//10���� �ݺ�Ƚ���� ������ �����Ƿ� for���� ����Ѵ�.											
			int com = (int)(Math.random()*3)+1;																//Math.random�Լ��� ����ؼ� �������� ���� �Ѵ�.
			System.out.print("���ϴ� ���� �����ϼ��� " + "(" + su[0] + su[1] + su[2] + ")" + " : ");			//����ڰ� ���� �Է��ϱ� ���� �ȳ� �����̴�.
			input = sc.nextInt();																			//�Է¹��� �� �ִ� �ڵ��Դϴ�.

			switch(com){																					//switch-case������ Math.random���� �� ���� ����
				case 1:			computer = "����";		break;												//���� �ٸ� ������ �����ϵ��� �Ͽ����ϴ�.
				case 2:			computer = "����";		break;
				case 3:			computer = "��";			break;
			}//switch_com

			switch(input){																					//switch-case������ ����ڰ� �Է��� ���� ���� ����
				case 1:			you = "����";			break;												//�ٸ� ������ �����ϵ��� �Ͽ����ϴ�.
				case 2:			you = "����";			break;
				case 3:			you = "��";				break;
			}//switch_input

			System.out.print("��ǻ�� : " + computer + "\t\t��� : " + you + "\t\t");							//��ǻ�Ϳ� ����ڰ� ���� � ���� �Է��ߴ��� ����մϴ�.

			if ((input==1)&&(com==1) || (input==2)&&(com==2) || (input==3)&&(com==3)){						//��ǻ�Ϳ� ������� ���� ���� ���� �ٸ� ����� ���
				draw++;	num[ber]="\t\t��";		ber++;
				System.out.println("�����ϴ�^^");
			}else if((input==1)&&(com==2) || (input==2)&&(com==3) || (input==3)&&(com==1)){
				lose++;	num[ber]="\t��";		ber++;
				System.out.println("�����ϴ�..�Ф�");
			}else{
				win++;	num[ber]="��";		ber++;
				System.out.println("�̰���ϴ�! /^0^/");
			}//if

			System.out.println("");																			//�Ѵ��� ���� ���� �ٹٲ��� �Ͽ����ϴ�.
			
		}//for_z

		System.out.println("\t��\t��\t��");																	//����� ���� ǥ�� ù ���� �����Ͽ����ϴ�.
		System.out.println("");																				//�Ѵ��� ���� ���� �ٹٲ��� �Ͽ����ϴ�.
		
		for (int i = 1; i <= 10; i++){																		//for���� �̿��Ͽ� ����� ���� ǥ�� ����Ͽ����ϴ�.
				System.out.println(i + "ȸ\t" + num[i-1]);													//"_ȸ	��"�̷� ������ ����� �������� �����Ͽ����ϴ�.
		}//for_i

		per = win*10;																						//Ȯ���� ����Ͽ� �ٸ� ������ ������ �Ͽ����ϴ�.
		System.out.println();																				//�Ѵ��� ���� ���� �ٹٲ��� �Ͽ����ϴ�.
		System.out.println("����� �� " + win + "�� �̱��, " + draw + "�� ����, " + lose + "�� �����ϴ�.");//�� �� ��/��/������ ����մϴ�.
		System.out.println("�·��� "+ per +"% �Դϴ�.");														//�Ʊ� Ȯ���� ����� ������ �ҷ��� ������ ������ �����մϴ�.
	}//main
}//class