package com.practice.android.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= (Button)findViewById(R.id.start);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
//        int[] arr=new int[5];
//        arr[0]=1;
//
//        Log.d("MainActivity","Element at index 0: "+ arr[0]);

    }


//    public void start_button(View v)
//    {
//        Intent intent=new Intent(this,Main2Activity.class);
//        startActivity(intent);
//    }

}
