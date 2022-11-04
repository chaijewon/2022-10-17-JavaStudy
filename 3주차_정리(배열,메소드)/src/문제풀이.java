import java.util.Scanner;

/*
 *      1.두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
 *        -----   --------
		2.문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오 return s.toUpperCase()
		        -----  ----
		3.문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오
		  --------------          -------
		4.문자열을 거꾸로 출력하는 메소드를 구현하시오
		  ----
		5.학점을 구하는 메소드를 구현하시오
		  ---
		6.년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오
		  ------------ ---------------
		7. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
		   ----------- ---------
		8. 입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오
		   ----------  ----------
		9. 3의 배수를 판별하는 메소드를 구현하시오
		--10. 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오
		    -------ㅡ        ---
		11. 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 쉬를 출력하는 프로그램을 작성하세요
		                 ----------  ------------
 */
public class 문제풀이 {
    // 1.두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
	// 실제 계산기 ==> 변수 (String) ==> 7,9 => 79
	// static double div(int a, int b) ==> 반드시 실수변경
	static String div(int a,int b) //260page => 유효성 검사  
	{
		String result=""; // 예외처리 (8장)
		if(b==0)
			result="0으로 나눌 수 없습니다";
		else
			result=String.valueOf(a/(double)b);// 결과값을 문자열로 변경 
		return result;
	}
	// 문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
	static String change(String alpha)
	{
		/*
		 *    String s="";
		 *    for(int i=0;i<alpha.length();i++)
		 *    {
		 *       char a=alpha.charAt(i);
		 *       a=(char)(a-32)
		 *       s+=a;
		 *    }
		 */
		return alpha.toUpperCase();// 대문자 : toUpperCase , 소문자 : toLowerCase
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------- 1문제 ------------");
        Scanner scan=new Scanner(System.in);
        System.out.print("첫번째 정수 입력:");
        int a=scan.nextInt();
        System.out.print("두번째 정수 입력:");
        int b=scan.nextInt();
        
        // 결과값 받기 
        String result=div(a, b);
        System.out.println(result);
        
        System.out.println("-------------- 2문제-------------");
        System.out.print("알파벳 입력:");
        String alpha=scan.next();
        String s=change(alpha);
        System.out.println(s);
        
	}

}
