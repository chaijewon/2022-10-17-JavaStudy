package com.sist.game;

class A
{
	private void display() {}
	public void aaa() {}
}
class B extends A
{
	
}
interface 동물{
	public final static int a=100;
	void eat(); // public abstract void eat();
	void run();
	default void aaa()
	{
		
	}
	
}
class 말 implements 동물
{
	@Override
	public void aaa() {
		
	}
	public void eat()
	{
		
	}
	public void run()
	{
		
	}
}
class 소 implements 동물
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
interface Printable {
    String toner="";
    abstract void print();
}
public class MainClass implements Printable {
    public static void main(String[] args) {
        //new Printable();
        new MainClass();
    }
    public void print() {}
}

/*public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
