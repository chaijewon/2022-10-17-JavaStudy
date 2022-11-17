package com.sist.exception;
import java.util.Arrays;
import java.util.Scanner;
/*
 *    try~catch
 *    throws 
 *    -----------
 */
public class 예외처리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 숫자야구게임 
		int[] com=new int[3];// 난수
		int[] user=new int[3];// 사용자 입력값 
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;//1~9
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		// 사용자 입력 
		Scanner scan=new Scanner(System.in);
		while(true)//반복횟수가 없는 경우 
		{
			try
			{
				// 입력값 받기 
				System.out.print("세자리 정수 입력:");
				int input=scan.nextInt();
				if(input<100 || input>999)
				{
					// 소스 코딩은 가능 
					throw new Exception("세자리 정수만 입력이 가능합니다!!");// catch로 이동 
					// 소스 코딩은 불가능 
					/*
					 *    명령문 => 밑에 코딩이 안되는 키워드 
					 *    throw 
					 *    break
					 *    continue
					 *    return 
					 *    ---------------------------
					 *    위에 코딩이 불가능한 키워드 
					 *    this() , super()
					 */
				}
				user[0]=input/100;
				user[1]=(input%100)/10;
				user[2]=input%10;
				// 111
				/*
				 *    Exception e=new Exception();
				 *    throw e;
				 *    
				 *    throw new Exception()
				 *    
				 *    Thread t=new Thread()
				 *          -- ------------
				 *    t.start()
				 *    
				 *    new Thread().start()
				 */
				if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
				{
					throw new Exception("같은 수는 입력이 불가능합니다!!");// 실제 존재하지 않는 예외 처리 
					// 예외를 임의로 발생 ==> 필요시에 사용 
				}
				if(user[0]==0 || user[1]==0 || user[2]==0)
				{
					throw new Exception("0은 입력할 수 없습니다!!");
					// 고의로 발생 ==> 테스팅 
				}
				
				int s=0,b=0;
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						if(com[i]==user[j])// 같은 수가 존재
						{
							if(i==j) // 자리수가 같은 경우
								s++;
							else  // 자리수가 다른 경우
								b++;
						}
					}
				}
				// 힌트 출력 
				System.out.printf("Input Number:%d,Result:%dS-%dB\n",input ,s,b);
				// 종료여부
				if(s==3)
				{
					System.out.println("Game Over!!");
					break;
				}
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
