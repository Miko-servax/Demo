package com.example.test0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SlideActivity extends AppCompatActivity {

    //声明控件
    private ImageView IvHead;
    private SlideMenu slideMenu;
    private Button mBtnStudy;
    private Button mBtnEx;
    private Button mBtnPlay;
    private Button mBtnRead;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);


        //找到控件
        IvHead = findViewById(R.id.iv_head);
        slideMenu = findViewById(R.id.slideMenu);
        mBtnStudy = findViewById(R.id.btn_main_1);
        mBtnPlay = findViewById(R.id.btn_main_2);
        mBtnRead = findViewById(R.id.btn_main_3);
        mBtnEx = findViewById(R.id.btn_main_4);

        //实现侧滑
        IvHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideMenu.switchMenu();
            }
        });

        setListener();
    }

    private void setListener(){
        OnClick onClick = new OnClick();
        //对每个按钮进行setOnClickListener
        mBtnStudy.setOnClickListener(onClick);
        mBtnRead.setOnClickListener(onClick);

    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent =null;
            switch(view.getId()){
                case R.id.btn_main_1:
                    intent = new Intent(SlideActivity.this,StudyActivity.class);
                    break;
                case R.id.btn_main_2:
                    intent = new Intent(SlideActivity.this,ReadActivity.class);
                    break;
                case R.id.btn_main_3:
            }
            startActivity(intent);

        }
    }
}