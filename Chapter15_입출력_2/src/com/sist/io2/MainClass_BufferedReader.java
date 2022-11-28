package com.sist.io2;
// FileReader에 대한 보조 스트림 => BufferedReader는 많이 사용되는 클래스 => 한줄씩 읽을 수 있다 
// 사용자의 입력값을 받을 때 ==> Scanner(X) , BufferedReader 
import java.util.*;
import java.io.*;
public class MainClass_BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// 서버에서 전송값 받기 , 웹에 있는 HTML , 클라이언트 전송값 
        	BufferedReader in=
        		new BufferedReader(new InputStreamReader(new FileInputStream("c:\\javaDev\\movie.txt")));
        	// InputStream(1byte) ==> Reader(2byte)변경 
        	while(true)
        	{
        		String movie=in.readLine(); // 한줄씩 
        		if(movie==null) break;
        		System.out.println(movie);
        	}
        	in.close();
        	
        }catch(Exception ex){}
	}

}
