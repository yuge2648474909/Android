package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        tv.setText("你好， 世界!");
        tv.setTextColor(Color.BLUE);
        Button button = findViewById(R.id.button);
        //完成点击跳转功能
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转实现
                Intent intent = new Intent();

                intent.setClass(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        // 观察日志
        Log.d("ning", "onCreate");
    }
}