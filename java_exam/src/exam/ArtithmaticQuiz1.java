package exam;

public class ArtithmaticQuiz1 {

	public static void main(String[] args) {
		/* 산술 연산자를 이용해
		 * minutes와 seconds의 값을 초로 변환해
		 * time 변수에 할당하고 출력해보세요.
		 */
		
		int minutes = 5;
		int seconds = 50;
		
		//minutes분 seconds초는 총 몇초인가?
		int time = minutes * 60 + seconds;
		System.out.println(minutes +"분" + seconds + "초는 총" + time + "초 입니다.");
		// 결과 = 5분 50초는 총 350초 입니다.
	}

}
