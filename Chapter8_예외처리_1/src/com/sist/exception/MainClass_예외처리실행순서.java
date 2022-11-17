package com.sist.exception;

public class MainClass_예외처리실행순서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
        try
        {
        	System.out.println(3);
        	System.out.println(10/0);// => catch이동 
        	System.out.println(5);
        }catch(RuntimeException ex)
        {
        	System.out.println(6);
        }
        finally
        {
        	System.out.println(7);
        }
        System.out.println(8);
        System.out.println(9);
        // 1 2 3 4 5 7 8 9
        // 1 2 3 6 7 8 9
	}

}
