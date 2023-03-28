package com.example.syt.Activity.Exams;


import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.syt.R;

public class Exam extends AppCompatActivity
{
    private ScrollView scroll;
    private RadioGroup radioGroupOne;
    private RadioGroup radioGroupTwo;

    private RadioGroup radioGroupFive;
    private RadioButton question1;
    private RadioButton question2;

    private RadioButton question7;
    private CheckBox question8_1;
    private CheckBox question8_2;
    private CheckBox question8_4;
    private CheckBox wrongAnswerEight;
    private EditText question5;

    private int correctAnswers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        Bundle bundle = getIntent().getExtras();
        String courseName = bundle.getString("courseName");
        if (courseName != null) {

            scroll = (ScrollView) findViewById(R.id.Scroll);

            question1 = (RadioButton) findViewById(R.id.rb_CorrectAnswerOne);
            question2 = (RadioButton) findViewById(R.id.rb_CorrectAnswerTwo);

            question5 = (EditText) findViewById(R.id.userResponse_AnswerFive);

            question7 = (RadioButton) findViewById(R.id.rb_CorrectAnswerSeven);
            question8_1 = (CheckBox) findViewById(R.id.cb_CorrectAnswerEight_1);
            question8_2 = (CheckBox) findViewById(R.id.cb_CorrectAnswerEight_2);
            question8_4 = (CheckBox) findViewById(R.id.cb_CorrectAnswerEight_3);

            wrongAnswerEight = (CheckBox) findViewById(R.id.cb_WrongAnswerEight);
            radioGroupOne = (RadioGroup) findViewById(R.id.radioGroupOne);
            radioGroupTwo = (RadioGroup) findViewById(R.id.radioGroupTwo);

            radioGroupFive = (RadioGroup) findViewById(R.id.radioGroupFive);

        }

    }

    public void SubmitResponse(View v) {

        String answerFive = getResources().getString(R.string.AnswerFive);

        String wrongAnswers = "Check this question and try again :-\n";
        if (question1.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Question 1\n";
        }
        if (question2.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Question 2\n";
        }




        if (answerFive.equals(question5.getText().toString())) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Question 3\n";
        }



        if (question7.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Question 4\n";
        }

        if (question8_1.isChecked() && question8_2.isChecked() && question8_4.isChecked() && !(wrongAnswerEight.isChecked())) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Question 8\n";
        }

        String dialogText = "";
        if (correctAnswers == 5) {
            dialogText = "Congrats, All Answers are Correct  \nYou`re great!!! ";
        } else {
            dialogText = "Correct Answers: " + correctAnswers + " /8\n" + wrongAnswers;
        }


        View view = getLayoutInflater().inflate(R.layout.diolog, null);


        TextView textView = view.findViewById(R.id.dialog_text_view);


        textView.setText(dialogText);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);


        builder.setView(view);


        builder.setTitle("Exam Results");
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });


        AlertDialog dialog = builder.create();


        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialog.getWindow().setAttributes(layoutParams);

        dialog.show();


        ResetQuiz(findViewById(R.id.all));

    }

    public void ResetQuiz(View v) {

        correctAnswers = 0;

        question5.getText().clear();


        radioGroupOne.clearCheck();
        radioGroupTwo.clearCheck();

        radioGroupFive.clearCheck();

        if (question8_1.isChecked()) {
            question8_1.toggle();
        }

        if (question8_2.isChecked()) {
            question8_2.toggle();
        }

        if (question8_4.isChecked()) {
            question8_4.toggle();
        }

        if (wrongAnswerEight.isChecked()) {
            wrongAnswerEight.toggle();
        }

        scroll.fullScroll(ScrollView.FOCUS_UP);
    }
}


