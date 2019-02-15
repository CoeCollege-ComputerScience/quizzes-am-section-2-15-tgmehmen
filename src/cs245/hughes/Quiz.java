package cs245.hughes;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<QuizQuestion> theQuiz;
    private int numCorrect;

    public Quiz() {
        theQuiz = new ArrayList<QuizQuestion>();
    }

    public void addQuestion(QuizQuestion q){
        theQuiz.add(q);
    }

    public void takeQuiz(){
        for (QuizQuestion q:theQuiz){
            q.askQuestion();
        }
    }

    public float grade(){
        numCorrect = 0;
        for (QuizQuestion q: theQuiz){
            if (q.isCorrect()){
                numCorrect++;
            }
        }
        return (float)numCorrect/theQuiz.size();
    }
}
