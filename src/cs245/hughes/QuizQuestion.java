package cs245.hughes;

import java.util.Scanner;

public class QuizQuestion {
    private String question;
    private String correctAnswer;
    private String studentAnswer;
    private Scanner scan;

    public QuizQuestion(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        scan = new Scanner(System.in);
    }

    public void askQuestion(){
        System.out.println(question);
        studentAnswer = scan.nextLine();
    }
    public boolean isCorrect(){
        return studentAnswer.equals(correctAnswer);
    }
}
