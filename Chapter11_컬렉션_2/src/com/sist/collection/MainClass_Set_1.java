package com.sist.collection;
import java.util.*;
class Student{
	String name;
	int age;
	public Student(String name,int age) 
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student)
		{
			Student s=(Student)obj;
			return name.equals(s.name) && age==s.age;
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+age;
	}
	// => 객체와 객체의 값을 가지고 비교 
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode();
	}
	
	
}
public class MainClass_Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set set=new HashSet();
        set.add(new Student("홍길동", 30));
        set.add(new Student("홍길동", 30));
        System.out.println(set);
	}

}
