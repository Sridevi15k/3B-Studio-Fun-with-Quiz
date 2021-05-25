package quizapp;

import java.util.ArrayList;

public class TrueOrFalse extends Question {


    public TrueOrFalse(String prompt, ArrayList options, String answer) {
        super(prompt, options, answer);
    }

    @Override
    public String getOptionsMessage() {
        return "Enter True or False:";
    }
}
