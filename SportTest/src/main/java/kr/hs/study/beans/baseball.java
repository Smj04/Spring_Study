package kr.hs.study.beans;

public class baseball implements Sports{
private int people;
private int number;
public baseball(int people, int number) {
	this.people = people;
	this.number = number;
}
	public void play() {
		// TODO Auto-generated method stub
		System.out.print("야구는 "+people+"의 선수가 경기하며, ");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(number+"회가 되면 멈춘다");
	}

}
