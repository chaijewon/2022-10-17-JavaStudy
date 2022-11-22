package com.sist.time;
// Date , Calendar에서 처리가 안되는 기능 => 보완 
/*
 *   오라클 => 날짜 저장 => Date 
 *   MYSQL => 날짜 => LocalDateTime
 *   
 *   LocalDate
 *   LocalTime 
 *   --------- +
 *     LocalDateTime
 */
import java.time.*;
public class MainClass_Time_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현재 날짜 (시스템) ==> static => 오늘 날짜 읽기
        LocalDate date=LocalDate.now();
        System.out.println(date);
        // 현재 시간 (시스템)
        LocalTime time=LocalTime.now();
        System.out.println(time);
        // 날짜,시간을 동시에 읽어 올때 
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        // of => static => 날짜 설정 
        date=LocalDate.of(2022, 12, 1);// 날짜 설정  ==> 생년월일 , 예약일 등록 ...
        System.out.println(date);
        // 24
        time=LocalTime.of(15, 30,45);
        System.out.println(time);
	}

}
