package kr.hs.dgsw.Ex1;

public class People {
	String name;
	double tall;
	double weight;

	public double Bmi(){
		double bmi;
		tall = tall * 0.01;
		bmi = weight / (tall * tall);
		return bmi;
	}
	
	public void PrintBmi(){
		double bmiResult = Bmi();
		System.out.println(name + "의 비만도는" + bmiResult + 
				(bmiResult < 20 ? "저체중" : bmiResult > 25 ? "과체중":"표준체중") + "입니다"
				);
	}
}
