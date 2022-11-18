package com.sist.lang;
// Class객체 얻기 
class Card
{
	private int number;
	private String type;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
public class 라이브러리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 메모리 할당 
		Card card1=new Card();
		card1.setNumber(1);
		card1.setType("◆");
		
		System.out.println("card1.number:"+card1.getNumber());
		System.out.println("card1.type:"+card1.getType());
		
		// 메모리 할당 2
		try
		{
		    Class clsName=Class.forName("com.sist.lang.Card");// 데이터베이스 => Driver
		    // CheckedException ==> ClassNaotFoundException ==> 예외처리가 필요하다 
		    // 클래스 이름으로 메모리를 할당 
		    Object obj=clsName.getDeclaredConstructor().newInstance();
		    //Object obj2=clsName.newInstance();// 경고 (사용금지 권고)
		    
		     Card c2=(Card)obj;
		     c2.setNumber(2);
		     c2.setType("♠");
		     
		     System.out.println(c2.getNumber());
		     System.out.println(c2.getType());
		}catch(Exception ex){}
		
		
	}

}








