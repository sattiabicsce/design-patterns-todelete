package singleton;

import java.util.ArrayList;

public class Anagram {
    private String question;
    private ArrayList<String> answers;

    /**
     * Constructs an Anagram object with the specified question and answers.
     * 
     * @param question The anagram question.
     * @param answers The list of possible answers for the anagram.
     */
    public Anagram(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    /**
     * Gets the anagram question.
     * 
     * @return The anagram question.
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Checks if the provided user answer is correct for the anagram.
     * 
     * @param userAnswer The user's answer to the anagram question.
     * @return True if the answer is correct, false otherwise.
     */
    public boolean isCorrect(String userAnswer) {
        return answers.contains(userAnswer.trim().toLowerCase());
    }
}
