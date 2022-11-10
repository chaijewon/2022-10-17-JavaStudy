// 문자 입력을 받아서 => 대문자,소문자, 알파벳이 아니지 확인
// if ~~ else if ~ else (나머지 (숫자,기호, 한글))
import java.util.Scanner;
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("문자한개 입력:");
        String msg=scan.next();
        char ch=msg.charAt(0); // 문자열 1번째 문자를 가지고 온다 
        
        if(ch>='A' && ch<='Z')
        	System.out.println(ch+"는(은) 대문자입니다!!");
        else if(ch>='a' && ch<='z')
        	System.out.println(ch+"는(은) 소문자입니다!!");
        else
        	System.out.println(ch+"는(은) 알파벳이 아닙니다!!");
	}

}
