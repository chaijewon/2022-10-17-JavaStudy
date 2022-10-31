/*
 *  변수/배열/클래스 ==> 선언 , 초기화 
 *  변수 
 *    int a=10;
 *    ------------------- 기본형 
 *    --------------------------------
 *    데이터형[] 배열명={10,20,30,40,50}
 *    데이터형[] 배열명=new 데이터형[갯수];
 *    
 *    데이터형 배열명[]={10,20,30,40,50}
 *    데이터형 배열명[]=new 데이터형[갯수];
 *    
 *    클래스 => A
 *    A a=new A()
 *        ---- 메모리 위치 지정 (주소값을 a에 저장)
 *    -------------------------------- 참조형   ==> new(동적 메모리 할당) 
	1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
	   char[] c=new char[10];​
	2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
	   int[] n={0,1,2,3,4,5}​
	3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
	   char[] day={'일', '월', '화', '수', '목', '금', '토'};​
	4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
	   boolean[] bool={true,false,false,true};

 */
import java.util.Scanner;
public class 배열문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("년도 입력:");
        int year=scan.nextInt();
        
        System.out.print("월 입력:");
        int month=scan.nextInt();
        
        System.out.println(year+"년도 "+month+"월");
        
        
        System.out.println("\n");
        char[] strWeek={'일', '월', '화', '수', '목', '금', '토'};
        for(char c:strWeek)
        {
        	System.out.print(c+"\t");
        }
        
        int[] lastday={31,28,31,30,31,30,31,31,30,31,30,31};
        /*int sum=0;
        for(int i:lastday)
        {
        	sum+=i;
        }
        System.out.println(sum);*/
        // 1년도 1월 1일 ==> 전년도까지의 합 (날수)
        int total=(year-1)*365
        		 +(year-1)/4  //366
        		 -(year-1)/100 // 제외
        		 +(year-1)/400;// 윤년 
        // 전달 
        if((year%4==0 && year%100!=0)||(year%400==0))
        	lastday[1]=29;
        else
        	lastday[1]=28;
        
        for(int i=0;i<month-1;i++)
        	total+=lastday[i];
        // +1  ==> 10월 1일의 요일을 확인 
        total++;
        int week=total%7; 
        //System.out.println(strWeek[week]);
        
        System.out.println();
        for(int i=1;i<=lastday[month-1];i++)
        {
        	if(i==1)
        	{
        		for(int j=0;j<week;j++)
        		{
        			System.out.print("\t");
        		}
        	}
        	System.out.printf("%2d\t",i);
        	week++;
        	if(week>6)
        	{
        		week=0;
        		System.out.println();
        	}
        }
        
	}

}






