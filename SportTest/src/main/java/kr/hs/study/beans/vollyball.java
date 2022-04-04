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
		System.out.print("배구는 "+people+"의 선수가 경기하며, ");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(number+"세트를 먼저 획득하면 멈춘다");
	}

}
