/*
 *   arr 배열 중에서 인덱스가 1인 곳의 값을 출력해보자.
     int[] arr = { 10, 20, 30, 50, 3, 60, -3 };  
       ==> arr[1]
     arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
     int[] arr = { 10, 20, 30, 50, 3, 60, -3 };  
 

 */
public class 배열문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,50,3,60,-3};
		System.out.println(arr[1]);
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==60)
			{
				
				System.out.println("인덱스는 "+i);
				break;
			}
		}
		
		
	}

}
