package com.example.a21homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondAvtivity extends AppCompatActivity {

    private TextView textView;
    private String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_avtivity);

        textView=findViewById(R.id.textView);

        st=getIntent().getExtras().getString("value",st);
        textView.setText(st);
    }
}