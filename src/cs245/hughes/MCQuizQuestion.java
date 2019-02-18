package cs245.hughes;

import java.util.ArrayList;

public class MCQuizQuestion  extends QuizQuestion {

	ArrayList<String> options;

	public MCQuizQuestion(String question) {
		super(question, null);
		options = new ArrayList<String>();
	}

	public void addOption(String option){
		options.add(option);
	}

	@Override
	public void displayQuestion() {
		super.displayQuestion();
		for (String o: options){
			System.out.println("\t"+ o);
		}
	}
}
