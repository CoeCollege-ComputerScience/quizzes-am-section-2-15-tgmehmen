package cs245.hughes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<QuizQuestion> theQuiz;


    public Quiz() {
        theQuiz = new ArrayList<QuizQuestion>();
    }

    public void addQuestion(QuizQuestion q){
        theQuiz.add(q);
    }

    public float takeQuiz() {
        Scanner scan = new Scanner(System.in);
        String studentAnswer;
        int numCorrect = 0;
        for (QuizQuestion q : theQuiz) {
            q.displayQuestion();
            studentAnswer = scan.nextLine();
            if (q.isCorrect(studentAnswer)) {
                numCorrect++;
            }
        }
        return (float) numCorrect / theQuiz.size();
    }
}
