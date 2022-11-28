package com.sist.io;
/*
 *    1. 스트림 : 데이터 이동 통로 
 *              Queue (FIFO) 
 *              => 송수신 : 1byte / 2byte (~Reader,~Writer) => 한글 
 *                        -----   ------
 *                          |    
 *                        ~InputStream  ==> read()
 *                        ~OutputStream ==> write() => close()
 *              => txt (Reader/Writer) 
 *              -------------------------------------------------
 *              => XML(DoucmentBilder) , HTML(Jsoup) 
 *              => JSON(Simple-Json)
 *              => Ajax , VueJS (JSON) , React(XML,JSON)
 *              -------------------------------------------------
 *              File을 중심으로 => 다운로드 / 업로드 , 추천 => 카페,블로그 
 *              -------------------------------------------------
 *              1) File 
 *              2) FileInputStream / FileOutputStream 
 *              3) FileReader / FileWriter
 *              4) BufferedReader => 웹 데이터를 읽어 올때 
 *              5) ObjectInputStream / ObjectOutputStream (객체 단위로 저장)
 *                 => 역직렬화 , 직렬화 
 *              -------------------------------------------------------- 
 *              
 *              868page 
 *              --------
 *              입출력 (입력(Input),출력(Output))
 *              -----
 *               메모리 
 *                = 표준 입출력 
 *                  System.in , System.out 
 *                        ----         ----
 *                        InputStream   OutputStream 
 *                  Stream : 데이터를 이동하는 통로 
 *                  클라이언트 전송 =====> 서버에 값을 받는다 
 *                  --------------------------------
 *                     보내는 것이 아니라 => 저장된 위치를 알려준다 (그 위치로부터 값을 읽어 온다)
 *                     => 데이터를 잃어버리지 않는다 (데이터 손실이 없다)
 *                     => 스트림의 단점 : 단방향 (양방향 => 쓰레드)  
 *                     => 빨대 
 *                     => FIFO(Queue) 
 *               라이브러리 
 *               -------
 *                  |
 *                  = 바이트기반 스트림 (1byte씩 송수신) => 다운로드/업로드
 *                  = 문자기반 스트림 (2byte 송수신) => 한글 파일을 읽어 올때 
 *                                                *** 한글은 1글자당 2byte이다 (UTF-8)
 *                                                *** 이클립스 : EUC-KR => 운영체제
 *                                                    -------------------------
 *                                                    AWS 리눅스 => 통일 (UTF-8) 
 *                                                    ==> 클래스명,메소드명,변수명 , 테이블명, 파일명 => 통일
 *                  = 보조 스트림 => 읽는 속도 , 쓰는 속도를 빨리하기 위해서 미리 메모리에 올려놓고 시작 
 *                    Buffered=> InputStream / OutputStream 
 *                    =>         Reader / Writer   
 *                  = 객체기반 스트림 : 파일 저장 => 객체단위 저장 (ArrayList)
 *                    ObjectInputStream / ObjectOutputStream
 *                    --------------------------------------
 *               파일 
 *                 = File  (파일 , 디렉토리) => 정보 
 *                 = 파일 읽기 : FileInputStream /  FileReader
 *                 = 파일 쓰기 : FileOutputStream / FileWriter
 *                 ------------------------------------------
 *               네트워크 
 *                -----------------------------------------------
 *                 = 전송 : OutputStream ======> 1byte
 *                 = 수신 : BufferedReader ====> 2byte로 변환 
 *                ----------------------------------------------- Socket
 *                
 *                메소드 : read() , write() , close()
 *                       read() : 한글자 읽기 
 *                       read(byte[],int,int) => 데이터를 모아서 읽기 
 *                       
 *                        write() : 한글자 저장 
 *                        write(byte[],int ,int)
 *                ---> 컴파일 에외처리 ==> 반드시 예외처리 한다 
 *              
 */
// 869page 
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
public class MainClass_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	//File 관련 
        	//1. File목록 읽기 : File[] listFiles()
         	
        	//2. File만들기 / 디렉토리 만들기 createNewFile() , mkdir()
        	//3. File 속성 
        	//4. = 파일명 / 경로명 / 파일+경로명 / 수정날짜 , 디렉토리,파일 여부 확인 / 숨김, 쓰기,읽기 
        	//     getName() getParent() , getPath() lastModified , isFile , isDriectory
        	//     canWrite , canRead isHidden
        	/*File dir=new File("c:\\javaDev"); // 디렉터리 
        	File[] files=dir.listFiles();
        	for(File f:files)
        	{
        		if(f.isDirectory()) // 폴더인 경우 
        			System.out.println("<DIR>"+f.getName());
        		else
        			// 파일일 경우
        		    System.out.println(f.getName());
        	}*/
        	// 폴더 만들기 : mkdir()
        	File file=new File("c:\\download\\sawon.txt");
        	/*if(!dir.exists()) // 폴더가 없다면 ==> exists() : 존재여부 확인 
        	{
        		dir.mkdir();
        	}*/
        	// 파일 만들기 : createNewFile
        	/*if(!file.exists())
        	{
        		file.createNewFile();
        	}*/
        	// 파일에 대한 정보 확인
        	System.out.println("파일명:"+file.getName());
        	System.out.println("경로명:"+file.getParent());
        	System.out.println("경로+파일:"+file.getPath());
        	System.out.println("파일크기:"+file.length());
        	SimpleDateFormat sdf=new SimpleDateFormat("yyyy년도 MM월 dd일 hh시 mm분 ss초");
        	System.out.println("파일수정일:"+sdf.format(new Date(file.lastModified())));
        	System.out.println("수정일:"+file.lastModified());
        	System.out.println("숨김파일:"+file.isHidden());
        	System.out.println("읽기전용:"+file.canRead());// -r
        	System.out.println("쓰기전용:"+file.canWrite());// -w
        }catch(Exception ex){}
	}

}







