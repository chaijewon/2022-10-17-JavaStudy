package com.sist.collection;
import java.util.*;
// input=0 / output=0
// input=0 / output=length-1
/*
 *   for(int i=0;i<arr.size();i++) ==> Queue
 *   for(int i=arr.size()-1;i>=0;i--) ==> Stack
 */
public class MainClass_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue q=new LinkedList();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        
        while(!q.isEmpty())
        {
        	System.out.println(q.poll());
        }
	}

}
