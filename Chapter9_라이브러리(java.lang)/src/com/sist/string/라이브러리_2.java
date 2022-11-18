package com.sist.string;
import java.util.Scanner;
import java.io.*;
public class 라이브러리_2 {
    public static String[] musicAllData()
    {
    	String[] music=new String[100];
    	// IO ==> 모든 클래스가 컴파일예외 (CheckedException) => 반드시 예외처리를 하고 사용한다 (파일명,경로명)
    	// 직접 처리 ==> try~catch~finally 
    	/*try(FileReader fr=new FileReader("");) // 파일을 자동으로 닫는다 
    	{
    		
    	}catch(Exception ex){}*/
    	FileReader fr=null;
    	try
    	{
    		fr=new FileReader("c:\\javaDev\\genie.txt");
    		int i=0;
    		String data="";
    		while((i=fr.read())!=-1) // 파일이 끝날때까지 읽기
    		{
    			data+=String.valueOf((char)i);
    		}
    		//System.out.println(data);
    		String[] musicData=data.split("\n");
    		// split ==> 구분자별로 단어를 배열에 저장 
    		// 0|That That (Prod. & Feat. SUGA of BTS)|싸이 (Psy)|싸다9|8dJyRm2jJ-U
    		int k=0;
    		for(String m:musicData)
    		{
    			String[] tmp=m.split("\\|");
    			music[k]=tmp[1]; // 제목 저장 
    		    k++;	
    		}
    		
    	}catch(Exception ex)
    	{
    		// 오류 확인 
    		ex.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    			if(fr!=null)
    				fr.close();
    		}catch(Exception ex){}
    	}
    	return music;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] title=musicAllData();
        for(String s:title)
        {
        	System.out.println(s);
        }
	}

}
