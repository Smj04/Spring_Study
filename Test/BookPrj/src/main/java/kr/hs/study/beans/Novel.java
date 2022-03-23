package kr.hs.study.beans;

public class Novel implements Book{
	//kim의  소설 ‘spring’을 8000원에 산다
	private String name;
	private String title;
	private int price;
	
	public Novel(String name, String title, int price) {
		this.name = name;
		this.title = title;
		this.price = price;
	}
	public  void buy() {
		System.out.println(name + "은"+title+"을"+price+"에 산다");
	}
	public   void sell() {
		
	}
	public  void create() {
		
	}
	
}
