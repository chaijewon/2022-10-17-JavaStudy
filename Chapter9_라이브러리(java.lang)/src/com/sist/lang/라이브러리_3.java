package com.sist.lang;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class 라이브러리_3 extends JFrame implements ItemListener{
    JComboBox box=new JComboBox();
    JLabel la=new JLabel();
    public 라이브러리_3()
    {
    	// 객체 생성 / 배치 
    	box.addItem("m1.jpg");
    	box.addItem("m2.jpg");
    	box.addItem("m3.jpg");
    	box.addItem("m4.jpg");
    	box.addItem("m5.jpg");
    	box.addItem("m6.jpg");
    	box.addItem("m7.jpg");
    	
    	add("North",box);
    	add("Center",la);
    	setSize(350, 450);
    	setVisible(true);
    	
    	// 등록 
    	box.addItemListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new 라이브러리_3();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)// 콤보에서 선택이 된 경우에 처리
		{
			// 메소드에서 리턴형이 Object일 경우 ==> 문자열 변환 할때 사용 ==>  toString()
			// 1. 멤버변수의 초기값 확인 ==> 오버라이딩을 해서 사용 
			// 2. Object => String으로 변환 
			String image=box.getSelectedItem().toString();// Object => String으로 변경 
			la.setIcon(new ImageIcon("c:\\javaDev\\"+image));
		}
	}

}
