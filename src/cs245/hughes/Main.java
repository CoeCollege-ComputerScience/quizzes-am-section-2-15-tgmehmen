package cs245.hughes;

public class Main {

	public static void main(String[] args) {

		Quiz q;
		float score;

		q = new Quiz();
		q.addQuestion(new QuizQuestion("What is the course number for this class? ", "CS245"));
		q.addQuestion(new QuizQuestion("True/False:  Polymorphism is also known as Early-Binding ", "False"));
		q.addQuestion(new QuizQuestion("In what year was Coe College Founded? \na. 1802\nb. 1851\nc. 1872\nd. 1921", "b"));
		q.addQuestion(new QuizQuestion("What is the ASCII value for \"A\"? ", "65"));
		q.addQuestion(new QuizQuestion("What is the value of Pi?", "3.14159"));

		q.takeQuiz();
		score = q.grade();

		System.out.println("Your score is " + score);

	}
}
