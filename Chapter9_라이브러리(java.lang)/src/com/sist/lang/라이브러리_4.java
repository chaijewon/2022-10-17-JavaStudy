package com.sist.lang;

import java.util.Arrays;

// clone ==> 복제(깊은 복사) / 참조(얕은 복사) 
public class 라이브러리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Call By Reference 
        int[] arr={10,20,30,40,50};
        int[] copy=arr.clone(); // 다른 메모리에 같은 값을 가지고 있는 메모리 복사한다 
        System.out.println("arr:"+arr);
        System.out.println("copy:"+copy);
        // 참조 
        System.out.println("=== arr ===");
        System.out.println(Arrays.toString(arr));
        System.out.println("=== copy ===");
        System.out.println(Arrays.toString(copy));
        System.out.println("===== 변경후====");
        arr[0]=100;
        arr[1]=200;
        System.out.println("=== arr ===");
        System.out.println(Arrays.toString(arr));
        System.out.println("=== copy ===");
        System.out.println(Arrays.toString(copy));
        copy[2]=300;
        copy[3]=400;
        System.out.println("=== arr ===");
        System.out.println(Arrays.toString(arr));
        System.out.println("=== copy ===");
        System.out.println(Arrays.toString(copy));
        
        
	}

}
