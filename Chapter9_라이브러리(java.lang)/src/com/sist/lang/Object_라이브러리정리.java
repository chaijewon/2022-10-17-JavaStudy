package com.sist.lang;
/*
 *    Object는 모든 클래스에 상속을 내리는 클래스(최상위 클래스)
 *    ======= 생성된 모든 클래스는 Object에서 제공하는 메소드를 사용할 수 있다 
 *    1) 기능 
 *       public boolean equals(Object obj) : 객체 비교시 사용하는 메소드 
 *       ***protected Object clone() : 객체 복제 (같은 값을 가지고 있는 새로운 객체 생성)
 *       ***protected void finalize(): 소멸자 (호출 => 객체가 메모리에서 소멸) => 자동 호출 
 *                                  => gc()
 *                                     1. 객체가 null이거나 
 *                                     2. 사용이 없는 경우 
 *                                     ====================> gc대상  => 직접 처리 (System.gc())
 *       public Class getClass() : 클래스 객체를 얻은 방법 
 *       -------------------------- Class.forName()
 *       ***public String toString() : 객체를 문자열로 변환 
 *       
 */
public class Object_라이브러리정리 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
