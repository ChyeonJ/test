package com.ktdsuniversity.edu.abstracts;

public class DepartmentStore  extends AbstractMart{
	
	public DepartmentStore(int productPrice) {
		super(productPrice);
	}
	
	@Override
	public int discoiunt(Guest guest, int amount) {
		return 0;
	}
	
	@Override
	public void givePoint(Guest guest, int amount) {
		/*
		 * 상속 계층 구조가 있다면 가장 멀리 있는 단위부터 시작하는게 좋다
		 * Guest : Guest is a Guest
		 * 		-VIP : VIP is a Guest
		 * 			-VVIP : VVIP is a VIP and Guest
		 */
//		if(guest instanceof Guest g) {		역순으로 해준다.
//			
//		}
//		else if( guest instanceof VIP v) {
//			
//		}
//		else if(guest instanceof VVIP vv) {
//			
//		}
		if(guest instanceof VVIP) {	//이런식으로 해야함
			guest.addPoint((int)(amount * 0.3));
		}
		else if(guest instanceof VIP) {
			//적립이 아닌 할인임
		}
		else if(guest instanceof Guest) {
			guest.addPoint((int)(amount * 0.05));
		}
	}
	
	@Override
	public int usePoint(Guest guest) {
		return 0;
	}

}
