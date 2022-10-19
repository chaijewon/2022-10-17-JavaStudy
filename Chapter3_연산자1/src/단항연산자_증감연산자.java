/*
 *   => 1.데이터형 (변수) => 데이터를 제어(가공):연산자 => 데이터제어(제어문) => 화면 출력 
 *                        ---------------------
 *   자바에서 지원하는 연산자 
 *                 -----
 *                  피연산자 , 연산자 
 *                  ------ 연산 대상 
 *                  피연산자 1개 (단항연산자)  -10
 *                  피연산자 2개 (이항연산자)  10 + 10
 *                  피연산자 3개 (삼항연산자)  ()?값:값
 *   단항연산자 : 데이터 한개를 연산 
 *     = 증감연산자 (++,--) : 한개를 증가,감소 (반복문)
 *     = 반전연산자 (~) : 양수 => 음수로 변환 
 *     = 부정연산자 (!) : 반드시 boolean만 사용이 가능  (!true)=false , !false=true (조건문)
 *        예약일이 아닐때 
 *     = 형변환연산자 : (type) => (int) , (double)....
 *     = 음수/양수 : - , +
 *   이항연산자 " 데이터가 2개일때 연산 
 *     = 산술연산자 : ( + , - , * , / , %)  ==> % 나누고 나머지 : 형변환 주의점 
 *     = 비트연산자 : ( & , | , ^ ) => 2진법 변경후 처리
 *          & => *  ,  | => +
 *     = 쉬프트연산자: 비트 이동 연산자 => <<(왼쪽이동) , >>(오른쪽 이동)
 *     = 비교연산자 : ==(같다), !=(같지 않다) , <(작다) , >(크다) , <=(작거나 같다) , >=(크거나 같다)
 *     = 논리연산자 : && (직렬연산자) , || (병렬연산자)
 *     = 대입연산자 : = , += , -= , *= , /= , %= ... op=
 *                     -------------------------------복합 대입 연산자 
 *     -----------------------------------------------------------------------------------
 *     = 기타 : 문자열 비교 , 객체 비교 
 *             equals()    instanceof
 *   삼항연산자 
 *      조건?값1: 값2
 *          --- ---
 *          true false ==> if~else
 *   ==> 연산자 사용 위치 =====> 제어문 (반복문 : 코테)
 */
public class 단항연산자_증감연산자 {
    /*
     *   증감연산자 (1개 증가(++) , 1개 감소(--))
     *   int a=10;
     *   a--; ==> 9
     *   int b=10;
     *   b++; ==> 11
     *   
     *   ===> 전치연산자  : 먼저 증가 
     *         ++a;
     *        후치연산자  : 나중 증가
     *         a++;
     *         
     *    int a=10;
     *    int b=++a; // 먼저 증가하고 증가된 값을 대입 
     *          ---
     *           1
     *        --
     *        2
     *    -----------------  a=11,b=11
     *    int a=10;
     *    int b=a++; // 먼저 대입하고 나중에 증가 
     *       --- --
     *        1  2
     *    a=11, b=10
     *    
     *    int a=10;
     *    int b=++a + a++ + a++ + ++a;  // a=14
     *          ---   ---   ---   ---
     *           11    11    12    14  ==> 48
     *           
     *    int a=10
     *    int b=++a + ++a;  a=12
     *          11     12   => 23
     *    int a=10;
     *    int b=a++ + a++; a=12
     *          10     11  b=21
     *          
     *    int a=10;
     *    int b=a++ + a++ + a++;  //a=13
     *          10    11    12   ==> 33
     *          
     *    int a=10;            11
     *    int b=++a + a++ + a-- + --a;  //a=10
     *           11   11    12    10  ==> 44
     *    
     *    int a=10;
     *    int b=--a + --a + a-- + a++; a=8
     *           9      8   8     7 ==> 32
     *           
     *    ================= 계산 방식 (컴파일러에 따라 결과값이 다르다)
     *    
     *    int a=10;
     *    int b = ++a;
     *            --
     *             1
     *          --
     *           2
     *    
     *    int a=10;
     *    int b=a++;
     *        ---
     *         1 --
     *           2
     *    ================== 증감 연산자 (int , char)
     *    
     *    char c='A';
     *    c++; ==> 'B'
     *    c++; ==> 'C'
     *    
     *    ==========> ++ , -- 무조건 (증가 1, 감소 1) ==> 저장된 데이터가 변경된다 => 반복문 
     *                게임 : 총알 , 자동으로 옆으로 이동 , 횟수 , 조회수 증가 
     *                
     *      
     *    
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=--a + --a + a-- + a++;
        System.out.println("b="+b);
        
        단항연산자_형변환연산자.method();
	}

}








