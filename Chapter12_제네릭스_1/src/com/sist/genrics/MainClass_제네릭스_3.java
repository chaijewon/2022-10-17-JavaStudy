package com.sist.genrics;
import java.util.*;
public class MainClass_제네릭스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<String>();// ArrayList에는 String만 저장이 가능 
        ArrayList<Integer> list2=new ArrayList<Integer>();// 정수만 저장이 가능 
        ArrayList<Double> list3=new ArrayList<Double>(); // 데이터형 변경 => Wrapper 실수만 저장이 가능 
        ArrayList<?> list4=new ArrayList<Integer>();// 매개변수 => 모든 데이터형이 저장 가능 
        list4=new ArrayList<Double>();
        // 프로그램에 맞게 조절이 가능 (데이터형) 
        // 항상 => 저장된 데이터에 대한 명시 
	}

}
