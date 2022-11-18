package com.sist.lang;
// equals ==> 문자열 비교 (실제 값)
// 주소값 (==)
// 원형  public boolean equals(Object obj)
// 라이브러리 : 메소드명 , 기능 , 리턴형 , 매개변수 => 필요시에는 오버라이딩 
class Member
{
	private String name;
	public Member(String name) // 사용자로부터 입력값을 받아서 변수 초기화를 한다 
	{
		this.name=name;
	}
	public String getName() { // 읽기
		return name;
	}
	public void setName(String name) { //쓰기 
		this.name = name;
	}
	
}
public class 라이브러리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member m1=new Member("홍길동");
        Member m2=new Member("홍길동");
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
        if(m1.equals(m2))
        {
        	System.out.println("같은 회원입니다");
        }
        else
        {
        	System.out.println("다른 회원입니다");
        }
        
        m2=m1;
        
        if(m1.equals(m2))
        {
        	System.out.println("같은 회원입니다");
        }
        else
        {
        	System.out.println("다른 회원입니다");
        }
        
	}

}







