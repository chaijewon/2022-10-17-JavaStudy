package com.sist.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
class Sawon{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
public class MainClass_FileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileOutputStream fos=new FileOutputStream("c:\\download\\sawon.txt",true);
        	// 파일에 저장 => OutputStream => byte로 전환 (바이트 스트림) => 1bytes => 
        	// 한글 => FileWriter
        	// w => 파일을 새롭게 생성 (create)
        	// FileOutputStream fos=new FileOutputStream("c:\\download\\sawon.txt");
        	// a => 기존의 파일에 추가  (append)
        	// FileOutputStream fos=new FileOutputStream("c:\\download\\sawon.txt",true);
        	// 파일에 저장 
        	Scanner scan=new Scanner(System.in);
        	System.out.print("사번 입력:");
        	Sawon sa=new Sawon();
        	sa.setSabun(scan.nextInt());
        	System.out.print("이름 입력:");
        	sa.setName(scan.next());
        	System.out.print("부서명 입력:");
        	sa.setDept(scan.next());
        	System.out.print("근무지 입력:");
        	sa.setLoc(scan.next());
        	String save=sa.getSabun()+"|"+sa.getName()+"|"+sa.getDept()+"|"+sa.getLoc()+"\n";
        	fos.write(save.getBytes());// 문자열을 byte[]로 변환 : getBytes() 
        	fos.close();
        	//System.out.println(Arrays.toString(save.getBytes()));
        	System.out.println("사원 저장 완료!!");
        }catch(Exception ex){}
	}

}




