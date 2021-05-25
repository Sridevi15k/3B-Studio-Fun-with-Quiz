package quizapp;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {

        // create questions for quiz

        ArrayList<String> q1Options = new ArrayList<>();
        q1Options.add("A.Bytecode is executed by JVM");
        q1Options.add("B.The applet makes the Java code secure and portable");
        q1Options.add("C.Use of exception handling");
        q1Options.add("D.Dynamic binding between objects");
        MultipleChoice q1 = new MultipleChoice("Which of the following option leads to the portability and security of Java?", q1Options, "A");

        ArrayList<String> q2Options = new ArrayList<>();
        q2Options.add("A.Dynamic");
        q2Options.add("B.Architecture Neutral");
        q2Options.add("C.Use of pointers");
        q2Options.add("D.Object-oriented");
        MultipleChoice q2 = new MultipleChoice("Which of the following is not a Java features?", q2Options, "C");

        ArrayList<String> q3Options = new ArrayList<>();
        q3Options.add("A.Carrot, Egg Plant, Apple");
        q3Options.add("B.Apple, Banana, Strawberry");
        q3Options.add("C.Orange, Drumstick, Guava");
        CheckBoxQuestions q3 = new CheckBoxQuestions("Which of the following are fruits?", q3Options, "B");

        ArrayList<String> q4Options = new ArrayList<>();
        q4Options.add("A.Tomato, Cabbage, Broccoli");
        q4Options.add("B.Watermelon, Cantaloupe, Oranges");
        q4Options.add("C.Onion, Raspberry, Corn");
        CheckBoxQuestions q4 = new CheckBoxQuestions("Which of the following are vegetables?", q4Options, "A");

        ArrayList<String> q5Options = new ArrayList<>();
        q5Options.add("Violet, Indigo, Blue, Green, Yellow, Orange, Red");
        TrueOrFalse q5 = new TrueOrFalse("Rainbow has the following colors: ", q5Options, "True");

        ArrayList<String> q6Options = new ArrayList<>();
        q6Options.add("Abstraction, Encapsulation, Inheritance, Polymorphism");
        TrueOrFalse q6 = new TrueOrFalse("Core OOP concepts in Java", q6Options, "True");

        // user input
        Scanner userInput = new Scanner(System.in);

        // add questions to quiz
        ArrayList<Question> quizQuestions = new ArrayList<>();
        quizQuestions.add(q1);
        quizQuestions.add(q2);
        quizQuestions.add(q3);
        quizQuestions.add(q4);
        quizQuestions.add(q5);
        quizQuestions.add(q6);

        int score = 0;

        // print each question at a time and ask for input.
        // for each input validate it with answer in question.
        // if answer matches increment score by 1
        for (Question quizQuestion: quizQuestions) {

            System.out.println("\n" + quizQuestion.getPrompt());
            for (String quizOption: quizQuestion.getOptions()) {
                System.out.println(quizOption);
            }

            System.out.print(quizQuestion.getOptionsMessage());
            // ask for user answer
            String answer = userInput.nextLine();

            if (quizQuestion.getAnswer().equalsIgnoreCase(answer.toLowerCase())) {
                score++;
            }
        }

        System.out.println("Total Score is:" + score);
    }
}
