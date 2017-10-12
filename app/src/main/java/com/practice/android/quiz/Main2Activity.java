package com.practice.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void submit_button(View view)
    {
        int score=0;
        RadioButton rb2=(RadioButton)findViewById(R.id.s2);
        if(rb2.isChecked())
            score+=10;
        RadioButton rb3=(RadioButton)findViewById(R.id.t1);
        if(rb3.isChecked())
            score+=10;
        RadioButton rb4=(RadioButton)findViewById(R.id.f2);
        if(rb4.isChecked())
            score+=10;
        EditText text=(EditText)findViewById(R.id.ans);
        String str=text.getText().toString();
        if(str.equals("NEXUS"))
            score+=10;
        CheckBox rb5=(CheckBox)findViewById(R.id.l2);
        CheckBox rb6=(CheckBox) findViewById(R.id.l3);
        CheckBox rb7=(CheckBox) findViewById(R.id.l1);
        CheckBox rb8=(CheckBox) findViewById(R.id.l4);

        if(rb5.isChecked() && rb6.isChecked() && !rb7.isChecked() && !rb8.isChecked())
            score+=10;
        Toast toast=Toast.makeText(getApplicationContext(),"Your Score: "+score,Toast.LENGTH_SHORT);
        toast.show();





    }
}
