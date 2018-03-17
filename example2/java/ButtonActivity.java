package com.shangli.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mBtn3;//声明控件
    private TextView mtv_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        mBtn3=findViewById(R.id.btn_3);//找到控件
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this,"button3被点击了",Toast.LENGTH_LONG).show();
            }
        });

        mtv_1=findViewById(R.id.tv_1);
        mtv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this, "文字1被点击了", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void showToast(View view){
        Toast.makeText(this, "button4被点击了", Toast.LENGTH_LONG).show();
    }
}
