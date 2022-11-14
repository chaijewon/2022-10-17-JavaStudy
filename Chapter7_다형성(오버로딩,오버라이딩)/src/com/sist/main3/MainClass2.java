package com.sist.main3;
/*
 *    super: 상위 클래스의 객체 ,this : 자신의 객체
 *      => 생성자, 인스턴스메소드에서 사용이 가능 (static메소드에서는 사용할 수 없다) 
 *    super():상위 클래스의 생성자,this(): 자신의 생성자를 호출시에 사용 
 *    ------------------------------
 *      생성자에서만 사용이 가능 
 *      => 첫줄에 사용한다 
 *      
 *    class A
 *    {
 *        int a,b,c; ==> super
 *        public A(){}
 *        public A(int a,int b){this.a=a;this.b=b;}
 *        public A(int a, int b,int c){}
 *    }
 *    class B
 *    {
 *        int a,b,c; ==> this
 *        public B()
 *        {
 *           super(); ==> public A(){}
 *           super(10,20); ==> public A(int a,int b){}
 *           super(10,20,30); ==> public A(int a, int b,int c){}
 *           super를 사용하지 않는 경우에는 자동으로 super() => 332page
 *        }
 *        public B(int a)
 *        {
 *           //this();
 *           super(100,200); // A=> a=100,b=200,c=0
 *           
 *           
 *        }
 *        자신외에 상위 클래스의 변수,메소드 제어가 가능하다 
 *        ---    --------
 *        this     super 
 *        => super는 가끔 
 *        => this는 자주 나온다 
 *    }
 */
class A
{
	int a,b,c;
	public A()
	{
		a=10; // 지역변수 => 멤버변수 
		// 충돌이 없는 상태면 this. 생략이 가능 ===> 지역변수나 매개변수가 우선 순위다 
		b=20;
		c=30;
	}
	public A(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public A(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
}
class B extends A
{
	int a,b,c;
	public B()
	{
		// super()
		a=100;
		b=200;
		c=300;
	}
	public B(int a,int b,int c)
	{
		//super(a,b,c);  ==> super() 자동 호출 this()
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void print()
	{
		System.out.println("this.a="+this.a); // B class가 가지고 있는 a,b,c
		System.out.println("this.b="+this.b);
		System.out.println("this.c="+this.c);
		
		System.out.println("super.a="+super.a);// A class가 가지고 있는 a,b,c
		System.out.println("super.b="+super.b);
		System.out.println("super.c="+super.c);
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //B b=new B(); // A a=new A();
		// true,false
        //b.print();
		// A , B , Object
		Object obj=new Object();
		A a=new A(); // A,Object
		B b=new B();// B , Object
		
		if(a instanceof Object)
			System.out.println(true);
		
		if(b instanceof Object)
			System.out.println(true);
		
		if(b instanceof A)
			System.out.println(true);
		
		if(b instanceof B)
			System.out.println(true);
		
		if(a instanceof B)
			System.out.println(false);//미수행
		
		//String s="";
		//if(s instanceof StringBuffer)
			
		
		// A는 Object다
		// B는 Object다
		// B는 A다
		// A는 B다 
		/*
		 *     동물(Object)
		 *       |
		 *     인간 (A)
		 *       |    |
		 *      남자 (B) 여자 
		 *      
		 */
			
	}

}
