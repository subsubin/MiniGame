package �ڹٹ����;
import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int giri;
		
		System.out.print("���ϴ� ���ڸ� �Է� (1 �̻�) : ");
		int su = sc.nextInt();
		
		for(int i = 1; i <= su; i++) {
			
			giri = length(i);
			int count369 = number369(i, giri);
			
			if(count369>0) {
				for(int j = 0; j < count369; j++)
					System.out.println("¦");
				
			}else {
				if(i % 10 == 0)
					System.out.print("����\n");
				else
					System.out.println(i);
			}
		}//for_i
	}//main
	
	
	public static int length(int num) {			//������ �ڸ����� ����
		return Integer.toString(num).length();
	}//int_length
	
	
	public static int number369(int su, int length) {
		int a = su;
		int count = 0;
		
		for(int i = 0; i < length; i++) {
			if((a % 10 != 0)&& (a % 10)% 3 == 0) {
				count++;
				a = a / 10;
			}//if
		}//for_i
		
		return count;
	}//int_num369
	
}//class