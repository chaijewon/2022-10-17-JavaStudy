package com.sist.main;
import java.text.SimpleDateFormat;
/*
 *   1. 데이터 저장 
 *      ***한개 저장 : 변수
 *         = 변수 종류
 *           1) 지역변수 (메소드안에서만 사용하는 변수,매개변수) => 자동으로 사라진다 
 *           2) 멤버변수 (인스턴스 변수) 
 *           3) 공유변수 (클래스변수 : static) => static 메모리공간이 1개만 생긴다   
 *      같은 저장 : 배열 => 1차 배열 
 *      ***다른 여러개 : 클래스 
 *           => 클래스 
 *              1) 구성 요소 
 *                 ------------------------------------------
 *                   변수 : 클래스안에서 프로그램 종료시까지 사용되는 변수
 *                         예) 예매 
 *                            영화명 (String)
 *                            극장명 (String)
 *                            예약일 (Date)
 *                            시간  (String)
 *                            인원  (int)
 *                            금액  (int) 
 *                            --------------- id, 예매번호
 *                 ------------------------------------------
 *                  기능 (메소드) 
 *                        예) 영화 선택 
 *                           극장 선택 
 *                           날짜 선택
 *                           시간 선택 
 *                           인원 선택 
 *                           예매 요청
 *                           예매 내역 출력   
 *                 -----------------
 *                  변수에 초기화 : 생성자 (id => id 읽기,예매번호 => 자동 처리) ==> 컴포넌트 
 *                 -----------------
 *                 컴포넌트(클래스=> 한개의 전체기능을 가지고 있다) ==> 조립형 
 *                 ==> 객체 지향의 특성을 첨부 (유지보수가 편하게 만든다 => 문법 사항은 아니고 권장사항)
 *                     캡슐화 : 데이터 보호 => 데이터를 은닉화 , 메소드를 통해서 변수 사용 
 *                                        -----------   -------------------
 *                                        private           읽기/쓰기 => getter/setter
 *                     상속/포함 : 재사용 (소스 중복 제거)
 *                     다형성 : 재사용 필요시에는 언제든지 수정 , 기능 추가 
 *                                              (오버라이딩) (오버리딩)
 *                 ==> 클래스의 종류 
 *                     = 추상 클래스 
 *                     ***= 인터페이스 : 독립적으로 사용이 가능 , 서로 다른 클래스를 연결해서 사용 (리모콘)
 *                          결합성이 낮은 프로그램이 가능 
 *                          ---- 클래스의 영향 (클래스를 수정시에 다른 클래스에 영향) ==> 스프링
 *                          응집성  
 *                          ---- 메소드관련 (한가지 기능) ==> 재사용 가능 
 *                     = 내부 클래스 (쓰레드,윈도우에서 주로 사용) => 하둡 (빅데이터)
 *                          ===> 익명의 클래스 (상속이 없이 오버라이딩)
 *                          
 *                     *** 추상 클래스 / 인터페이스는 메모리 할당이 불가능하다
 *                         => 반드시 상속을 받아서 구현된 클래스를 이용한다 
 *                         => 인터페이스는 추상 클래스의 일종 => 추상 클래스의 단점을 보완 
 *                         => 사용 방법 
 *                            상속 : 추상 클래스는 단일 상속 (extends)
 *                                  인터페이스는 다중 상속이 가능 (implements)
 *                                  예)
 *                                      abstract class A
 *                                      class B extends A
 *                                      ------------------
 *                                      B b=new B(); // 확장된 클래스 사용 
 *                                      A a=new B();
 *                                      A a=new A(); // 오류 
 *                                      
 *                                      interface A
 *                                      interface B
 *                                      interface C extends A,B
 *                                      ------------------------
 *                                      
 *                                      interface A
 *                                      interface B
 *                                      class C implements A,B
 *                                      ------------------------
 *                                      ==> 여러개의 관련된 클래스를 한개의 인터페이스로 관리 
 *                                      *** 프로그램 : 여러개를 그냥 사용하면 => 수정이 어려울 수 있다 
 *                                                  ------ 한개의 이름으로 제어 
 *                                                  데이터 => 배열명 
 *                                                  클래스 여러개 => 인터페이스 
 *                  => 메모리 할당 
 *                  class Human
 *                  { 
 *                     public void display(){}
 *                  }
 *                  
 *                  1) Human h=new Human(); // 직접적으로 연결 => 결합성이 높은 프로그램 
 *                  2) Human h2=new Human().getClass().getDeclearedContstructor().newInstance()
 *                  3) Human h3=Human.class.getDeclearedContstructor().newInstance()
 *                  ***4) Human h4=(Human)Class.forName("Human")
 *                        => 변수/메소드 제어 (리플렉션)
 *                  => 접근지정어 
 *                     private : 자신의 클래스에서만 사용이 가능  
 *                     default : 같은 패키지에 있는 클래스에서만 사용 
 *                     protected : 같은 패키지에 있는 클래스에서만 사용, 다른 패키지 상속이 있는 경우
 *                     public : 모든 클래스에 접근 가능 
 *                  => 클래스 => 클래스와 클래스의 연관 관계 (객체지향) => public 
 *                     메소드 => 클래스와 클래스의 통신을 하는 기능 => public 
 *                     변수  => 데이터 보호 : private 
 *                     생성자 => 클래스의 기능을 얻어올때 사용(다른 클래스에 메모리 할당) => public
 *                                      
 *                 
 *      ***원하는 저장 : 컬렉션 (11장~12장) : **List , Set(중복된 데이터를 제거) , **Map(코테) => 클래스 관리
 *                                     ------- 데이터베이스                => 웹 지원하는 모든 클래스
 *                                                                      Request,Response , Session
 *                                                                      Cookie  
 *         *** 12장 (어노테이션) => 스프링은 전체 어노테이션  
 *      ---------------- 메모리 저장 
 *      파일 (15장) => 파일 입출력 : File / FileReader / FileWriter / FileInputStream / FileOutputStream
 *                   ObjectInputStream / ObjectOutputStream / BufferdReader / BufferedWriter
 *      ***RDBMS (오라클) => DML/DDL/DCL/TCL => SQL
 *                         ---- JOIN / SUBQuery / Index / View(인라인뷰)
 *                         기본) 데이터베이스 모델링 
 *                         ------------------- JDBC (핵심) => 자바로 오라클 연결 
 *   2. 데이터 활용 : 연산자 / 제어문 / 메소드 
 *                 연산자
 *                  = 증감연산자 / 부정연산자 / 형변환연산자 
 *                    ++ , --     !       (type)
 *                  = 산술연산자 / 비교연산자 / 논리연산자 / 대입연산자 
 *                    +,-,*,/, %  ==, != , < , > , <= , >= , && , || , = , += ,-=
 *                  = 삼항연산자 => if~else ==> 소스를 줄이는 경우에 주로 사용 
 *                      (조건)?값:값 
 *                  = instanceof , equals 
 *                    객체 비교       문자열 비교 
 *                    
 *                  제어문 
 *                  = 조건문 (if , if~else , if~else if , else if~else)
 *                  = 반복문 (for , while) 
 *                         ----- for은 이차 
 *                  = 반복제어문 (break)
 *                  
 *                  메소드 
 *                  형식) 
 *                     [접근지정어][제어어] 리턴형 메소드명(매개변수..) 선언부 
 *                     {
 *                         구현부 
 *                     }
 *                     [접근지정어] => 접근지정어 전체 (public,default,protected,private)
 *                                              -------
 *                     [제어어] => abstract , final , static 
 *                     
 *                     => void외는 반드시 return을 사용한다 (return => 메소드 종료)
 *                     => 리턴형 : 요청처리에 대한 결과값 
 *                               리턴형은 한개만 설정이 가능 (여러개 데이터를 전송)
 *                               -------------------- 클래스 전송 , 배열 전송 
 *                     => 매개변수 : 사용자 요청값 => 여러개 나올 수 있다 
 *                     => 매개변수 전송법 => Call By Reference , Call By Value => 실제값을 전송(새로운 메모리에 값만 전송)
 *                                                                  기본형 / String
 *                                      ------------------ 주소 전송 (배열,클래스)
 *   3. 데이터 출력 : 브라우저 출력 (웹 프로그램) => HTML/CSS (브라우저안에서 자바는 일반 텍스트)
 *                                         JAVA => HTML로 변환 (JSP/SERVLET)
 *                                         ==> MVC구조 (Spring은 MVC만 존재)
 *                                         ==> Web(JSP=> 자바+HTML)
 *                                         ==> 자바와 HTML 분리해서 작업 
 *   4. 자바에서 지원하는 라이브러리 
 *      java.lang 
 *        Object : clone , finalize , toString , equals , getClass
 *        String : length , substring , trim , indexOf , lastInexOf , contains , startsWith
 *                 equals , valueOf 
 *        StringBuffer : append
 *        Math : ceil , random , round 
 *        Wrapper : 데이터형을 클래스화 => Integer / Double / Boolean 
 *                                  parseInt   parseDouble parseBoolean
 *        System : gc
 *      java.util
 *         StringTokenizer => hasMoreTokens / nextToken / countTokens 
 *         Random => nextInt(int bounds)
 *         ------------------
 *         Date 
 *         Calendar 
 *         List
 *         Map 
 *         Set 
 *         -----------------
 *      java.util.regex
 *         Pattern / Matcher (find,matchers,group) 
 *         ------- compile()
 *      java.io
 *      java.net
 *      java.sql 
 *      java.text
 *        = SimpleDateFormat : 날짜 변환 
 *        = ChoiceFormat 
 *        = MessageFormat : 
 *      ----------------
 *      오라클 
 *        String name,sex,addr,tel,post,content
 *        int age 
 *        
 *        String sql="INSERT INTO member VALUES('"+name+"','"+sex+"','"+addr+"',"+age+",'"
 *                  +tel+"','"+post+"','"+content+"')";
 *                  
 *       10,000,000,000
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(date));
	}

}
