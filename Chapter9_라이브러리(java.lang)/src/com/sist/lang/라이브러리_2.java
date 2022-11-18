package com.sist.lang;
// 객체를 문자열로 변환 ==> toString()
/*
 *   1. toString 생략할 수 있다 
 *   2. 오버라이딩 : 출력 형식 변경 
 *   3. String으로 형변환이 필요없어진다 
 *      class A
 *      A aa=new A():
 *      String a=(String)aa;
 *      String a=String.valueOf(aa)
 *      String a=aa.toString()
 */
class Main2
{
    private String name;
    private String sex;
    private int age;
    public Main2(String name,String sex,int age)
    {
    	this.name=name;
    	this.sex=sex;
    	this.age=age;
    }
    // 데이터베이스 => toString()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:"+name+",성별:"+sex+",나이:"+age;
	}
	
}
public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Main2 m=new Main2("홍길동","남자",30);
        System.out.println(m);// 주소값 출력 ==> toString()이 자동 호출이 된다 
        System.out.println(m.toString());// 생략이 가능
	}

}
