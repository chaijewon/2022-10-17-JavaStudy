package com.sist.music;
// 지니 , 멜론 ==> 데이터를 저장 => 요청에 대한 처리
import java.util.*;
public class MusicSystem {
   private static ArrayList<Music> list=new ArrayList<Music>();//200개 저장 
   /*
    *    초기화 
    *    ------
    *      1. 명시적 초기화 (X) ==> 기본형 데이터형일 경우 
    *         int a=10; 
    *         String name=""
    *      2. 생성자 
    *         => 인스턴스 변수에 초기화 => 저장 (생성자를 반드시 호출후 사용)
    *      3. 초기화 블럭 : 자동 수행 
    *         => static => 자동 저장 => 생성자를 호출 할 필요가 없다 
    *         
    *      => 명시적 초기화 ==> 초기화 블럭 ==> 생성자 
    *         -------------------------------- 1) 명시적 초기화 고려
    *                                             -------------- 초기화를 할 수 없는 것 
    *                                             -------------- 구현(크롤링)
    *                                             
    *      클래스 
    *      ------------------------------------------
    *        변수 
    *          = 인스턴스 변수 (따라 저장되는 변수) ==> new
    *          = 정적 변수 (한개만 저장) ==> static 
    *      ------------------------------------------
    *        초기화
    *          = 인스턴스 블럭
    *            {
    *               초기화 
    *            }
    *          = static 블럭 
    *            static
    *            {
    *               static변수 초기화 
    *            }
    *      ------------------------------------------
    *       생성자 
    *         = 시작과 동시에 처리해야될 기능이 있는 경우 
    *           자동로그인 / 쿠키처리 / 화면UI
    *      ------------------------------------------
    *       메소드 : 기능(변수에 기능) => 어노테이션으로 구분 
    *      ------------------------------------------
    *       => 열거형 (상수 여러개를 모아서 관리) => 사용 빈도는 거의 없다 
    *      ------------------------------------------
    */
   // 데이터 수집 
   // 클래스영역에서는 구현할 수 없다 => 선언만 가능 => 연산처리 , 제어문 , 예외처리
   /*
    *    <div>
    *     <div class="a>
    *       <span id="b">aaa</span>   div.a span#b ==> span태그안에 b라는 클래스를 가지고 있는 데이터 요청 
    *       <span class="c">bbb</span>
    *     </div>
    *     <div class="d">
    *       <span class="b">ccc</span>
    *       <span class="c">ddd</span>
    *     </div>
    *    </div>
    *    
    *    ===> 태그명 ==> 구분자 : class,id  ==> class:. , id:#
    */
   static
   {
	   int mno=1;
	   try
	   {
		   // 지니뮤직 
		   for(int i=1;i<=2;i++)
		   {
			   
		   }
	   }catch(Exception ex){}
   }
   // 요청에 대한 처리 
   // 목록 => 지니/멜론 => 나눠서 처리  ==> cno
   // 노래 검색 (노래 / 가수명)
   // 상세보기 ==> mno
   // 댓글 / 추천 .... 음반 구매 , 포인트 충전 ....
}
