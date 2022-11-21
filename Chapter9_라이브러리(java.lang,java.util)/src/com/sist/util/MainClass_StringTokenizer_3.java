package com.sist.util;

import java.lang.reflect.Method;
import java.util.StringTokenizer;

class Member
{
	private String id;
	private String pwd;
	private String sex;
	private String name;
	private String tel;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
public class MainClass_StringTokenizer_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="list.jsp?id=admin&pwd=1234&sex=남자&name=홍길동&tel=010-1111-1111";
        data=data.substring(data.indexOf("?")+1);
        System.out.println(data);
        StringTokenizer st=new StringTokenizer(data,"&");
        try
        {
          Class clsName=Class.forName("com.sist.util.Member");// CheckedException (컴파일시 예외 검색)
          Object obj=clsName.getDeclaredConstructor().newInstance();
          // 메모리 할당
          Method[] methods=clsName.getDeclaredMethods();
          while(st.hasMoreTokens())
          {
        	//System.out.println(st.nextToken());
        	StringTokenizer st2=new StringTokenizer(st.nextToken(),"=");
        	//System.out.println(st2.nextToken());
        	//System.out.println(st2.nextToken());
        	String prefix=st2.nextToken();
        	String suffix=st2.nextToken();
        	
        	for(Method m:methods)
        	{
        		String name=m.getName();
        		if(name.equalsIgnoreCase("set"+prefix))
        		{
        			m.invoke(obj, suffix);
        		}
        	}
        	
          }
          // 출력 
          Member mem=(Member)obj;
          System.out.println("ID:"+mem.getId());
          System.out.println("Password:"+mem.getPwd());
          System.out.println("Sex:"+mem.getSex());
          System.out.println("Name:"+mem.getName());
          System.out.println("Tel:"+mem.getTel());
        }catch(Exception ex){}
	}

}






