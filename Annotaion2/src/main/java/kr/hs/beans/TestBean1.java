package kr.hs.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean1 {
	//@Autowired, Qualifier("test")사용해서 객체만들고 data1, data2 값 출력
	//@Autowired : Container에 DataBean1 타입 빈이 있으면 그걸 data1에 자동으로 대입시켜라라는 뜻
	//@Quaifer : Container에 TestBean1 타입 빈이 있으면 그걸 t1을 자동으로 대입시켜라라는 뜻
	
	//자동주입이라 getter만 만들어도됨(줘도 상관X)
	@Autowired
	
	private DataBean1 data1;
	
	@Autowired
	private DataBean2 data2;

	

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
	
}
