package com.sist.main;
/*
 *   1. 
 *      Calendar cal=(   Calendar.getInstance()                       ) 
 *      // 추상 클래스 
 *         1.미완성 클래스(자신이 메모리 할당을 할 수 없다) ==> new를 이용하지 못한다 
 *         2.구현이 안된 메소드를 가지고 있다 (추상메소드)
 *         3.구성 요소 
 *           public abstract class ClassName
 *           {
 *             -----------------------------
 *              멤버변수 (인스턴스)
 *             -----------------------------
 *              생성자 =-> 초기화 역할 
 *             -----------------------------
 *              구현된 메소드 
 *             -----------------------------
 *              구현이 안된 메소드 
 *             -----------------------------
 *           } 
 *          4. 여러개를 클래스를 묶어서 한개의 객체명으로 연결해서 사용할 목적 
 *          5. 단일 상속만 가능하다 (extends) 
 *       // 추상 클래스 확장 => 인터페이스 
 *          1. 미완성된 클래스 
 *          2. 메모리 할당할 수 없다 
 *          3. 다중 상속이 가능 (implements)
 *          4. 형식 
 *             public interface interfaceName
 *             {
 *                  *** 변수,모든 메소드는 public 
 *                  --------------------------
 *                    변수=> 상수형 변수 (반드시 값을 대입)
 *                    (public static final) int a=10; 
 *                          
 *                  --------------------------
 *                    구현이 안된 메소드 
 *                    (public abstract) void display();
 *                  --------------------------
 *                    구현이 된 메소드 (default)
 *                    (public) default void display(){}
 *                  --------------------------
 *                    구현이 된 메소드 (static)
 *                    (public) static void display(){}
 *                  --------------------------
 *             }
 *             
 *             ** 추상 클래스 / 인터페이스 ==> 오버라이딩 프로그램 
 *                                      ---------
 *                                  1) 메소드명 동일
 *                                  2) 매개변수 동일
 *                                  3) 리턴형 동일 
 *                                  4) 접근지정어 확대 , 축소는 할 수 없다
 *                                  5) ------- 반드시 public으로 구현한다 
 *             Calendar에서 주로 사용 ==> 상수 
 *             = final int a=10; // 상수형 변수
 *             = static final int b=100; // 상수
 *             Calendar.YEAR , Calendar.MONTH , Calendar.DATE , Calendar.DAY_OF_WEEK
 *             => 값을 읽을때 get(int)
 *                값을 설정때 set(int , int)
 *             => 웹에서 사용 => 달력 , 입력일 , 생일 , 예약일 , 구매일 (Date) => Calendar로 변경후에 사용 
 *         
		cal.set(  Calendar.YEAR    , year);
		cal.set(Calendar.MONTH,   month-1 ); // month는 0번부터 시작 
		cal.set(Calendar.DATE, 1);
		int week=cal.get(  Calendar.DAY_OF_WEEK  );
		int lastday=(      cal.getAuctualMaximum(Calendar.DATE))            );
		
		= 가독성 : 분리 (기능별) => 구조화된 프로그램 (단락을 나눠서 처리) => 메소드
		         유지보수 (수정,추가)
		         =======> 리펙토링
		= 최적화 : 속도(실행) 
		         브라우저 => 쓰레드 2개 (이미지 , 텍스트) => + , StringBuffer => 오라클 (index) 
		= 결합성(의존성) : 클래스 수정시 => 다른 클래스에 영향 
		               ----------    ------------- 결합성이 낮은 프로그램 
		               new => 결합성이 높은 프로그램 (권장) ==> 리플렉션 
		               A   B ===> display=>disp()
		               => B b=new B();
		                  b.display();
		                  
		               => A클래스는 B클래스에 의존 
		               => ------------------- 로드 존슨 ==> 이론을 바탕으로 만든 프로그램 (스프링)
		               => 스프링 => 단점 25 (프레임워크)
		                  스프링 소프트웨어 ==> 요청 ==> 제어가 역전 ==> IoC ==> 마틴 파울러 
		                  OOP 
		               
		= 응집성 : 메소드는 한개의 가능만 수행하게 만든다 (재사용성 , 오류처리)
		= 재사용성 : 상속 , 포함 
		
		객체얻기 
		  1) getClass()
		  2) class
		  3) Class.forName()
		  4) new 
     2. Human h2=new Human().(  getClass()         ).
        		 getDeclaredConstructor().newInstance();
        h2.display();
        
        Human h3=Human.(class        ).getDeclaredConstructor().newInstance();
        
        h3.display();
        
        Human h4=(Human)Class.(  forName("클래스명")                ).
        		   getDeclaredConstructor().newInstance();
      3. startsWith ,endsWith , contains
      4. split 
      5. StringTokenizer st=(                            ) 
        System.out.println(            );// 단어 갯수
        while(            ) // 
        {
        	System.out.println(           ); // 단어를 읽어 온다 
        }
        
        = split 
        = 단어를 자르는 경우 => substring()
        
        
        Date / Calendar / SimpleDateFormat / DecimalFormat ==> String,format()
                         ---------------------------------- 오라클에서 처리
        LocalDate , LocalTime , LocalDateTime ==> now
        
        -----------------------------------------------------------------------
                  Collection 
                     |
          ---------------------------------
          |             |                 |
         List         Set                Map
          |             |                 |
        **ArrayList   **HashSet         Hashtable
        Vector        TreeSet           ***HashMap
        LinkedList
          |
         Queue,Stack
         
       
        

 */
interface A
{
	public int max(int a,int b);
}
public class MainClass {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A aa=(int a,int b)->a>b?a:b;//람다식 ==> 자바스크립트 (화살표함수)
        System.out.println(aa.max(100, 200));
	}

}
