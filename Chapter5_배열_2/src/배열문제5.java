import java.util.Arrays;

/*
 *  5. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 
 *  그리고 배열에 든 숫자들과 평균을 출력하라. 

 */
public class 배열문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 정수를 10개 저장하는 배열을 만들고
		int[] arr=new int[10];
		// 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		// 배열에 든 숫자출력
		System.out.println(Arrays.toString(arr));
		// 평균을 출력
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		
		System.out.printf("평균:%.1f\n",sum/(double)arr.length);
	}

}
