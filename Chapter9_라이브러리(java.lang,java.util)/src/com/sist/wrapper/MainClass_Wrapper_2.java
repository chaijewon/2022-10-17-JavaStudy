package com.sist.wrapper;
import java.util.*;
public class MainClass_Wrapper_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 2개의 정수를 문자열로 받는다 => 정수형 변환 => +
        System.out.print("문자열 두개 입력(10 20):");
        String num1=scan.next();
        String num2=scan.next();
        System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
	}

}
