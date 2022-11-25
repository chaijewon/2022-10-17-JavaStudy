package com.sist.genrics;
import java.util.*;
class A
{
	
}
class B extends A
{
	
}
class C extends A
{
	
}
class D extends C //A
{
	
}
class E
{
	
}
/*
 *       <? extends A>
 *         A
 *         |
 *      ---------
 *      |       |
 *     B        C
 *              |
 *              D ==> 상속과 관련된 클래스로 제한 
 *              
 *     E
 *     
 *     <?> ==> 모든 클래스가 가능 (Object) ==>  한개의 매소드를 이용해서 => 여러개의 데이터를 받는 경우 
 *     ArrayList
 *     ArrayList<?>
 *     
 *     ***** 데이터형을 잘 모른다 : Object통합 
 *     ***** 클래스가 여러개 => 한개로 제어 (Object)
 *     ***** 집합체 (배열 , 컬렉션) ==> 데이터형을 통일해서 사용해야 제어하기 쉽다 
 *     ***** 여러개의 데이터를 통합하지 않으면 제어가 어렵다 => 한개의 이름으로 통일 
 *     int a=10,b=20,c=30,d=40,e=50....;
 *     int[] arr={a,b,c,d....}
 *     
 *     
 *     class A 
 *     class B 
 *     class C
 *     ...
 *     ...
 *     
 *     Object[] obj={A,B,C...}
 *     
 *     interface E
 *     class A  implements E
 *     class B  implements E
 *     class C  implements E
 *     ...
 *     ...
 *     
 *     일반 데이터형은 통일시에 => 배열 
 *     일반 클래스 통일시에는 주로 인터페이스 (여러개의 클래스를 묶어서 관리)
 *         
 */
public class MainClass_제넥릭스_제한 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<? extends A> list1=new ArrayList<A>(); // A로 상속을 받은 자식클래스까지 사용이 가능 
        ArrayList<? extends A> list2=new ArrayList<B>();
        ArrayList<? extends A> list3=new ArrayList<C>();
        ArrayList<? extends A> list4=new ArrayList<D>();
        //ArrayList<? extends A> list5=new ArrayList<E>();
        
	}

}
