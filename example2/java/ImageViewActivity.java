package com.shangli.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        //使用gradle添加第三方依赖库Glide，使用Glide加载网络图片
        mIv4=findViewById(R.id.iv_4);
        Glide.with(this).load("http://www.uml.org.cn/mobiledev/images/201512151004.jpg").into(mIv4);
    }
}
