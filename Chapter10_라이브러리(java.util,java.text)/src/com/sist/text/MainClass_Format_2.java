package com.sist.text;
import java.text.MessageFormat;
/*
 *   MessageFormat 
 *   ------------- 출력 형식을 만들어주는 클래스 
 *                 오라클(데이터베이스 ==> INSERT , UPDATE) 
 *   String msg="이름:{0},성별:{1},나이:{2}"; ==> index번호 
 *   Object[] obj={"홍길동","남자",25}; // 모든 데이터형을 모아서 관리 
 *   MessageFormat.format(msg,obj);
 */
import java.util.*;
public class MainClass_Format_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*String msg="이름:{0}\n성별:{1}\n나이:{2}\n";
        Object[] obj={"홍길동","남자",25};
        System.out.println(MessageFormat.format(msg, obj));*/
		
		String name="이순신";
		String sex="남자";
		String addr="서울";
		String tel="010-1111-1111";
		int age=26;
		String post="100-111";
		String email="lee@co.kr";
		// 오라클 첨부 
		String sql="INSERT INTO member VALUES('"+name+"','"+sex+"','"+addr+"','"+tel
				  +"',"+age+",'"+post+"','"+email+"')";
		System.out.println(sql);
		
		String msg="InSeRt INTO member VALUES(''{0}'',''{1}'',''{2}'',''{3}'',{4},''{5}'',''{6}'')";
		Object[] obj={name,sex,addr,tel,age,post,email};
		System.out.println(MessageFormat.format(msg, obj));
		
		name="'이순신'";
		sex="'남자'";
		addr="'서울'";
		tel="'010-1111-1111'";
		age=26;
		post="'100-111'";
		email="'lee@co.kr'";
		Object[] obj2={name,sex,addr,tel,age,post,email};
		String msg2="INSERT INTO member VALUES({0},{1},{2},{3},{4},{5},{6})";
		System.out.println(MessageFormat.format(msg2, obj2));
		
	}

}
