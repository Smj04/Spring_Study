package kr.hs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.beans.TestBean;
import kr.hs.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class Mainclass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//���� �����ִ� Ŭ���� TestDAO�� getBean�ؼ� �����´�
		TestDAO dao = ctx.getBean(TestDAO.class);
		
		TestBean bean1 = new TestBean();
		bean1.setUserid("mirim");
		bean1.setUserpass(1234);
		bean1.setUsername("�̸̹�");
		bean1.setUserage(19);
		
		dao.insert_data(bean1);
		System.out.println("inserted!!!");
		ctx.close();
	}
}

