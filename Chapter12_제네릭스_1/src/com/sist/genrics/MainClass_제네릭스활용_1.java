package com.sist.genrics;
/*
 *        => 컬렉션에 데이터를 저장 => 같은 데이터형을 저장해야 제어가 편한다 (제네릭스) => 한개의 데이터형만 저장
 *                               ---------- 배열형식으로 저장 (데이터형을 통일하는 역할)
 *             Collection : 인터페이스 (1.독립적으로 사용이 가능 , 2.표준화 , 3. 필요시에 오버라이딩해서 사용이 가능)
 *                |
 *          --------------------
 *          |        |         |
 *        List     Set       Map 
 *        ----------------------- 인터페이스 
 *        List : 중복된 데이터가 있는 경우 ,순서가 존재한다(인덱스=> 배열을 확장(보완) => 고정적 => 가변)
 *          => ArrayList , Vector , LinkedList(수정,삭제에 많은 경우에 주로 사용)
 *             --------- Vector를 보완  
 *             --------------------------> 데이터베이스에 있는 데이터를 읽어와서 브라우저에 전송목적 
 *                                         읽기/쓰기 
 *                                         데이터베이스를 사용시에는 ArrayList에 있는 데이터는 거의 변경이 없다 
 *                                         (수정,삭제)
 *                                         => 접근성이 뛰어나다 , 순차적으로 데이터 첨부시 속도가 빠르다 
 *        Set : 중복이 없는 데이터를 저장 할 경우 (중복을 허용하지 않는다) , 순서가 없다 
 *              List에 중복이 있는 경우 => 제거할때 사용 => DISTINCT
 *              => WebSocket => 사용자의 정보를 저장(IP,PORT) => 네트워크에서 주로 사용 
 *              => HashSet / TreeSet(검색) => Application => SELECT 
 *                 -------
 *              => 웹 : 검색 => 데이터베이스 (검색:SELECT)
 *        Map : 두개를 동시에 저장 (key,value) => 도서 => ISBN/책 , 우편 : 우편번호/주소 , 국번/전화번호 
 *              => 웹에서 주로 사용되는 기법 => id=admin , pwd=admin1 
 *                 사용자가 요청시에 , 서버에서 브라우저로 전송 , 서버에 저장 , 브라우저에 저장 
 *                   HttpServletRequest   HttpServletResponse , HttpSesion , Cookie 
 *                 클래스저장 , SQL문장 찾기 
 *                 -------   ----------
 *                  스프링      마이바티스 
 *              => Hashtable / HashMap => (Hashtable 의 단점 보완)
 *              
 *        ==> 저장하는 데이터형을 명시한다 
 *            형식) 
 *                ArrayList<String>  <사용자정의 데이터형도 첨부> <?>(매개변수) 
 *                <? extends A>:A로부터 상속받은 클래스만 (사용자 정의 제네릭스 => 사용빈도가 없다) 
 *                                                         ----모든 데이터 
 *                Set<String>
 *                Map<String,Object>
 */
import java.util.*;
public class MainClass_제네릭스활용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. ArrayList 
		System.out.println("===== ArrayList에서 제네릭스 사용법 =====");
		ArrayList<String> list=new ArrayList<String>();
		// boolean java.util.ArrayList.add(String e)
		list.add("사과");
		list.add("배");
		list.add("수박");
		for(String f:list) // 형변환이 필요 없다 
			System.out.println(f);
		//ArrayList<String> ==> 데이터형 
		/*
		 *   void display(ArrayList list)
		 */
		//HashSet set=new HashSet(); // Object (모든 데이터형의 값을 첨부)
		HashSet<Integer> set=new HashSet<Integer>();
		// ==> set은 저장할 수 있는 데이터형은 int만 가능 
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(300);
		set.add(300);
		
		for(int i:set)
			System.out.println(i); // 중복을 허용하지 않는다 (Primary) => id
		// 데이터베이스 : 저장공간 (table)  ==> 반드시 중복이 않된 데이터가 1개 이상 필요 (이상현상) => 수정 , 삭제 
		System.out.println("======= Vector =======");
		Vector<Double> vec=new Vector<Double>();
		vec.add(89.9);
		vec.add(10.5);
		vec.add(30.6);
		for(double d:vec)
			System.out.println(d);
		System.out.println("======= LinkedList ======");
		LinkedList<Character> in=new LinkedList<Character>();
		in.add('A');
		in.add('B');
		in.add('C');
		for(char c:in)
			System.out.println(c);
		
		System.out.println("======Map =======");
		HashMap<String,Boolean> map=new HashMap<String,Boolean>();
		map.put("a", true);
		map.put("b", false);
		map.put("c", true);
		map.put("d", false);
		map.put("e", true);
		//       =================> id , boolean : 로그인상태확인 
		String[] key={"a","b","c","d","e"};
		for(String k:key)
		{
			System.out.println(map.get(k));
		}
		
	}

}









