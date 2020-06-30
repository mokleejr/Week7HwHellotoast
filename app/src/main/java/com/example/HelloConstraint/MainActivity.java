package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {
    private int mCount=0;
    private TextView mShowCount;
    private Button zero;
    private Button count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zero = findViewById(R.id.button_zero);
        count = findViewById(R.id.button_count);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);

        toast.show();

    }
    public void countUp(View view){
        mCount++;
        if(mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            if(mCount %2==0) {
                count.setBackgroundColor(Color.GREEN);
            }
            else{
                count.setBackgroundColor(Color.MAGENTA);
            }
        }


    }

    public void callMethod(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        zero.setBackgroundColor(0xffaaaaaa);
        count.setBackgroundColor(rgb(98,0,238));
    }
}