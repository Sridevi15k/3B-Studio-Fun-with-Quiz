package quizapp;

import java.util.ArrayList;

public class MultipleChoice extends Question {

    public MultipleChoice(String prompt, ArrayList options, String answer) {
        super(prompt, options, answer);
    }

    @Override
    public String getOptionsMessage() {
        return "Enter one selection:";
    }
}
