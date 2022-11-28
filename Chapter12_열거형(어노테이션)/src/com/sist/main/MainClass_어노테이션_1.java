package com.sist.main;
/*
 *   어노테이션 => 구분(인덱스 ==> if대신 사용) @어노테이션명 => 이미 지정된 라이브러리 , 사용자 정의 
 *   @ => 클래스 구분 (TYPE)
 *     => 스프링 : @Controller , @RestController , @Repository , @Service , @Component ,
 *               @ControllerAdvice 
 *               -------------------- 메모리 할당여부 (구분)
 *   public class A
 *   {
 *       @ => 멤버변수 구분 (FIELD)
 *         => 스프링 : @Autowired , @Resource ==> 주소값 대입 (자동)
 *       private B b;
 *       
 *       @ => 생성자 구분 (CONSTRUCTOR)
 *         => @Autowired 
 *       public A()
 *       {
 *       }
 *       
 *       @ => 메소드 구분 (METHOD)
 *         => @RequestMapping , @GetMapping , @PostMapping
 *       public void display(@ => 매개변수 구분 (PARAMETER) B b)
 *       {
 *       }
 *   }
 */
import java.util.*;
class Board{
	
	public void write() // write.do
	{
		System.out.println("글쓰기 처리...");
	}
	public void list() // list.do
	{
		System.out.println("게시물 목록 출력...");
	}
	public void update() // update.do
	{
		System.out.println("게시물 수정하기");
	}
	public void delete() // delete.do
	{
		System.out.println("게시물 삭제...");
	}
	public void find() // find.do
	{
		System.out.println("게시물 찾기...");
	}
	public void detail() // detail.do
	{
		System.out.println("상세보기");
	}
}
public class MainClass_어노테이션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("기능 요청:");
        String cmd=scan.next();
        
        Board board=new Board();
        if(cmd.equals("write.do"))
        	board.write();
        else if(cmd.equals("list.do"))
        	board.list();
        else if(cmd.equals("update.do"))
        	board.update();
        else if(cmd.equals("delete.do"))
        	board.delete();
        else if(cmd.equals("find.do"))
        	board.find();
        else if(cmd.equals("detail.do"))
        	board.detail();
	}

}









