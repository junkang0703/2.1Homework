    package com.example.a21homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        private int mCount = 0;
        private TextView mShowCount;
        private Button btnShow;
        private String st;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mShowCount = (TextView) findViewById(R.id.show_count);
            btnShow = findViewById(R.id.button_toast);

            btnShow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(MainActivity.this, SecondAvtivity.class);
                    st=mShowCount.getText().toString();
                    in.putExtra("value",st);
                    startActivity(in);
                }
            });
        }

        public void countUp(View view){
            ++mCount;
            if (mShowCount!=null)
                mShowCount.setText(Integer.toString(mCount));
        }
    }