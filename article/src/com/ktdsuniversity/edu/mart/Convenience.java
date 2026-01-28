package com.ktdsuniversity.edu.mart;
/**
 * 편의점
 * 상속 : NomalMart
 * discount, afterDiscountPrice, NomalMart[]
 */
public class Convenience extends NomalMart {
	

	private double discount;
	private double afterDiscountPrice;
	
	public Convenience(Product product1, Product product2, Product product3) {
		super(product1, product2, product3);
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getAfterDiscountPrice() {
		return afterDiscountPrice;
	}
	
	public void setAfterDiscountPrice(double afterDiscountPrice) {
		this.afterDiscountPrice = afterDiscountPrice;
	}
	
	public void convenienceSell(Customer cs, String productName) {

		//discount변수가 편의점 계산할 때는 항상 0.1% 적립율이 고정이므로 한 번 더 선언
		this.discount = 0.001d;
		
		//배열 이름 비교를 위한 코드
		Product[] product = super.getProduct();
		for(int i = 0; i < product.length; i++) {
			if(product[i].getProductName().equals(productName)) {
				//포인트가 100점 이상인지 체크
				if(cs.getPoint() >= 100) {
					//discount된 가격이 음수가 나올 수 있음
					this.afterDiscountPrice = product[i].getPrice() - cs.getPoint();
					if(this.afterDiscountPrice < 0) {
						this.afterDiscountPrice = 0;
					}
					cs.setPoint(0);
				}
					System.out.println(super.getCsMoney());
					super.setCsMoney(super.getCsMoney() - (int)(afterDiscountPrice));
					System.out.println(super.getCsMoney());
					//100점 미만이라면 정상적인 거래 로직이 실행 된다.
					super.sell(cs, productName);
					super.sellerStatus();
        		
				//포인트 적립을 한다.
				double totalPoint = product[i].getPrice() * this.discount;
				cs.setPoint(totalPoint);
				System.out.println("포인트 적립 되었습니다 잔액 : " + cs.getPoint());
			}
		}
		
		
	}

}
