package com.sist.util;
import java.util.*;
/*
 *    Calendar : Date를 보완해서 새로운 클래스제작 
 *    ------------------------------------- 싱글턴 
 *    1) 생성 
 *       Calendar cal=Calendar.getInstance();   => Date date=new Date()
 *       ------------------------------------ 기본 (new 생성자를 이용하지 않는다 => 추상 클래스 , 인터페이스)
 *       추상 클래스로 되어 있다 ... (필요한 경우에는 오버라이딩해서 사용한다)
 *    2) 날짜 설정 
 *       set()
 *    3) 날짜 읽기
 *       get() 
 *    4) 각달의 마지막 날짜
 *       getActualMaxium() 
 *    5) 요일 읽기 
 *       get()
 */
public class MainClass_Calendar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calendar today=Calendar.getInstance();
        System.out.println("년도:"+today.get(Calendar.YEAR));
        System.out.println("월:"+(today.get(Calendar.MONTH)+1));//0부터 시작한다
        System.out.println("일:"+today.get(Calendar.DATE));
        String[] strWeek={"","일","월","화","수","목","금","토"}; // week => 1
        System.out.println("요일:"+strWeek[today.get(Calendar.DAY_OF_WEEK)]);
        // 1:일 , 2:월.....7:토
        System.out.println("시간:"+today.get(Calendar.HOUR));
        System.out.println("분:"+today.get(Calendar.MINUTE));
        System.out.println("초:"+today.get(Calendar.SECOND));
        System.out.println("마지막날:"+today.getActualMaximum(Calendar.DATE));
	}

}









