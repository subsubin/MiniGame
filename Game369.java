package 자바방과후;
import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int giri;
		
		System.out.print("원하는 숫자를 입력 (1 이상) : ");
		int su = sc.nextInt();
		
		for(int i = 1; i <= su; i++) {
			
			giri = length(i);
			int count369 = number369(i, giri);
			
			if(count369>0) {
				for(int j = 0; j < count369; j++)
					System.out.println("짝");
				
			}else {
				if(i % 10 == 0)
					System.out.print("만세\n");
				else
					System.out.println(i);
			}
		}//for_i
	}//main
	
	
	public static int length(int num) {			//숫자의 자릿수를 리턴
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