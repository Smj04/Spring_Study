package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;


public class Mainclass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//TestDAO��������
		TestDAO dao = ctx.getBean(TestDAO.class);
		//TestBean ��ü bean1���� 100, spring100 �ֱ�
		//TestBean ��ü bean2 ���� 200, spring200 �ֱ�
				
		
		TestBean bean1 = new TestBean();
		bean1.setData1(100);
		bean1.setData2("spring100");
		
		dao.insert_data(bean1);
		//create table test( data1 number(10), data2 varchar(30));
		TestBean bean2 = new TestBean();
		bean2.setData1(200);
		bean2.setData2("spring200");
		//insert_dataȣ��
		System.out.println("inserted!!!");
		ctx.close();
		
	}
}
