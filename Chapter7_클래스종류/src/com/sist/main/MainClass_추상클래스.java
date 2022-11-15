package com.sist.main;
abstract class Board
{
	public abstract void boardList();
	public abstract void boardInsert();
	public abstract void boardDetail();
	public abstract void boardUpdate();
	public abstract void boardDelete();
	public abstract void boardFind();
	public void login()
	{
		// 구현부 
	}
}
// 묻고 답하기 
class 묻고답하기 extends Board
{

	@Override
	public void boardList() {
		// TODO Auto-generated method stub
		System.out.println("묻고 답하기 목록 출력....");
		/*
		 *     aaaaaaaa
		 *      =>bbbbbbb
		 */
	}

	@Override
	public void boardInsert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardDetail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardFind() {
		// TODO Auto-generated method stub
		
	}
	
}
// 일반 게시판 
class 일반게시판 extends Board
{

	@Override
	public void boardList() {
		// TODO Auto-generated method stub
		System.out.println("일반게시판 목록 출력....");
	}

	@Override
	public void boardInsert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardDetail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardFind() {
		// TODO Auto-generated method stub
		
	}
	
}
// 댓글 게시판 
class 댓글게시판 extends Board
{

	@Override
	public void boardList() {
		// TODO Auto-generated method stub
		System.out.println("댓글형 목록 출력....");
	}

	@Override
	public void boardInsert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardDetail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardFind() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		super.login();
	}
	
	
}
// 갤러리게시판 
// ==> 목록 출력 , 글쓰기 , 상세보기 , 수정 , 삭제 , 검색 ==> 선언
// ==> 로그인 ==> 선택 ==> 구현 
// ==> 윈도우 / 스프링 
// ==> 스프링 
class Container
{
	static Board board=null;
	public static Board getBoard(String type)
	{
		if(type.equals("일반"))
			board=new 일반게시판();
		else if(type.equals("답하기"))
			board=new 묻고답하기();
		else if(type.equals("댓글"))
			board=new 댓글게시판();
		
		return board;
	}
}
public class MainClass_추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Board board=Container.getBoard("일반");
        board.boardList();
        board=Container.getBoard("답하기");
        board.boardList();
	}

}
