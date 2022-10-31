import java.util.Arrays;

/*
 *   양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
 */
public class 배열문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 10 저장하는 공간 
		int[] arr=new int[10];
		// 초기화 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 화면 출력 
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)// 인덱스를 이용해서 값을 얻어 온다 
		{
			if(arr[i]%3==0)
				System.out.print(arr[i]+" ");
		}
		/*
		 *   for(int i:arr) // 실제 저장된 값을 얻오 온다 
		     {
			   if(i%3==0)
				System.out.print(i+" ");
		    }
		 */
	}

}
