package com.example.android.educationalapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    /**
     * this method will check if the answer that checked on the button is correct according the question
     * and update the image to fit the answer if it correct or wrong
     * and update the amount of isCount if the answer is correct
     *
     */
    int isCount=0;
     public void onRadioButtonClicked(View view) {
         // Is the view now checked?
         boolean checked = ((RadioButton) view).isChecked();
         ImageView imageChangeImageView = (ImageView) findViewById(R.id.ImageView);

         // Check if no view has focus-hide the virtual keyboard
         this.getCurrentFocus();
         if (view != null) {
             InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
             imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
         }
         // Check which RadioButton was clicked
         switch (view.getId()) {
             // Check which radio button was clicked
             case R.id.answer1:
                 if (checked)
                     imageChangeImageView.setImageResource(R.drawable.wrong);
                 break;
             case R.id.answer2:
                 if (checked)
                     isCount += 1;
                     imageChangeImageView.setImageResource(R.drawable.correct);
                 break;
             case R.id.answer3:
                 if (checked)
                     imageChangeImageView.setImageResource(R.drawable.wrong);
                 break;
             case R.id.answer4:
                 if (checked)
                     isCount += 1;
                     imageChangeImageView = (ImageView) findViewById(R.id.ImageView2);
                     imageChangeImageView.setImageResource(R.drawable.correct);
                 break;
             case R.id.answer5:
                 if (checked)
                     imageChangeImageView = (ImageView) findViewById(R.id.ImageView2);
                     imageChangeImageView.setImageResource(R.drawable.wrong);
                 break;
             case R.id.answer6:
                 if (checked)
                     imageChangeImageView = (ImageView) findViewById(R.id.ImageView2);
                     imageChangeImageView.setImageResource(R.drawable.wrong);
                 break;
             case R.id.answer7:
                 if (checked)
                     imageChangeImageView = (ImageView) findViewById(R.id.ImageView3);
                     imageChangeImageView.setImageResource(R.drawable.wrong);
                 break;
             case R.id.answer8:
                 if (checked)
                      imageChangeImageView = (ImageView) findViewById(R.id.ImageView3);
                      imageChangeImageView.setImageResource(R.drawable.wrong);
                 break;
             case R.id.answer9:
                 if (checked)
                     isCount += 1;
                     imageChangeImageView = (ImageView) findViewById(R.id.ImageView3);
                     imageChangeImageView.setImageResource(R.drawable.correct);
                 break;
             case R.id.answer10:
                 if (checked)
                     isCount += 1;
                     imageChangeImageView = (ImageView) findViewById(R.id.ImageView4);
                     imageChangeImageView.setImageResource(R.drawable.correct);
                 break;
             case R.id.answer11:
                 if (checked)
                     imageChangeImageView = (ImageView) findViewById(R.id.ImageView4);
                     imageChangeImageView.setImageResource(R.drawable.wrong);
                 break;
             case R.id.answer12:
                 if (checked)
                     imageChangeImageView = (ImageView) findViewById(R.id.ImageView4);
                     imageChangeImageView.setImageResource(R.drawable.wrong);
                 break;
         }

     }
   /**
    *   this method creating a summary of the amount of correct answer in the QUIZ
    *   @return  correctMessage
    *   @param hasName
    */
    private String createAnswerSummary(String hasName) {

        String name = getString(R.string.enter_your_name,hasName);
        String correctMessage = name + "\n You got  " +isCount+ "\t" + " correct Answer  ";
        if (isCount==4)
            Toast.makeText(this,"excellent got them all Correct!! ", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this," try  again next time!  ", Toast.LENGTH_SHORT).show();
        correctMessage = correctMessage + getString(R.string.Thank_You);
        return correctMessage;

    }
     /**
      * this method gat the name from the user and sand it to create AnswerSummery
      * and display the total answer and the name of the user

     */
    public void submitAnswer(View view) {
        EditText nameEdit = (EditText) findViewById(R.id.enter_name_view);
        String hasName = nameEdit.getText().toString();
        String correctMessage=createAnswerSummary(hasName);
        displayMessage(correctMessage);

    }
    /*
     this method  should display the total  correct answer of the user
     call the answerSummary method
     */

    private void displayMessage(String message) {
        TextView answerSummaryTextView = (TextView) findViewById(R.id.answer_summary_text_view);
        answerSummaryTextView.setText(message);
        isCount=0;
        RadioButton isButton1 = (RadioButton) findViewById(R.id.answer1);
        RadioButton isButton2 = (RadioButton) findViewById(R.id.answer2);
        RadioButton isButton3 = (RadioButton) findViewById(R.id.answer3);
        RadioButton isButton4 = (RadioButton) findViewById(R.id.answer4);
        RadioButton isButton5 = (RadioButton) findViewById(R.id.answer5);
        RadioButton isButton6 = (RadioButton) findViewById(R.id.answer6);
        RadioButton isButton7 = (RadioButton) findViewById(R.id.answer7);
        RadioButton isButton8 = (RadioButton) findViewById(R.id.answer8);
        RadioButton isButton9= (RadioButton) findViewById(R.id.answer9);
        RadioButton isButton10= (RadioButton) findViewById(R.id.answer10);
        RadioButton isButton11= (RadioButton) findViewById(R.id.answer11);
        RadioButton isButton12 = (RadioButton) findViewById(R.id.answer12);
        isButton1.setChecked(false);
        isButton2.setChecked(false);
        isButton3.setChecked(false);
        isButton4.setChecked(false);
        isButton5.setChecked(false);
        isButton6.setChecked(false);
        isButton7.setChecked(false);
        isButton8.setChecked(false);
        isButton9.setChecked(false);
        isButton10.setChecked(false);
        isButton11.setChecked(false);
        isButton12.setChecked(false);
        ImageView imageChangeImageView = (ImageView) findViewById(R.id.ImageView5);
        imageChangeImageView.setImageResource(R.drawable.purim);

    }
}