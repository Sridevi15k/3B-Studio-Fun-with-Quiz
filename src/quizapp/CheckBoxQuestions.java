package quizapp;

import java.util.ArrayList;

public class CheckBoxQuestions extends Question {


    public CheckBoxQuestions(String prompt, ArrayList options, String answer) {
        super(prompt, options, answer);
    }

    @Override
    public String getOptionsMessage() {
        return "Enter all that apply:";
    }
}
