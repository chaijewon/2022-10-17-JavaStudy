
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기";
        //System.out.println(data.length());
        if(data.length()>17)
        {
        	data=data.substring(0,17)+"...";// 화면 UI ==> card
        }
        System.out.println(data);
        
        String address="서울특별시 동대문구 전농로23길 78 1F 지번 서울시 동대문구 전농동 221-8 1F";
        String addr1=address.substring(0,address.lastIndexOf("지")).trim();
        System.out.println(addr1);
        String addr2=address.substring(address.indexOf("지")+3);
        System.out.println(addr2);
	}

}
