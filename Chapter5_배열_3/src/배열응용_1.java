import java.util.Arrays;

// 5개 점수를 저장한 다음에 ==> 총합 / 평균  ==> 196
// 응용 ==> 3명의 학생 국어,영어 ,수학 ==> 총점/평균/학점 ==> 등수
// 숫자 야구 게임 

public class 배열응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] score=new int[5];//선언 
        for(int i=0;i<score.length;i++)// 필요한 값을 저장
        {
        	score[i]=(int)(Math.random()*71)+30;//30~100
        	//              0~79 ==> 30~100
        }
        System.out.println(Arrays.toString(score));
        // 총합 / 평균 
        int total=0;
        //double avg=0.0;
        for(int i:score)
        {
        	total+=i;
        }
        // 출력
        System.out.println("총합:"+total);
        System.out.printf("%.2f\n",total/(double)score.length);
	}

}
