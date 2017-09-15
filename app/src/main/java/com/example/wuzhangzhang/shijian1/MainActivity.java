package com.example.wuzhangzhang.shijian1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scd);
        Button  denglubutton= (Button) findViewById(R.id.button2);
        Button  tishibutton=(Button)findViewById(R.id.button4);
        final View view1 = getLayoutInflater().inflate(R.layout.qwe, null);
        final EditText userid = (EditText) view1.findViewById(R.id.editTextUserId);
        final EditText password = (EditText) view1.findViewById(R.id.editTextPwd);
        denglubutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setView(view1).setTitle("登陆")
                        .setPositiveButton("登陆", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (!userid.getText().toString().equals("abc") || !password.getText().toString().equals("123")) {
                                    Toast.makeText(MainActivity.this, "用户名或密码错误", Toast.LENGTH_LONG).show();
                                } else {
                                    Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_LONG).show();
                                }
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        }).show();
            }

        });


        tishibutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("请点击登陆按钮").setTitle("温馨提示");
                builder.show();
            }
        });
    }
}

