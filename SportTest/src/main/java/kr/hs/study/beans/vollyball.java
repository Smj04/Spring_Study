package kr.hs.study.beans;

public class vollyball implements Sports{
	private int people;
	private int number;
	

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.print("�豸�� "+people+"�� ������ ����ϸ�, ");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(number+"��Ʈ�� ���� ȹ���ϸ� �����");
	}

}
