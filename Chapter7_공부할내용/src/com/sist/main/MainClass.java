package com.sist.main;
class A
{
	
}
/*
 *     int a=10;
 *     int a1=20;
 *     ...
 *     ...
 *     ...
 *     int a9=100;
 *     
 *     ==================>
 *     int a=10;
 *     a=20;
 *     a=30;
 *     
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=null;
        for(int i=1;i<=10;i++)
        {
        	a=new A();
        	System.out.println("a="+a);
        }
	}

}
