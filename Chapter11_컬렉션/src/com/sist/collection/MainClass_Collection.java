package com.sist.collection;
/*
 *    1. String : 웹 => 문자열 제어 
 *    2. Integer / Double 
 *    3. Date / Calendar 
 *    ---------------------------------> 오라클의 데이터형 (문자열,날짜형, 숫자형)
 *    4. 데이터를 모아서 관리 : 배열 
 *       배열 => 단점 (고정적) => 크기를 확장하기 어렵다 (메모리 누수현상 => 최적화의 문제)
 *                    |
 *                  가변형 (수시로 변경이 가능) ==> 크기를 정하지 않는다 => 컬렉션 
 *    5. 컬렉션 : 데이터는 어떤형이든 등록이 가능 => 형변환 => 데이터형 한개로 통일 (제네릭스)
 *       ----- 열거형 , Properties ==> 12장 
 *       ----- if문을 사용해서 구분 ==> if대신 사용할 수 있는 프로그램 (어노테이션)
 *       ------------------------------------------------------------ 스프링 , MyBatis(Mapper)
 *       스프링부트 , JPA
 *       -------------- STS (3.XXX => 스프링 프레임워크, 4.XXX => 스프링부트) => 
 *    6. 578page 
 *       = 컬렉션 프레임워크 
 *          ** 프레임워크 (표준화) => 스프링 프레임워크(형식동일) , Jquery 프레임워크 , MyBatis프레임워크 ...
 *          ** 표준화 (스프링형식을 모방)
 *          -------- 
 *          ** Collection : 데이터그룹 , 다수의 데이터 => 모아서 처리 
 *          ** 개발자가 누구든 상관없이 같은 메소드를 이용해야 된다
 *       = 종류 
 *                         Collection : 인터페이스 
 *                             |
 *                  ------------------------------------
 *                  |                 |                |
 *                List               Set             Map ==> 인터페이스  ==> 메소드가 거의 동일 
 *                  |                 |               |
 *                               --------------       -----------------------
 *                               |            |       |                     |
 *                             HashSet      TreeSet  Hashtable           HashMap
 *           ----------------------------
 *           |            |             |  ==> 인터페이스를 구현한 클래스 (주로 사용)
 *         ArrayList   Vector         Queue
 *                                      |
 *                                  LinkedList
 *         **List
 *           1) 순서를 가지고 있다 (인덱스) ==> 배열형식
 *           2) 저장된 데이터가 중복이 가능 
 *           3) 비동기화 => 데이터베이스 프로그램에서 주로 사용 (******)
 *           4) CURD ==> 데이터 처리(추가 , 수정 , 삭제 , 검색)
 *              => INSERT , UPADTE , DELETE , SELECT(데이터 조작:DML)
 *           5) 주요 메소드 
 *              = add() => 데이터 추가 
 *              = remove() => 데이터 삭제 
 *              = set()  => 데이터 수정 
 *              = get()  => 데이터 읽기
 *              = size() => 저장된 갯수
 *              = clear() => 전체를 삭제 
 *              = isEmpty() => 존재여부 
 *           -------------------> 모든 데이터는 오라클에 저장 ===> 메모리 저장 ===> 브라우저에 전송
 *           **Set   
 *            1) 순서가 없다 (인덱스번호가 없다) ==> 출력 (forEach)
 *            2) 데이터 중복을 허용하지 않는다 (장르,음식의 종류) => 분야별 분류 
 *            3) List에서 중복이 없는 데이터를 추출 
 *            4) HashSet ...
 *            5) 주요 메소드 
 *              = add() => 데이터 추가 
 *              = remove() => 데이터 삭제 
 *              = set()  => 데이터 수정 
 *              = get()  => 데이터 읽기
 *              = size() => 저장된 갯수
 *              = clear() => 전체를 삭제 
 *              = isEmpty() => 존재여부 
 *            **Map (웹에서 지원하는 모든 클래스 Map형식을 가지고 있다)
 *                   -------------------- 
 *                   HttpServletRequest(사용자 보내주는 데이터를 가지고 있다) , 
 *                   HttpServletResponse(요청 처리 결과를 브라우저로 전송) , 
 *                   HttpSession(서버에 데이터를 저장), Cookie(사용자의 브라우저에 저장)
 *              1) 키와 값으로 쌍으로 저장 
 *                 id , admin 
 *              2) 키는 중복이 불가 , 값은 중복이 가능 
 *              3) 클래스관리, 요청값 관리 , 전송값 관리 
 *                 ------- 스프링 , 마이바티스 ==> id , 실제값
 *              4) 주로 사용 => HashMap (동일 ==> 파일 (properties))
 *        1. ArrayList (584page)
 *        ---------------------- 주로 (데이터 중복을 허용 => 데이터베이스와 연동) ******* 핵심
 *        특징) MyBatis/JPA/JDBC (오라클 관련) 
 *             1) 1차 프로젝트  : 목적 => 데이터베이스 연결 (최대한으로 오라클 연결) => SQL
 *                                    JDBC / Jquery (Ajax) 
 *             2) 2차 프로젝트  : 목적 => 스프링 => 스프링 라이브러리 
 *                                    MyBatis / VueJS
 *             3) 3차 프로젝트  : 목적 => 우대사항 (신기술) 
 *                                    JPA / ReactJS 
 *             ** 모방 => 전체 구현 
 *                데이터가 없다 (데이터만 크롤링) 
 *        -------------------------------------------------------------------------
 *        저장 ==> Object 
 *        add() ==> 오버로딩 
 *        add(데이터)
 *        add(인덱스번호,데이터) ==> 권장 사항이 아니다 (속도가 저하)
 *        0 A
 *        1 B
 *        2 C
 *        ==> 3 H
 *        4 D
 *        5 E
 *        6 F
 *        7 G
 *        8 H
 *        ------------ 인덱스번호는 순차적으로 생성 (인덱스를 이용할때) , 삭제  
 *        ------------------------------------------------------- LinkedList
 *        => 데이터를 가지고 올때 형변환 ==> 같은 데이터형을 저장 ==> 클래스를 만들어서 사용 
 *        
 *        add(1) ===0   ==> (int)
 *        add('A')==1   ==> (char)
 *        add('b')==2   ==> (char)
 *        add("홍길동")==3 ==> (String)
 *        add(10.5)==4  ==> (double)
 *        add(true)==5  ==> (boolean)
 *        add(false)==6 ==> (boolean)
 *        
 *        
 *       CHAR(100)
 *       ==> 'a' ===> 메모리 크기 => 100  'a' ...99(null)
 *       VARCHAR2(100)
 *       ==> 'a' ==> 1byte
 *       
 */
import java.util.*;
public class MainClass_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList(); // 지정하지 않는다 (크기) ==> 가변형 (18만개)
        // 저장 
        list.add("홍길동"); // 인덱스 0
        list.add("심청이"); // 1
        list.add("이순신"); // 3
        list.add("강감찬"); // 4
        list.add(2,"을지문덕"); // 2  ===> for 
        
        System.out.println("저장된 인원수:"+list.size());
        // 출력  size() ==> 저장된 갯수  ==> 배열 (length)
        System.out.println("======= 컬렉션에 추가 add()========");
        for(int i=0;i<list.size();i++)
        {
        	//String name=(String)list.get(i);// 데이터 읽기 
        	String name=list.get(i).toString();
        	//          ----------- Object
        	System.out.println(i+"=>"+name);
        }
        System.out.println("======== 컬렉션 수정 set()========");
        // 2번 수정 ==> set(2,"수정데이터")
        list.set(2, "박문수"); // 을지문덕 ==> 박문수 
        for(int i=0;i<list.size();i++)
        {
        	//String name=(String)list.get(i);// 데이터 읽기 
        	String name=list.get(i).toString();
        	//          ----------- Object
        	System.out.println(i+"=>"+name);
        }
        System.out.println("======== 컬렉션 삭제 remove()======");
        // remove(int index)
        // 3번 => 퇴사 (삭제)
        list.remove(3);
        /*
         *  0
         *  1
         *  2
         *  3 ==> remove
         *  4 ==> 3번 변경
         */
        System.out.println("저장된 인원수:"+list.size());
        for(int i=0;i<list.size();i++)
        {
        	//String name=(String)list.get(i);// 데이터 읽기 
        	String name=list.get(i).toString();
        	//          ----------- Object
        	System.out.println(i+"=>"+name);
        }
        
        System.out.println("===== 전체 삭제 clear()=====");
        list.clear();
        System.out.println("저장된 인원수:"+list.size());
        if(list.isEmpty())// 데이터가 없는지 확인 
        {
        	System.out.println("저장된 데이터가 없습니다!!");
        }
        /*
         *   1. add(Object o)  ==> Object(데이터형은 모든것을 사용할 수 있다) ==> 클래스형을 저장 
         *   2. set(int index,Object o)
         *   3. remove(int index)
         *   4. int size()
         *   5. boolean isEmpty()
         *   6. Object get(int index)
         *   
         *   ==> [] => List ==> asList()
         */
	}

}







