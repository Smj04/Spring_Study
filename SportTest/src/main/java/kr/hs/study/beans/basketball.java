package kr.hs.study.beans;

public class basketball implements Sports{
	private int people;
	private int number;
	
	public basketball(int people, int number) {
		this.people = people;
		this.number = number;
	}
	public void play() {
		// TODO Auto-generated method stub
		System.out.print("³ó±¸´Â "+people+"¸í ¼±¼ö°¡ °æ±âÇÏ¸ç, ");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(number+"ÄõÅÍ°¡ µÇ¸é ¸ØÃá´Ù");
	}

}
