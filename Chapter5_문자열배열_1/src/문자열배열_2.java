import java.util.Scanner;
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] books= {
        	"Java And Oracle",
        	"Java And JSP",
        	"HTML5 & CSS3",
        	"Spring & VueJS",
        	"SpringBoot & ReactJS",
        	"JPA와 Java",
        	"MyBatis & Java",
        	"혼자 배우는 자바",
        	"Java의 정석"
        };
        // 1. 전체 목록 출력 
        System.out.println("========== 전체 출력 ============");
        for(int i=0;i<books.length;i++)
        {
        	System.out.println((i+1)+"."+books[i]);
        }
        System.out.println("===============================");
        //
	}

}
