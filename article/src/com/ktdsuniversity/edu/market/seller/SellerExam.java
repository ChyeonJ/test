package com.ktdsuniversity.edu.market.seller;
/**
 * <pre>
 * 판매자가 판매하는 모든 상품의 금액은 1,000원 입니다.
 * 판매자는 한번에 n개 만큼의 상품을 판매할 수 있습니다.
 * 판매(5); 라고 한다면 판매자의 상품 재고에서 5개를 빼야합니다.
 * 또한 5개를 판매한 금액을 판매자의 자본금에 더해야 합니다.
 * 
 * 판매자가 소지한 상품의 개수보다 더 많은 개수의 상품을 판매하려할 경우, 남은 모든 재고를 판매해야 하며
 * 남은 재고를 판매한 금액만큼을 판매자의 자본금에 더해야 합니다.
 * 
 * 판매자의 재고가 없다면, "품절되었습니다"를 출력해야 합니다.
 * 
 * 상품의 판매 프로세스가 종료되었다면 판매자의 재고 수, 판매자의 자본금을 출력한다.
 * 
 * Member Variable
 * itemPrice(int), itemCount(int), sale(int) sellerMoney(int)
 * 
 * </pre>
 */
public class SellerExam {
	
	//멤버변수
	/**
	 * <pre>
	 * 상품의 가격
	 * </pre>
	 */
	private final int ITEM_PRICE = 1_000; // => 상수는 대문자 언더바로 나눔
	/**
	 * <pre>
	 * 재고
	 * </pre>
	 */
	private int itemCount;
	/**
	 * <pre>
	 * 판매자의 자본금
	 * </pre>
	 */
	private int sellerMoney = 0;
	
	//생성자 생성 => public 클래스 이름
	/**
	 * 
	 * @param itemCount 재고
	 */
	public SellerExam(int itemCount) {
		this.itemCount = itemCount;
		
	}
	
	public int getITEM_PRICE() {
		return this.ITEM_PRICE;
	}
	
	public int getItemCount(){
		return this.itemCount;
	}
	
	public int getSellerMoney() {
		return this.sellerMoney;
	}
	
	
	/**
	 * 판매자
	 * @param sale
	 */
	public void sellerTotal(int sale) { //판매 개수 
			int totalItem = getItemCount() - sale;	//여기서 음수로 받는데 이거 고쳐야함. 안고쳐도 될듯 = >어차피 음수로 나오면 if에서 걸러지고 0으로 초기화 됨
			int totalPrice;
			
			if(totalItem < 0 ) {
				System.out.println("품절되었습니다.");
				System.out.println(sale + totalItem);
				totalPrice = getITEM_PRICE() * (sale + totalItem);
				System.out.println(totalPrice);
				sellerMoney += totalPrice;	//setter
				totalItem = 0; 	//여기서 0을 처리하기 전에 itemCount - sale로 팔 수 있는 수량 개선 해야함 => 헤결 => 음수가 나와도 그전에 + totalItem해서 값이 계산 되게 만듬 음수를 빼려면 + 해야함
			}else if(totalItem >= 0){
				totalPrice = getITEM_PRICE() * sale;	//다음 구매자는 itemPrice 가격이 달라짐 해결 => 멤버 변수 final 추가
				sellerMoney += totalPrice; // 자본금만 오르는 상황임 재고를 바꿔야함? setter
				
			}
		System.out.println("재고 : " + totalItem + ", 자본금 : " + getSellerMoney());
	}
	
	
	

}
