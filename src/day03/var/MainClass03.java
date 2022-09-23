package day03.var;

public class MainClass03 {
	
	public static void main(String[] args) {

		Card c1 = new Card(); // 첫번째 카드 객체생성
		Card c2 = new Card(); // 두번째 카드 개체생성
		
		c1.type = "클로버";
		c2.type = "다이아몬드";
		c1.height = 30;
		c2.height = 15;
		
		Card.height = 20;
		
		//첫번째 카드
		System.out.println("heigth : "+ c1.height);   // ??
		System.out.println("type" +c1.type);		  // 클로버
		
		//두번재 카드
		System.out.println("heigth : "+ c2.height);  // ??
		System.out.println("type" +c2.type);		// 다이아몬드
	}
}

class Card {
	static int height = 20;
	String type = "";
	
}