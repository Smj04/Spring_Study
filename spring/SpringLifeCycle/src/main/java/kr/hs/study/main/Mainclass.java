package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class Mainclass {
	//xml������ �о �ε�
	public static void main(String[] args) {
		//�������� �ϴ°� ����!
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//�ּ���¹�
		TestBean1 tb1 = ctx.getBean("p1", TestBean1.class);
		System.out.println("tb1 : "+ tb1);
		
			ctx.close();
	}
	
}
