package com.sist.music;
// 지니 , 멜론 ==> 데이터를 저장 => 요청에 대한 처리
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
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
			   Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20221125&hh=14&rtm=Y&pg="+i).get();
			   Elements title=doc.select("table.list-wrap td.info a.title");
			   Elements singer=doc.select("table.list-wrap td.info a.artist");
			   Elements album=doc.select("table.list-wrap td.info a.albumtitle");
			   Elements etc=doc.select("span.rank span.rank");
			   for(int j=0;j<title.size();j++)
			   {
				   /*System.out.println(title.get(j).text()+" "
						   +singer.get(j).text()+" "
						   +album.get(j).text()+" "
						   +etc.get(j).text());*/
				   Music m=new Music(); // m=>100개
				   m.setMno(mno);
				   m.setCno(1);
				   m.setTitle(title.get(j).text());
				   m.setSinger(singer.get(j).text());
				   m.setAlbum(album.get(j).text());
				   String temp=etc.get(j).text();
				   int in=0;
				   // 2하강
				   String state=temp.replaceAll("[^가-힣]", "");
				   if(state.equals("유지"))
				   {
					   in=0;
				   }
				   else 
				   {
					   in=Integer.parseInt(temp.replaceAll("[^0-9]", "").trim());
				   }
				   m.setState(state);
				   m.setCrement(in);
				   list.add(m);//ArrayList는 Music객체만 저장이 가능 
				   mno++;
			   }
			  
		   }
		   // 데이터 수집 완료 
		   mno=101;
		   Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
		   Elements title=doc.select("tr.lst50 div.rank01");
		   Elements singer=doc.select("tr.lst50 div.rank02");
		   Elements album=doc.select("tr.lst50 div.rank03");
		   Elements etc=doc.select("tr.lst50 div.wrap span.rank_wrap");
		   for(int i=0;i<title.size();i++)
		   {
			   /*System.out.println(title.get(i).text()+" "
					   +singer.get(i).text()+" "
					   +album.get(i).text()+" "
					   +etc.get(i).text());*/
			   Music m=new Music(); // m=>100개
			   m.setMno(mno);
			   m.setCno(1);
			   m.setTitle(title.get(i).text());
			   m.setSinger(singer.get(i).text());
			   m.setAlbum(album.get(i).text());
			   String temp=etc.get(i).text();
			   int in=0;
			   // 2하강
			   String state=temp.replaceAll("[^가-힣]", "");
			   if(state.contains("동일"))
			   {
				   in=0;
			   }
			   else 
			   {
				   in=Integer.parseInt(temp.replaceAll("[^0-9]", "").trim());
			   }
			   m.setState(state);
			   m.setCrement(in);
			   list.add(m);//ArrayList는 Music객체만 저장이 가능 
			   mno++;
		   }
	   }catch(Exception ex){}
   }
   // 요청에 대한 처리 
   // 목록 => 지니/멜론 => 나눠서 처리  ==> cno
   // 노래 검색 (노래 / 가수명)
   // 상세보기 ==> mno
   // 댓글 / 추천 .... 음반 구매 , 포인트 충전 ....
   public static void main(String[] args) {
	  MusicSystem m=new MusicSystem();
	  System.out.println(m.list.size());
   }
}






