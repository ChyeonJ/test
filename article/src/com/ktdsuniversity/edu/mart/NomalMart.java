package com.ktdsuniversity.edu.mart;
/**
 * 일반 마트
 * 진열한 상품을 판매
 * 판매는 구매자로부터 돈을 받고 판매하고 남은 거스름돈을 구매자에게 돌려준다.
 */
public class NomalMart {

	//멤버변수 => 할당은 따로 받지는 않으나, 손님이 내는 돈을 활용할 변수
	private int moenyBox;
	private int csMoney;
	

	private Product[] product;
	
	public NomalMart(Product product1, Product product2, Product product3) {
		this.product = new Product[3];
		this.product[0] = product1;
		this.product[1] = product2;
		this.product[2] = product3;
		
	}
	

	public int getMoenyBox() {
		return moenyBox;
	}
	
	public void setMoenyBox(int moenyBox) {
		this.moenyBox = moenyBox;
	}
	
	public int getCsMoney() {
		return csMoney;
	}
	
	public void setCsMoney(int csMoney) {
		this.csMoney = csMoney;
	}
	public Product[] getProduct() {
		return product;
	}
	
	
	public void setProduct(Product[] product) {
		this.product = product;
	}
	
	public void sell(Customer cs, String productName, int afterDiscountPrice) {
		
		//구매자의 돈을 담아둔다 => 환불을 고려한다.
		this.csMoney = cs.getMoney();
		
	    for (int i = 0; i < this.product.length; i++) {
	        if (this.product[i].getProductName().equals(productName)) {
	        	//고객의 돈이 상품을 살수 있는지 검증
	        	if(cs.getMoney() < product[i].getPrice()) {
	        		System.out.println("물품의 가격은 " + product[i].getPrice() + "입니다. 잔액이 부족합니다.");
	        		return;
	        	}//구매자로부터 돈을 받고 판매하고 남은 거스름돈을 구매자에게 돌려준다.
	        	else if(product[i].getProductName().equals(productName)){
	        		this.moenyBox += product[i].getPrice();
	        		this.csMoney -= product[i].getPrice();
	        		cs.setMoney(this.csMoney);
	        		System.out.println("결제완료");
	    			System.out.println(cs.getMoney() + "원 환불 되었습니다.");
	        		//refund();	=> discount한 후에 출력해도 될듯
	        	}else {
	        		System.out.println("없는 상품 입니다.");
	        		return;
	        	}
	        }
	    }
	}
	
	
	public void refund() {
		int reMoney = this.getCsMoney();
		if(reMoney > 0) {
			System.out.println(reMoney + "원 환불 되었습니다.");
		}
	}
	
	public void sellerStatus() {
		System.out.println("총 수익금 : " + this.moenyBox);
	}
	
	
}
