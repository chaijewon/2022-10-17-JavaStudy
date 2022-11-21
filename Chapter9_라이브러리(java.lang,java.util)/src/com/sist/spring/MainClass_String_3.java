package com.sist.spring;
// format ==> printf()
// join/format ==> byte[] => 인코딩 
public class MainClass_String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시간 처리 ==> 원하는 형식으로 변경 (웹 => System.out.printf("")=> X)
        int a=10;
        int b=20;
        String temp=String.format("%d + %d = %d", a,b,a+b);
        System.out.println(temp);
        
        // 12관람가  ==> 12 ==> format("%d관람가",12)
	}

}
