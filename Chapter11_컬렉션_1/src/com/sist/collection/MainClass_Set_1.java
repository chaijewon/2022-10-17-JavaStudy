package com.sist.collection;
// ArrayList , HashSet , HashMap 
import java.util.*;
// CBD ==> Component Base Developer
// 이미 만들어진 라이브러리를 이용해서 프로그램 조립해서 만든다 (자바)
//                                 -----
public class MainClass_Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set set=new HashSet();
        for(;;)
        {
        	int r=(int)(Math.random()*45)+1;
        	set.add(r);
        	if(set.size()==6)
        		break;
        }
        System.out.println(set);
        // List로 변환 
        List list=new ArrayList(set); // sort이용 => Set => List로 변환 
        Collections.sort(list);//ASC
        System.out.println(list);
        for(int i=list.size()-1;i>=0;i--)
        {
        	System.out.print(list.get(i)+" ");
        }
        
	}

}
