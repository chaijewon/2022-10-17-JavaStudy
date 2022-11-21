package com.sist.wrapper;
/*
 *   Wrapper : 기본형 => 참조형 (사용이 편리하게 만들어 준 클래스의 집합)
 *   기본형 
 *    ***int    ====> Integer
 *                 --------
 *    ***byte   ====> Byte
 *    short  ====> Short
 *    ***long   ====> Long ==> 빅데이터 , AI
 *    char   ====> Character
 *                 ---------
 *    ***boolean ===> Boolean 
 *    float   ===> Float
 *    ***double  ===> Double
 *    
 *    *** Wrapper클래스의 사용이유 
 *    1) 기본형 데이터를 Object형으로 변경 (클래스객체처리) ==> java.util 
 *    2) ***Collection : 데이터를 모아서 관리 :배열을 대체 (가변형) 
 *    *** 자바웹 : String , Integer , List
 *    3) 기본형에서 필요한 메소드를 제공 => 문자열을 정수 , 논리형 
 *    
 *    *** 박싱 / 언박싱 
 *    Integer i=10; // 클래스형에 실제 데이터값을 대입 (박싱) 
 *    int k=i; // 언박싱 (클래스 데이터를 기본형에 대입)
 *    =============> 기본형과 클래스형을 구분이 사용이 가능 
 *    =============> 제네릭스 <>
 *    List<int>==> 오류 
 *    List<Integer> ==> 정상 
 *    ---------------------------------------------------
 */
public class MainClass_Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer ii=10;// 박싱 
        int i=ii;//언박싱 
        System.out.println("ii="+ii+",i="+i);
        System.out.println(ii.toString());// 문자열 변환 
        System.out.println(ii.MAX_VALUE);//int형의 최대값
        System.out.println(ii.MIN_VALUE);//int형의 최소값
        System.out.println(Integer.toBinaryString(ii));// 이진법 변환 
        System.out.println(Integer.toOctalString(ii));//8진법
        System.out.println(Integer.toHexString(ii));//16진법 
        // 기본형 + 기능 첨부 
        String s="100";
        // 문자열을 정수형 변경 parseInt() ==> 웹에서 필수 (구분 => 정수) 영화번호,게시물번호,맛집번호
        int k=Integer.parseInt(s);
        System.out.println(k); 
        /*
         *   웹 
         *     사용자 데이터값 => 자바스크립트 제어 HTML/CSS
         *     ------------------------------------ Front
         *     서버 => 자바 제어
         *     저장 => 오라클 
         *     ------------------------------------ Back
         */
        
	}

}







