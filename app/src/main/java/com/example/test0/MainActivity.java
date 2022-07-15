package com.example.test0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.test0.util.ToastUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //声明
    private Button BtnLogin;
    private EditText mEtUser;
    private EditText mEtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到控件
        BtnLogin=findViewById(R.id.btn_login);
        mEtUser = findViewById(R.id.at1);
        mEtPass = findViewById(R.id.at2);

        //实现跳转

        /*
        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(MainActivity.this,FunctionActivity.class);
                startActivity(intent);
            }
        });

         */
        BtnLogin.setOnClickListener(this);

    }

    public void onClick(View v){
        //需要获取输入的用户名和密码
        String usersname = mEtUser.getText().toString();
        String password = mEtPass.getText().toString();
        Intent intent = null;
        //弹出内容设置
        String ok="登录成功";
        String fail = "密码错误，请重新登录";

        if((usersname.equals("Kano")) && (password.equals("123456"))){
            //toast
            //Toast.makeText(getApplicationContext(),ok,Toast.LENGTH_SHORT).show();

            ToastUtil.showMsg(MainActivity.this,ok);
            intent = new Intent(MainActivity.this, SlideActivity.class);
            startActivity(intent);
        }else{
//            ToastUtil.showMsg(MainActivity.this,ok);
            intent = new Intent(MainActivity.this, SlideActivity.class);
            startActivity(intent);
            //不正确

//            Toast toastCenter = Toast.makeText(getApplicationContext(),fail,Toast.LENGTH_SHORT);
//            toastCenter.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
//            toastCenter.show();

            ToastUtil.showMsg(MainActivity.this,fail);
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}