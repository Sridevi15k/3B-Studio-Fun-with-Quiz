package quizapp;

import java.util.ArrayList;

public abstract class Question {
    //fields and properties
    String prompt;
    String answer;
    ArrayList<String> options;

    public Question(String prompt, ArrayList<String> options, String answer) {
        this.prompt = prompt;
        this.options = options;
        this.answer = answer;
    }
    //methods with access modifiers

    public String getPrompt() {
        return this.prompt;
    }

    public String getAnswer() {
        return this.answer;
    }

    public ArrayList<String> getOptions() {
        return this.options;
    }

    public abstract String getOptionsMessage();
}
