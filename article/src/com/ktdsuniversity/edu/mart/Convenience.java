package com.ktdsuniversity.edu.mart;
/**
 * 편의점
 * 상속 : NomalMart
 * discount, afterDiscountPrice, NomalMart[]
 */
public class Convenience extends NomalMart {
	

	private double discount;
	private double afterAddPointPrice;
	
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
		return afterAddPointPrice;
	}
	
	public void setAfterDiscountPrice(double afterAddPointPrice) {
		this.afterAddPointPrice = afterAddPointPrice;
	}
	
	@Override
	public void sell(Customer cs, String productName) {
		
		Product[] product = super.getProduct();
		
		//구매자의 돈을 담아둔다 => 환불을 고려한다.
		int customerMoney = cs.getMoney();
		
	    for (int i = 0; i < product.length; i++) {
	        if (product[i].getProductName().equals(productName)) {	//상품이름 검증
	        	//고객의 돈이 상품을 살수 있는지 검증
	        	if(customerMoney < product[i].getPrice()) {
	        		System.out.println("물품의 가격은 " + product[i].getPrice() + "입니다. 잔액이 부족합니다.");
	        		return;
	        	}//구매자로부터 돈을 받고 판매하고 남은 거스름돈을 구매자에게 돌려준다.
	        	
	        		//포인트가 100점 이상인지 검증
	        		if(cs.getPoint() >= 100) {
	        			// 포인트가 물건값보다 많거나 같음 0원결제
	        			if(product[i].getPrice() - cs.getPoint() <= 0) {
	        				this.afterAddPointPrice = 0;
	        			}
	        			else {
	        				//포인트 차감
	        				this.afterAddPointPrice = product[i].getPrice() - (int) cs.getPoint();
	        			}
	        			cs.setPoint(0);
	        		}
	        		else {
	        			//아니라면 그대로 결제
	        			this.afterAddPointPrice = product[i].getPrice();
	        		}
	        		
        			super.setMoenyBox(super.getMoenyBox() + (int)this.afterAddPointPrice);
        			cs.setMoney(customerMoney - (int)this.afterAddPointPrice);
        			System.out.println("결제완료");
        			
        			//포인트 적립
	        		double bonusPoint = product[i].getPrice() * 0.001;
	        		cs.setPoint((int)(cs.getPoint() + bonusPoint));
	        		System.out.println("포인트 적립 후 최종 잔액 : " + (int)cs.getPoint());
        			System.out.println("수익금 : " + super.getMoenyBox());
        			System.out.println("거스름돈 : " + cs.getMoney());
        			return;
	        	
	       }
	    }
		System.out.println("없는 상품 입니다.");
	}
}
