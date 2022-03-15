package kr.hs.study.beans;

public class TestBean1 {
	public TestBean1() {
		//config에서 태그를 만들때마다 생성자가 호출된다
		System.out.println("TestBean1의 기본 생성자");
	}
	
	public void initMethod() {
		System.out.println("init method 호출");
		
		
	}
	public void destroyMethod() {
		System.out.println("destroy method 호출");
	}
}
