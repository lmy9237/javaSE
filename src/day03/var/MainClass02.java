package day03.var;

public class MainClass02 {
	static String str1 = "전역변수";
	
	
	public static void local() {
		String str2 = "지역변수";
	}
	
	public static void main(String[] args) {
		System.out.println(str1);
//		System.out.println(str2); 에러! 다른메소드 지역변수 사용X
		
		Card c1 = new Card(); // 카드 객체생성
		System.out.println(c1.height);
		System.out.println(c1.type);
	}
}


