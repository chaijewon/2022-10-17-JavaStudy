package com.sist.io;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class 자리배치 extends JFrame implements Runnable,ActionListener{
    JProgressBar bar1,bar2,bar3,bar4;
    JLabel la1,la2,la3,la4;
    JButton b;
    public 자리배치()
    {
    	bar1=new JProgressBar();
    	bar1.setMaximum(100);
    	bar1.setMinimum(0);
    	bar1.setStringPainted(true);
    	bar1.setForeground(Color.pink);
    	bar1.setBackground(Color.white);
    	
    	bar2=new JProgressBar();
    	bar2.setMaximum(100);
    	bar2.setMinimum(0);
    	bar2.setStringPainted(true);
    	bar2.setForeground(Color.cyan);
    	bar2.setBackground(Color.white);
    	
    	bar3=new JProgressBar();
    	bar3.setMaximum(100);
    	bar3.setMinimum(0);
    	bar3.setStringPainted(true);
    	bar3.setForeground(Color.magenta);
    	bar3.setBackground(Color.white);
    	
    	bar4=new JProgressBar();
    	bar4.setMaximum(100);
    	bar4.setMinimum(0);
    	bar4.setStringPainted(true);
    	bar4.setForeground(Color.yellow);
    	bar4.setBackground(Color.white);
    	
    	
    	la1=new JLabel("3,4조");
    	la2=new JLabel("1,2조");
    	la3=new JLabel("1조");
    	la4=new JLabel("4조");
    	
    	setLayout(null);
    	
    	la1.setBounds(10, 150, 60, 30);
    	bar1.setBounds(75, 150, 300, 30);
    	
    	la2.setBounds(10, 185, 60, 30);
    	bar2.setBounds(75, 185, 300, 30);
    	
    	la3.setBounds(10, 220, 60, 30);
    	bar3.setBounds(75, 220, 300, 30);
    	
    	la4.setBounds(10, 250, 60, 30);
    	bar4.setBounds(75, 250, 300, 30);
    	
    	b=new JButton("Start");
    	b.setBounds(10, 100, 150, 30);
    	add(la1);add(bar1);
    	add(la2);add(bar2);
    	add(la3);add(bar3);
    	add(la4);add(bar4);
    	add(b);
    	setSize(415,330);
    	setVisible(true);
    	
    	b.addActionListener(this);
    }
    public void go()
    {
    	int a=(int)(Math.random()*101);
    	int b=(int)(Math.random()*101);
    	//int c=(int)(Math.random()*101);
    	//int d=(int)(Math.random()*101);
    	
    	for(int i=0;i<=a;i++)
    	{
    		try
    		{
    			bar1.setValue(i);
    			Thread.sleep(100);
    		}catch(Exception ex) {}
    	}
    	for(int i=0;i<=b;i++)
    	{
    		try
    		{
    			bar2.setValue(i);
    			Thread.sleep(100);
    		}catch(Exception ex) {}
    	}
    	/*for(int i=0;i<=c;i++)
    	{
    		try
    		{
    			bar3.setValue(i);
    			Thread.sleep(100);
    		}catch(Exception ex) {}
    	}
    	for(int i=0;i<=d;i++)
    	{
    		try
    		{
    			bar4.setValue(i);
    			Thread.sleep(100);
    		}catch(Exception ex) {}
    	}*/
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new 자리배치();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
		    new Thread(this).start();
		}
	}

}
