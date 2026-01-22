package oop;

public class SellerTest {

	public static void main(String[] args) {

		Seller seller = new Seller(110, 8);
		
		seller.itemPrice = 1_000;
		//seller.itemCount = 110; => 생성자 생성으로 인한 코드 삭제
		//seller.sale = 8; => "
		seller.sellerTotal();
		seller.sellerTotal();

	}

}
