import java.util.Scanner;
public class Project_01_1604 {

	public static void main(String[] args) {
		//����ġ������ ������� �����Ͽ����ϴ�.
		//���� ��� ������ ������ Ȯ���ϱ⸦ ���Ͻôٸ� ó�� ��������'y' ������ ��������� 'n'�� �Ͻø� �����ϴ�.
		
		Scanner sc = new Scanner(System.in);	//������ �����ϴµ� �ʿ��� �亯�� �Է¹޵��� �Ͽ����ϴ�.
	    String you; String name = ""; int no = 0;	//�� �ҽ��� �ʿ��� �������� �����Ͽ����ϴ�.

		System.out.println("����ġ ������ �����Ͻðڽ��ϱ�?");	//�� ������ �����ϱ� ���� �����Դϴ�.
		System.out.print("[����� �亯_Y or N] : ");
		you = sc.next();		//Scanner�� �̿��Ͽ� �亯�� �޽��ϴ�.
		
		if(you.equalsIgnoreCase("n")) {		//���� ������� ����� N �Ǵ� n �� ��츦 ���̴ϴ�.
			System.out.println();
			System.out.println("����, �׷��� �ѹ��� �ؾ���. �����մϴ�:)\n�׷�, Ready, Go!");
		}//if
		
		System.out.println();
		System.out.print("[����ġ�� �̸��� �����ּ���] : ");		//�� ������ �����ϱ� ���� �����Դϴ�.
		you = sc.next();	name = you;		//�̶�, you�� �Է¹��� �̸��� name��...
		System.out.println(name + "��? ���� ������ ��ġ����!\n����� ������ ���Կ�~ �׷� �ȳ�:)");
		System.out.println();
		
		System.out.println("���� ���� ������ ȭâ�ϳ׿�!\n" + name + "�� ���� ������ �޺��� �ذ� �; ���� ���� ������ ���� �ʹ��!\n[Y : ���� ����!]  [N : �ƴϾ�, �׳� ���� ���ڤ�]");		//�� ������ �����ϱ� ���� �����Դϴ�.
		System.out.println();
		System.out.print("[����� ����] : ");
		you = sc.next();		//Scanner�� �̿��Ͽ� �亯�� �޽��ϴ�.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;		//��� ���� ������ �� ���� Math.random�Լ��� �����ϴ�.
			if(num==1)	System.out.println("��~ �������� " + name + "���� �ƹ� ���� �Ͼ�� �ʾҾ��!");
			else{System.out.println("�� �̷�..�� ��ħ�� �ذ� �ʹ� ���ؼ� �׸� �׾���Ⱦ��\n\t------GAME OVER------");
			System.exit(0);		//������ ��ٷ� ����ǰ� �˴ϴ�.
			}
		}else	no++;		//N �Ǵ� n �� ������ Ƚ���� ���ϴ�.
		
		
		System.out.println(name + "�� ��ħ�� �������� �谡 ���� ����̿���~\n��! ���� �ִ� ���� �԰�ʹٰ� �ϳ׿�?\n[Y : ������ �԰� ����!]  [N : �ƴϾ�, Ż���� ��ҷ����]");		//�� ������ �����ϱ� ���� �����Դϴ�.
		System.out.println();
		System.out.print("[����� ����] : ");
		you = sc.next();		//Scanner�� �̿��Ͽ� �亯�� �޽��ϴ�.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;		//��� ���� ������ �� ���� Math.random�Լ��� �����ϴ�.
			if(num==1)	System.out.println("��~ �������� ���� �� �Դ� " + name + "���� �ƹ� ���� �Ͼ�� �ʾҾ��!");
			else{System.out.println("�� �̷�..�� ���� ������ " + name + "�� ������ �� ſ�� �׸� �׾���Ⱦ��\n\t------GAME OVER------");
			System.exit(0);		//������ ��ٷ� ����ǰ� �˴ϴ�.
			}
		}else	no++;		//N �Ǵ� n �� ������ Ƚ���� ���ϴ�.
		
		
		System.out.println(name + "�� ������ �谡 ���� ����̿���~\n��! ���� �ִ� ��¡� �԰�ʹٰ� �ϳ׿�?\n[Y : ������ �԰� ����!]  [N : �ƴϾ�, Ż���� ��ҷ����]");		//�� ������ �����ϱ� ���� �����Դϴ�.
		System.out.println();
		System.out.print("[����� ����] : ");
		you = sc.next();		//Scanner�� �̿��Ͽ� �亯�� �޽��ϴ�.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;		//��� ���� ������ �� ���� Math.random�Լ��� �����ϴ�.
			if(num==1)	System.out.println("��~ �������� ������ Ŀ�� ��¡� 10���� ���� " + name + "���� �ƹ� ���� �Ͼ�� �ʾҾ��!");
			else{System.out.println("�� �̷�..�� " + name + "�� ��¡� �ʹ� ���� ���� ſ�� �׸� �׾���Ⱦ��\n\t------GAME OVER------");
			System.exit(0);		//������ ��ٷ� ����ǰ� �˴ϴ�.
			}
		}else {	no++;		//N �Ǵ� n �� ������ Ƚ���� ���ϴ�.
			if(no==3) {
				System.out.println(name + "��... ���ݱ��� �޺��� �� ����... ����µ� �䵵 �� �Ծ ���λ��߽��ϴ�...\n\t------GAME OVER------");
				System.exit(0);		//������ ��ٷ� ����ǰ� �˴ϴ�.
			}//if
		}//if_else
		
		System.out.println("�赵 �θ��� ����� ������" + name + "�� �ٴ���� ���ġ�� �ʹ��!\n[Y : ���ġ�� ����!]  [N : �ƴϾ�, �׳� ���� ���ڤ�]");		//�� ������ �����ϱ� ���� �����Դϴ�.
		System.out.println();
		System.out.print("[����� ����] : ");
		you = sc.next();		//Scanner�� �̿��Ͽ� �亯�� �޽��ϴ�.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;
			if(num==1)	System.out.println("��~ �������� " + name + "�� �ƹ��� ������ �ʾҾ��!");
			else{System.out.println("�� �̷�..�� ó������ �ٴٰź��� ���� �ʹ� ������ ������ �׾����..��\n\t------GAME OVER------");
			System.exit(0);			}		//������ ��ٷ� ����ǰ� �˴ϴ�.
		}else	no++;		//N �Ǵ� n �� ������ Ƚ���� ���ϴ�.
		
		
		System.out.println("��ҿ� ģ������ ���� ������ " + name + "�� ���⿡ �ִ� �ɰԿ� �Բ� ��� �ʹ��!\n[Y : ���� ��� ����!]  [N : �ƴϾ�, �׳� ���⿡ ������ ���ڤ�]");		//�� ������ �����ϱ� ���� �����Դϴ�.
		System.out.println();
		System.out.print("[����� ����] : ");
		you = sc.next();		//Scanner�� �̿��Ͽ� �亯�� �޽��ϴ�.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;
			if(num==1)	System.out.println("������ " + name + "�� ó������ �ɰԿ� ����ְ� ��Ҿ��!");
			else{System.out.println("�� �̷�..�� ó������ �ɰԿ� �λ縦 �ϴٰ� ���Թ߿� ���� �׾����..��\n\t------GAME OVER------");
			System.exit(0);		//������ ��ٷ� ����ǰ� �˴ϴ�.
			}
		}else	no++;		//N �Ǵ� n �� ������ Ƚ���� ���ϴ�.
		if(no==5) {
			System.out.println(name + "��... ���ݱ���...�ϰ���� ���� �ϳ��� ���� ���ؼ� ���λ��Ͽ����ϴ� :(\n\t------GAME OVER------");
			System.exit(0);		//������ ��ٷ� ����ǰ� �˴ϴ�.
		}//if
		
		
		System.out.println("�̾�~ �޺��� ���� ��������?����\n" + name + "�� ������ ������ �ϱ����� �ϰ� �ʹ��!\n[Y : �ϱ����� �ϰ� ����!]  [N : �ƴϾ�, �׳� ������ ���ڤ�]");		//�� ������ �����ϱ� ���� �����Դϴ�.
		System.out.println();
		System.out.print("[����� ����] : ");
		you = sc.next();		//Scanner�� �̿��Ͽ� �亯�� �޽��ϴ�.
		System.out.println();
		
		if(you.equalsIgnoreCase("y")) {
			int num = (int)(Math.random()*2)+1;		//��� ���� ������ �� ���� Math.random�Լ��� �����ϴ�.
			if(num==1)	System.out.println("���������������� ���� �� ������ " + name + "�� ���� ������� ���ƿԳ׿�!");
			else{System.out.println("�� �̷�..�� �ϱ����� �ϴٰ� �ڹ��� ſ�� ���� �׾����..��\n\t------GAME OVER------");
			System.exit(0);		//������ ��ٷ� ����ǰ� �˴ϴ�.
			}
		}else	no++;		//N �Ǵ� n �� ������ Ƚ���� ���ϴ�.
		
		System.out.println("��! ������� " + name + "�� �Բ� ���ٴ�.. ���ϵ帳�ϴ�:)\nF11�� ������ �ٽ� ������ �غ�����~");	//������� ������ �Դٸ� �̹������� Ŭ�����Դϴ�.
	}//main
}//class