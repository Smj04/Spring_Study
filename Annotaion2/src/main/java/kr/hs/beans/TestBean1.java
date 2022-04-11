package kr.hs.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean1 {
	//@Autowired, Qualifier("test")����ؼ� ��ü����� data1, data2 �� ���
	//@Autowired : Container�� DataBean1 Ÿ�� ���� ������ �װ� data1�� �ڵ����� ���Խ��Ѷ��� ��
	//@Quaifer : Container�� TestBean1 Ÿ�� ���� ������ �װ� t1�� �ڵ����� ���Խ��Ѷ��� ��
	
	//�ڵ������̶� getter�� ������(�൵ ���X)
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
