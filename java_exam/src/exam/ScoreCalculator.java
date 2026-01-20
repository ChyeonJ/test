package exam;

public class ScoreCalculator {
	
	
	 // 정수형 점수 5개를 파라미터로 전달하면 학점이 나오는 학점 계산기를 아래 메소드 목록을 이용해 만들어라.
	 /*
	  * Grade 기준
	  * 평균 >= 90 ==>> "A"
	  * 평균 >= 80 ==>> "B"
	  * 평균 >= 70 ==>> "C"
	  * 평균 >= 60 ==>> "D"
	  * 이 외 => "F"
	  */
	
	public static String computeGrade(int subjA, int subjB, int subjC,
			int subjD, int subjE) {
		int amount = subjA + subjB + subjC + subjD + subjE;
		double average = calcAverage(amount, 5);
		String grade = calcGrade(average);
		return grade;
	}
	
	public static double calcAverage(int amount, int subjectCount) {
		// 평균을 구함.
		double result = (double) (amount / subjectCount);
		
		return result;

	}
	public static String calcGrade(double average) {
		//등급을 구함.
		if(average >= 95) {
			return "A";
		}
		else if(average >= 85 && average <= 94) {
			return "B";
		}
		else if(average >= 75 && average <= 84) {
			return "C";
		}
		else if(average >= 65 && average <= 74) {
			return "D";
		}
		return "F";
	}
	
	public static void main(String [] args) {
		String grage = computeGrade(100, 95, 95, 100, 100);

	    System.out.println(grage); // "A"
	}

}
