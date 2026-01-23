package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.DrinkMachine;	//패키지 추가

/**
 * 음료수 자판기의 비즈니스 로직 처리
 */
public class DrinkMachineArray {
	
	private DrinkMachine[] drinkM;	//DrinkMachine[] => DrinkMachinea class 배열 선언
	
	public DrinkMachineArray(DrinkMachine index1,DrinkMachine index2,DrinkMachine index3,DrinkMachine index4) {	//DrinkMachine index1 => DrinkMachine은 이미 이름 가격 재고를 담고 있음
		this.drinkM = new DrinkMachine[4];	//배열을 저장하기 전에  배열 할당 ▲ => DrinkMachine[] drinkM = new DrinkMachine[4]; 멤버 변수에서 배열 선언 했는데? 이것도 멤버변수를 쓰니까 this. 사용
		this.drinkM[0] = index1;	//0번 인덱스부터 배열의 값을 저장.
		this.drinkM[1] = index2;
		this.drinkM[2] = index3;
		this.drinkM[3] = index4;
	}
	
	public DrinkMachine[] getDrinkM() {
		return this.drinkM;
	}
	
	
	/* 
	 * 	음료수 자판기의 기능
	 *주문하기(제품 번호, 주문수량): 구매금액(int)
	 *몬스터를 5개 주문한다면 7500을 반환한다.
	 *주문을 하면 주문 수량만큼 자판기 음료수의 재고가 감소된다.
	 *재고가 없다면 “상품이 품절되었습니다“를 출력하고 0을 반환한다.
	 *입고하기(제품번호, 입고수량): void
	 *입고를 하면 입고 수량만큼 재고가 증가된다.
	 *밀키스 3개를 입고하면, 밀키스의 재고가 3개 증가된다.
	 *자판기에 없는 음료수는 입고할 수 없다. (제로콜라, 3)  아무 변화가 없다!
	 *모든 상품 재고 출력() : void
	 *출력형식  “박카스 15개 남았습니다.”
	 */
	//주문하기(제품 번호, 주문수량): 구매금액(int)
	public int orderDrinK(int count, int stock) {
		
		// 이상한 숫자를 넣어도 오류 출력 해야함
		if(count <= this.drinkM.length) {
			System.out.println("없는 상품");
			return 0;
		}
		//재고가 없다면 "상품이 품절되었습니다" 출력하고 0을 반환한다.	=> 이것을 먼저 검증하는게 좋을듯 빠른연산
		
		DrinkMachine drinkMachine = this.drinkM[count];
		
		int totalStock = drinkMachine.getStock() - stock;
		
		if(stock == 0 || totalStock >= drinkMachine.getStock()) {
			System.out.println("상품이 품절되었습니다.");
			totalStock = 0;
			return 0;
		}else{
			int totalPrice = drinkMachine.getPrice() * stock; //상품의 가격 계산
			drinkMachine.setStock(totalStock);	// 주문을하면 주문 수량만큼 자판기 음료수의 재고가 감소
			//this.drinkM[count].stock = totalStock;	// 주문을하면 주문 수량만큼 자판기 음료수의 재고가 감소
			return totalPrice; //몬스터를 5개 주문한다면 7500을 반환한다.
		}
	}
	
	// *입고하기(제품번호, 입고수량): void
	public void addProduct(int count, int stock) {

		// 이상한 숫자를 넣어도 오류 출력 해야함
		if(count > this.drinkM.length) {
			System.out.println("없는 상품");
			return;
		//입고를 하면 입고 수량만큼 재고가 증가된다.
		}else {
			DrinkMachine drinkMachine = this.drinkM[count];
			drinkMachine.setStock(stock);	// 밀키스 3개를 입고하면, 밀키스의 재고가 3개 증가된다.
//			this.drinkM[count].stock += stock;	// 밀키스 3개를 입고하면, 밀키스의 재고가 3개 증가된다.
		}
	}
	
	//모든 상품 재고 출력() : void
	public void printAllDrink() {
		for(int i = 0; i < this.drinkM.length; i++) {
			System.out.println(this.drinkM[i].getDrinkName() + " " + this.drinkM[i].getStock() + "개 남았습니다.");
		}
	}

}
