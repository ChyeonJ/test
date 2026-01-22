package oop;

public class SellerTest {

	public static void main(String[] args) {

		Seller seller = new Seller(2);
		
		//seller.itemCount = 110; => 생성자 생성으로 인한 코드 삭제
		seller.sellerTotal(10);
		seller.sellerTotal(1);

	}

}
