package org.kr.frtteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OwnerTestActivity extends AppCompatActivity {

    TextView ownerIdEdTxt;
    TextView ownerPwEdTxt;
    TextView ownerPwReEdTxt;
    TextView ownerNumEdTxt;
    TextView ownerAcntBankTxt;
    TextView ownerAcntNumEdTxt;
    TextView ownerShopLocEdTxt;

    Button buttonSubmit;
    Button buttonAcntBankBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ownertest);

        ownerIdEdTxt = (TextView)findViewById(R.id.ownerIdEdTxt);
        ownerPwEdTxt = (TextView)findViewById(R.id.ownerPwEdTxt);
        ownerPwReEdTxt = (TextView)findViewById(R.id.ownerPwReEdTxt);
        ownerNumEdTxt = (TextView)findViewById(R.id.ownerNumEdTxt);
        ownerAcntBankTxt = (TextView)findViewById(R.id.ownerAcntBankTxt);
        ownerAcntNumEdTxt = (TextView)findViewById(R.id.ownerAcntNumEdTxt);
        ownerShopLocEdTxt = (TextView)findViewById(R.id.ownerShopLocEdTxt);

       buttonSubmit = (Button)findViewById(R.id.buttonSubmit);
       buttonAcntBankBtn = (Button)findViewById(R.id.buttonAcntBankBtn);





        buttonSubmit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {





                //0. Null 체크
                if (ownerIdEdTxt == null){
                    //ID null 처리
                    return;
                }

                if (ownerPwEdTxt == null){
                    //PW null 처리
                    return;
                }
                if (ownerNumEdTxt == null){
                    //PW Re null 처리
                    return;
                }
                if (ownerAcntNumEdTxt == null){
                    //계좌번호 null 처리
                    return;
                }










                //1. 비밀번호 비밀번호 재입력 일치여부 체크


                if (!ownerPwEdTxt.equals(ownerPwReEdTxt)) {
                    //유저에게 틀렸는지를 알린다
                    return;
                }




                //2. 제출 버튼 클릭시 인자들 모아서 제출 후 다음 화면 (심사중)으로 넘어감






                Intent intent = new Intent(
                        getApplicationContext(),
                        owner.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });



    }
}
