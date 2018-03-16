package com.shangli.helloworld;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTV_4;//声明控件
    private TextView mTV_5;
    private TextView mtv_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_text_view);

        mTV_4=findViewById(R.id.tv_4);//找到控件
        mTV_4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//设置中划线
        mTV_4.getPaint().setAntiAlias(true);//去除锯齿

        mTV_5=findViewById(R.id.tv_5);
        mTV_5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//设置下划线

        mtv_6=findViewById(R.id.tv_6);
        mtv_6.setText(Html.fromHtml("<u>设置下划线的方法二</u>"));

    }
}
