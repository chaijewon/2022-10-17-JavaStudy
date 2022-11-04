// 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 쉬를 출력하는 프로그램을 작성하세요
/*
 *    메소드 : 매개변수 , 리턴형 
 *           ------   ----- 처리 결과값 (출력 => void)
 *           사용자로부터 받는 값 
 */
import java.util.Scanner;
public class 문제풀이_3 {
    static void reverse(int num)
    {
    	String s=String.valueOf(num); // 문자열 변환 
    	for(int i=s.length()-1;i>=0;i--)
    	{
    		System.out.print(s.charAt(i));
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        int num=scan.nextInt();
        reverse(num);
	}

}
