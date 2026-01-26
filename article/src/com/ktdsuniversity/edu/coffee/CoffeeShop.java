package com.ktdsuniversity.edu.coffee;
/**
 * 
 */
public class CoffeeShop {
	/**
	 * 커피숍에서 판매하는 따뜻한 아메리카노
	 */
	private Coffee hot;
	
	/**
	 * 커피숍에서 판매하는 차가운 아메리카노
	 */
	private Coffee ice;
	
	//생성자 오버로딩
	public CoffeeShop() {
		//this.hot = new Coffee("기본 아메리카노", 1500, 30);
		//this.ice = new Coffee("아이스 아메리카노", 1500, 50);
		//여기서 생성자를 직접 호출할 수 있는 방법
		//Coffee인스턴스 두개를 생성하면 자동으로 밑에 있는 CoffeeShop의 값을 사용하게 됨
		this(new Coffee("기본 아메리카노", 1500, 30),
				new Coffee("아이스 아메리카노", 1500, 50));
	}
	
	public CoffeeShop(Coffee hot, Coffee ice) {
		this.hot = hot;
		this.ice = ice;
	}
	
	public Coffee getHot(){
		return this.hot;
	}
	
	public Coffee getIce() {
		return this.ice;
	}
	
	public void setHot(Coffee hot) {
		this.hot = hot;
	}
	
	public void setIce(Coffee ice) {
		this.ice = ice;
	}
	
//	//메소드 오버로딩
	public void orderCoffee(String menu) {
		this.orderCoffee(menu, 1);
		//return price;
	}
	/**
	 * 가장 첫번째 메뉴를 한개 주문한다.
	 * @return
	 */
	public void orderCoffee() {
		this.orderCoffee("아메리카노 (Hot)");
		//return price;
	}
	
	
	/**
	 * 주문하는데 재고보다 주문수량 보다 모자라면 안판다.
	 * @param menu 제품 번호
	 * @param stock 수량
	 * @return
	 */
	public void orderCoffee(String menu, int stock) {
		
		int totalStockHot = getHot().getStock() - stock;
		int totalStockIce = getIce().getStock() - stock;
		
		// 주문한 음료의 재고가 stock보다 모자라면 판매하지 않는다.
		if(totalStockHot <= 0 || totalStockIce <= 0) {
			System.out.println("재고 부족");
			totalStockHot = 0;
			totalStockIce = 0;
			return;
		} //음료를 판매하면 재고가 stock만큼 감소합니다.
		else if(menu == getHot().getName()) {
			System.out.println(getHot().getName() + "음료를 " + stock + "개 주문 받았습니다.");
			getHot().setStock(totalStockHot);
			System.out.println("남은 재고: " + getHot().getStock());
			//가격 추가
		}
		else if(menu == getIce().getName()) {
			System.out.println(getIce().getName() + "음료를 " + stock + "개 주문 받았습니다.");
			getIce().setStock(totalStockIce);
			System.out.println("남은 재고: " + getIce().getStock());
			//가격 추가
		}else {
			System.out.println("없는' 상품");
			return;
		}
		                                    
		
		
	}
	
	
//	/**
//	 * 커피숍에서 커피를 판매한다.
//	 * @param menu	메뉴들의 번호. 1 : hot 2 : ice
//	 * @param quantity 주문 수량
//	 * @return 주문 가격
//	 */
//	public int orderCoffee(int menu, int quantity) {
//		if(menu == 1) {
//			System.out.println(this.hot.name + "음료를" + quantity + "개 주문 받았습니다.");
//			return this.hot.price * quantity;
//		}else if (menu == 2) {
//			System.out.println(this.ice.name + "음료를" + quantity + "개 주문 받았습니다.");
//			return this.ice.price * quantity;
//		}
//		else {
//			System.out.println("존재하지 않는 음료 입니다.");
//			return 0;
//		}
//	}
	

}
