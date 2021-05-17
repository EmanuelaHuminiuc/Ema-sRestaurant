package com.ema.restaurant;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class FeedbackActivity extends AppCompatActivity {

    Toolbar toolbar;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText nameField = (EditText) findViewById(R.id.EditText_Enter_your_name);
        String name = nameField.getText().toString();

        final EditText emailField = (EditText) findViewById(R.id.EditText_Enter_your_Email);
        String email = emailField.getText().toString();

        final EditText feedbackField = (EditText) findViewById(R.id.EditText_FeedbackBody);
        String feedback = feedbackField.getText().toString();


        Submit=(Button)findViewById(R.id.ButtonSendFeedback);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Thanks! Your Feedback is submitted.", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void sendFeedback(View view) {
        Toast.makeText(getApplicationContext(), "Thanks! Your Feedback is submitted.", Toast.LENGTH_LONG).show();
    }
}
