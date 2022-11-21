package com.sist.spring;
import java.io.*;
/*
 *      StringBuffer sb=new StringBuffer(); // 문자열을 저장하는 메모리 임시공간 (Buffer)
 *      ------------------------------------
 *      sb.append("Hello ");
 *                     0x100
 *      ---sb-----    -------------
 *        0x100   -->   Hello
 *      ---------     -------------
 *      
 *      sb.append("Java");
 *                     0x100
 *      ---sb-----    -------------
 *        0x100   -->   Hello Java
 *      ---------     -------------
 *      
 *      
 *      String s="Hello ";
 *                 0x100
 *      ---s---   ----------
 *       0x100      Hello
 *      ------    ----------
 *      
 *      String s="Hello "+"Java" ==> s.concat("Java")
 *                 0x100 ========> GC대상 
 *      ---s---   -----------
 *       0x200       Hello
 *      -------   -----------
 *              ↘
 *                0x200
 *                --------------
 *                  Hello Java
 *                --------------
 *      
 */
public class MainClass_StringBuffer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FileReader fr=null;
		try
        {
        	fr=new FileReader("c:\\javaDev\\movie.txt");
        	StringBuffer sb=new StringBuffer();
        	int i=0;
        	while((i=fr.read())!=-1)
        	{
        		sb.append(String.valueOf((char)i));//문자열 결합 ==> 최적화 
        	}
        	System.out.println(sb.toString());
        	// 문자열 결합 => append() , String변경 => toString()
        	// public StringBuffer append(String s)
        	// 오버로딩  ==>  append(boolean b) append(char[] c) append(int i)... => 문자열로 변경이 된다 
        	// public String toString() 
        	// ==> 데이터 읽기가 끝나면 ==> String으로 변환 (String으로 제어)
        }catch(Exception ex) {}
        finally
        {
        	try
        	{
        		fr.close();
        	}catch(Exception ex) {}
        }
	}

}
