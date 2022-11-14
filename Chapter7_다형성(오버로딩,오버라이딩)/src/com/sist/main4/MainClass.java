package com.sist.main4;
/*
 *    A a=new B();
 *    A a=new C();
 *    
 *    --------------
 *    B b=new D();
 *    B b=new E();
 *    B b=new B();
 *    --------------
 *    
 *    C c=new F();
 */
class A
{
	public void display()
	{
		System.out.println("A:display() Call...");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("B:display() Call...");// 오버라이딩
	}
}
class C extends A
{
	
}
class D extends B
{
	public void display()
	{
		System.out.println("D:display() Call...");//오버라이딩
	}
	// 메소드 추가 
	public void ddd()
	{
		System.out.println("D:ddd() Call...");
	}
}
class E extends B
{
	public void display()
	{
		System.out.println("E:display() Call...");//오버라이딩 
	}
}
class F extends C
{
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //B b=new D();
       //B b1=new E();
        //B b2=new B();
        //B b3=(B)new A();
        //A a=new B();
        //B b3=(B)a;
		B b1=new D();// 오버라이딩된 메소드만 접근이 가능 
		// display()
		b1.display(); //D가 가지고 있는 메소드호출
		// b1접근 불가능 
		//b1.ddd();
		D d=new D();
		// ddd(),display()
		d.display();
		// d접근 가능 
		d.ddd();
		D d1=(D)b1;
		// ddd(0,display()
		d1.display();
		// d1접근 가능 
		d1.ddd();
		new D().display();// 객체가 필요없는 경우 
		// 접근이 가능 
		new D().ddd();
		// ddd(),display()
	}

}
