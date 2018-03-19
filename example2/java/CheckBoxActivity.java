package com.shangli.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox mCb_5;
    private CheckBox mCb_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        mCb_5=findViewById(R.id.cb_5);
        mCb_6=findViewById(R.id.cb_6);

        mCb_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this, isChecked?"CheckBox5选中":"CheckBox5未选中", Toast.LENGTH_LONG).show();
            }
        });

        mCb_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this, isChecked?"checkbox6选中":"CheckBox6未选中", Toast.LENGTH_LONG).show();
            }
        });
    }
}
