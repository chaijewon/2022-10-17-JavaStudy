class A
{
	int a=10;
	static int b=20;
	
	{
		a=100;
	}
	
	static
	{
		b=200;
	}
	
	A()
	{
		a=1000;
		b=2000;
	}
}
/*
 *  1. 명시적 초기화 
 *  2. 명시적 초기화가 불가능 
 *     인스턴스 : 생성자를 이용해서 초기화 (********)
 *     static : static{} => 가끔 (MyBatis)
 */
public class 초기화블록_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A();
        /*     b
         *    -----  -----  ------  -------
         *      0     20      200     2000
         *    -----  -----  ------  -------
         *    a
         *    -----  ----  ------  -------
         *      0     10    100      1000
         *    -----  ----  ------   -------
         */
	}

}
