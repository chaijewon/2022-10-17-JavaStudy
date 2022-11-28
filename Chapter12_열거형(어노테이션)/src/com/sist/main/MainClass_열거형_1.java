package com.sist.main;
import java.util.*;
// Map => 키 , 값 ==> 주로 사용 
enum 전화국번{
	서울특별시("02"),
	경기도("031"),
	인천광역시("032"),
	강원도("033"),
	충청남도("041"),
	대전광역시("042"),
	충청북도("043"),
	세종("044"),
	부산관역시("051"),
	울산광역시("052"),
	대구광역시("053"),
	경상북도("054"),
	경상남도("055"),
	전라남도("061"),
	광주광역시("062"),
	전라북도("063"),
	제주("064");
	
	private String code;
	전화국번(String code)
	{
		this.code=code;
	}
	public String getCode() {
		return code;
	}
	
}
public class MainClass_열거형_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("지역 입력:");
        String loc=scan.next();
        
        for(전화국번 n:전화국번.values())
        {
        	if(n.name().contains(loc))
        	{
        		System.out.println(loc+"의 국번은 "+n.getCode());
        	}
        }
	}

}
