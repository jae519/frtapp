package org.kr.frtteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OwnerTestActivity extends AppCompatActivity {

    TextView ownerIdEdTxt;
    TextView ownerPwEdTxt;
    TextView ownerPwReEdTxt;

    Button buttonGotoShopReg;

    Context appContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ownertest);

        ownerIdEdTxt = (TextView)findViewById(R.id.ownerIdEdTxt);
        ownerPwEdTxt = (TextView)findViewById(R.id.ownerPwEdTxt);
        ownerPwReEdTxt = (TextView)findViewById(R.id.ownerPwReEdTxt);

        buttonGotoShopReg = (Button)findViewById(R.id.buttonGotoShopReg);



        appContext = this.getApplicationContext();

        buttonGotoShopReg.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {



                Log.d("onclick","buttonGotoShopReg가 클릭되었습니다.");


                //0. Null 체크
                if (ownerIdEdTxt.getText().toString().equals("")){
                    //ID null 처리
                    Toast myToast = Toast.makeText(appContext,"이메일을 입력하세요", Toast.LENGTH_SHORT);
                    myToast.show();
                    return;
                }

                if (ownerPwEdTxt.getText().toString().equals("")){
                    //PW null 처리
                    Toast myToast = Toast.makeText(appContext,"패스워드를 입력하세요", Toast.LENGTH_SHORT);
                    myToast.show();
                    return;
                }
                if (ownerPwReEdTxt.getText().toString().equals("")){
                    //PW Re null 처리
                    Toast myToast = Toast.makeText(appContext,"패스워드 재입력을 입력하세요", Toast.LENGTH_SHORT);
                    myToast.show();
                    return;
                }

                //1. 비밀번호 비밀번호 재입력 일치여부 체크


                if (!ownerPwEdTxt.getText().toString().equals(ownerPwReEdTxt.getText().toString())) {
                    Toast myToast = Toast.makeText(appContext,"패스워드가 불일치합니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                    return;
                }

                //2. 가계 입력 메뉴로 이동


                Intent intent = new Intent(
                        getApplicationContext(),
                        OwnerShopActivity.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });



    }
}
