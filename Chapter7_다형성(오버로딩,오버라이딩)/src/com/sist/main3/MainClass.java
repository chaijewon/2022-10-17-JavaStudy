package com.sist.main3;
// Object => super
/*
 *       Object 
 *         |
 *       Super
 *         |
 *        Sub
 */
class Super 
{
	int a,b;
	public Super(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public Super()
	{
		a=1000;
		b=2000;
	}
	public void print()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
class Sub extends Super // Super 메모리 할당(생성자호출=>기본생성자) => Sub 메모리 할당 
{
	int c;
	int a,b;
	public Sub(int a,int b,int c)
	{
		// 상위 클래스의 생성자를 먼저 호출해야 된다 
		super(a,b);// 상속 내린 클래스의 생성자 호출 
		this.a=100;
		this.b=200;
		this.c=c;
	}
	public void print()
	{
		System.out.println("super.a="+super.a);// 상속내린 클래스의 객체 => super
		System.out.println("super.b="+super.b);
		System.out.println("this.a="+a); // 본인 클래스의 객체 => this (this는 변수충돌이 없는 경우에 생략이 가능)
		System.out.println("this.b="+b);
		System.out.println("this.c="+c);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sub sub=new Sub(10,20,30);
        sub.print();
	}

}
