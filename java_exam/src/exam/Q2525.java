package exam;

public class Q2525 {

	public static void main(String[] args) {
		// KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 
//		인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 
//		그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
//		또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
//		훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 
//		오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
		
		// 인공 지능 오븐이 오븐 구이가 끝나는 시간을 분단위로 자동 계산
		// 
		
		int hour = 23;
		int minute = 40;
		int endTime = 30;	//endTime이 1460이라고 하면 하루가 넘어가지 않음.
		
		System.out.println(hour + " " + minute);
		System.out.println(endTime);
		
		int totalTime = hour * 60 + minute + endTime;
		
		if (endTime >= 1440) {			//조리 시간이 하루가 넘어갔을 때 하루를 제거 하는 방식
			int days = endTime / 1440;
			endTime -= 1440 * days;
		}
		
		if (totalTime > 1440) {
			totalTime -= 1440;	//하루를 빼야 24에서 0으로 다시 초기화가 됨 아래 과정들을 잘 보자,
		}
		
		int endH = totalTime / 60;
		int endM = totalTime % 60;
		
		System.out.println(hour + " " + minute);
		
		
//		if (totalTime >= 1440) {		>= 나는 이사이면 00시로 초기화 하는게 맞다고 생각해서 이상 기호를 씀
//			hour = totalTime / 60;		1450 - 1440시 정수형 60으로 나눴을 떄 0시 10이 된다. 이해함.
//			minute = totalTime % 60;
//		}
		

		
//		내가 풀고자한 의도 분이 60을 넘어가면 -> hour 1을 증가 시키고, hour가 24를 넘어가면 분으로 환산 후 다시 나눠서 가져가는 방식
//		if ((minute += endTime) >= 60) {
//			minute %= 60;
//			hour++;
//			
//		}
//		else if ((minute += endTime) < 60) {
//			minute += endTime;
//		}
//		
//		System.out.println(hour + " " + minute);
//		
//		if((hour = hour * 60 + minute) >= 1440) {
//			minute = hour % 60;
//			hour /= 60 ;
//			hour = 0 + hour;
//		}
//		System.out.println(hour + " " + minute);
		
		
	}

}
