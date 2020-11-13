package com.revature.eval.java.core;

public class Driver{

	public static void main(String[] args) {
		EvaluationService es = new EvaluationService();
		String revCall = es.reverse("matt");
		System.out.println(revCall);
		
		String acro = es.acronym("hello World");
		System.out.println(acro);
		
		int scramble = es.getScrabbleScore("ADD");
		System.out.println(scramble);
		
		String number = "19009123451";
		System.out.println( es.cleanPhoneNumber(number));
	
	}

}
