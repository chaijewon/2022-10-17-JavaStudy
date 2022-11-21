package com.sist.wrapper;
/*
 *   StringBuffer => append / toString
 *   Math => random / ceil / round
 *   Wrapper 
 *     Integer => parseInt() / toString() => String.valueOf()
 *     Double  => parseDouble() / toString()
 *     Boolean => parseBoolean() / toString() 
 *     
 *   String / Object 
 *   ---------------------------------------------- java.lang
 *   java.util 
 */
public class MainClass_Wrapper_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Double d=10.5; // 박싱 (클래스에  기본형 데이터값 대입) => 클래스에는 메모리 주소값이 대입  
        double d1=d;// 언박싱  // 기본형에는 클래스값 대입
        // Double double을 혼합해서 사용이 가능 
        System.out.println("d="+d);
        System.out.println("d1="+d1);
        String s="100.67";
        double d2=Double.parseDouble(s);// 문자열을 double형으로 변경 
        System.out.println("d2="+d2);
        String s1="true";
        boolean b=Boolean.parseBoolean(s1);
        // true 
        System.out.println("b="+b);
        // 데이터는 오라클 (영구저장) => 데이터 공유 
        // Number(4)=int , Number(7,2)=double , boolean 
        // Integer.parseInt() , Double.parseDouble() , Boolean.parseBoolean()
	}

}
