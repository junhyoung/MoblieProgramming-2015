package kr.ac.kookmin.embedded.overriding;

public class Dragon extends Monster {
	boolean frighten(int degree){
		System.out.println("breath fire");
		return true;
	}

}
