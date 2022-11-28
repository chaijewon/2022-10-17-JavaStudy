package com.sist.io;
import java.io.FileInputStream;
import java.util.*;
public class MainClass_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileInputStream fis=new FileInputStream("c:\\download\\sawon.txt");
        	// 파일 읽기 / 파일 쓰기 전용이 아니고 파일 복사 (다운로드/업로드)
        	int i=0; // 한글자 읽기 ==> 글자마다 번호를 출력 
        	while((i=fis.read())!=-1) // -1 EOF(파일의 끝)
        	{
        		System.out.print((char)i);
        	}
        	fis.close();
        	
        }catch(Exception ex){}
	}

}
