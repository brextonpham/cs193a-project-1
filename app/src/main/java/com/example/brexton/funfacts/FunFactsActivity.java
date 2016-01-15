package com.example.brexton.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;
    private Button mChangeColorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mChangeColorButton = (Button) findViewById(R.id.changeColorButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();

                mFactTextView.setText(fact);
            }
        };
        mShowFactButton.setOnClickListener(listener1);

        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = mColorWheel.getColor();

                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
                mChangeColorButton.setTextColor(color);
            }
        };
        mChangeColorButton.setOnClickListener(listener2);




    }
}
