package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;


public class Mainclass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//TestDAO가져오기
		TestDAO dao = ctx.getBean(TestDAO.class);
		//TestBean 객체 bean1만들어서 100, spring100 넣기
		//TestBean 객체 bean2 만들어서 200, spring200 넣기
				
		
		TestBean bean1 = new TestBean();
		bean1.setData1(100);
		bean1.setData2("spring100");
		
		dao.insert_data(bean1);
		//create table test( data1 number(10), data2 varchar(30));
		TestBean bean2 = new TestBean();
		bean2.setData1(200);
		bean2.setData2("spring200");
		//insert_data호출
		System.out.println("inserted!!!");
		ctx.close();
		
	}
}
