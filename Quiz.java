import java.util.*;

public class Quiz {
    private String question;
    private List<String> options;
    private int correctAnswerIndex;
    private String category;
    private int points;

    public Quiz(String question, List<String> options, int correctAnswerIndex, String category, int points) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
        this.category = category;
        this.points = points;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public String getCategory() {
        return category;
    }

    public int getPoints() {
        return points;
    }

    public boolean checkAnswer(int userAnswer) {
        return userAnswer == correctAnswerIndex;
    }

    public void displayQuestion(int questionNumber) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Question " + questionNumber + " [Category: " + category + "] - Worth " + points + " points");
        System.out.println("=".repeat(60));
        System.out.println(question);
        System.out.println();
        
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println();
    }
}
