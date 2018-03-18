package com.shangli.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;//声明Button
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到Button的id
        mBtnTextView=findViewById(R.id.btn_textview);
//        //设置Button的点击事件
//        mBtnTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //跳转到TextView演示界面
//                Intent intent =new Intent(MainActivity.this,TextViewActivity.class);
//                startActivity(intent);
//            }
//        });

        //找到Button的id
        mBtnButton=findViewById(R.id.btn_button);
//        //设置Button的点击事件
//        mBtnButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //跳转到Button演示界面
//                Intent intent =new Intent(MainActivity.this,ButtonActivity.class);
//                startActivity(intent);
//            }
//        });
        mBtnEditText=findViewById(R.id.btn_edittext);
//        mBtnEditText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //跳转到EditText演示界面
//                Intent intent=new Intent(MainActivity.this, EditTextActivity.class);
//                startActivity(intent);
//            }
//        });
        mBtnRadioButton=findViewById(R.id.btn_radiobutton);
//        mBtnRadioButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //跳转到RadioButton界面
//                Intent  intent=new Intent(MainActivity.this,RadioButtonActivity.class);
//                startActivity(intent);
//            }
//        });
        setListeners();
    }

    private void setListeners(){
        OnClick OnClick=new OnClick();
        mBtnTextView.setOnClickListener(OnClick);
        mBtnButton.setOnClickListener(OnClick);
        mBtnEditText.setOnClickListener(OnClick);
        mBtnRadioButton.setOnClickListener(OnClick);
    }
    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent=null;
            switch(view.getId())
            {
                case R.id.btn_textview:
                    intent=new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    intent=new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent=new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent=new Intent(MainActivity.this,RadioButtonActivity.class);
            }
            startActivity(intent);
        }
    }
}
