package org.kr.frtteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OwnerShopActivity extends AppCompatActivity {
    int numShop = 1;
    private LinearLayout dynamicLayout;
    private Button addButton;
    private Button delButton;
    private Button submitButton;
    private final int DYNAMIC_VIEW_ID=0x8000;

    Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_shop);
        ctx = this.getApplicationContext();



        dynamicLayout = (LinearLayout) findViewById(R.id.ownerDynamicLayout);
        addButton = (Button)findViewById(R.id.buttonShopAdd);
        delButton = (Button)findViewById(R.id.buttonShopDel);
        submitButton = (Button)findViewById(R.id.buttonShopSubmit);

        addButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dp1 = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1,
                        ctx.getResources().getDisplayMetrics());
                //---- 구분선
                View newView = new View(ctx);
                newView.setId(DYNAMIC_VIEW_ID + numShop * 10 + 0);
                newView.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp1*2));
                newView.setBackgroundColor(Color.RED);
                dynamicLayout.addView(newView);

                //---- 가게이름
                TextView newOwnerShopTxt = new TextView(ctx);
                newOwnerShopTxt.setId(DYNAMIC_VIEW_ID + numShop * 10 + 1);
                newOwnerShopTxt.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                newOwnerShopTxt.setText("가게 이름 정보");
                dynamicLayout.addView(newOwnerShopTxt);


                EditText newOwnerShopEdTxt = new EditText(ctx);
                newOwnerShopEdTxt.setId(DYNAMIC_VIEW_ID + numShop * 10 + 2);
                newOwnerShopEdTxt.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                newOwnerShopEdTxt.setText("");
                dynamicLayout.addView(newOwnerShopEdTxt);


                //----  가게주소
                TextView newOwnerShopLocTxt = new TextView(ctx);
                newOwnerShopLocTxt.setId(DYNAMIC_VIEW_ID + numShop * 10 + 3);
                newOwnerShopLocTxt.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                newOwnerShopLocTxt.setText("가게 주소 입력");
                dynamicLayout.addView(newOwnerShopLocTxt);


                EditText newOwnerShopLocEdTxt = new EditText(ctx);
                newOwnerShopLocEdTxt.setId(DYNAMIC_VIEW_ID + numShop * 10 + 4);
                newOwnerShopLocEdTxt.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                newOwnerShopLocEdTxt.setText("");
                dynamicLayout.addView(newOwnerShopLocEdTxt);

                //---- 사업자등록번호
                TextView newOwnerShopRegNumTxt = new TextView(ctx);
                newOwnerShopRegNumTxt.setId(DYNAMIC_VIEW_ID + numShop * 10 + 5);
                newOwnerShopRegNumTxt.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                newOwnerShopRegNumTxt.setText("사업자 등록번호 입력");
                dynamicLayout.addView(newOwnerShopRegNumTxt);


                EditText newOwnerShopRegNumEdTxt = new EditText(ctx);
                newOwnerShopRegNumEdTxt.setId(DYNAMIC_VIEW_ID + numShop * 10 + 6);
                newOwnerShopRegNumEdTxt.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                newOwnerShopRegNumEdTxt.setText("");
                dynamicLayout.addView(newOwnerShopRegNumEdTxt);

                //---- 사업자등록번호 등록 버튼
                Button newOwnerShopRegNumImgAddButton = new Button(ctx);
                newOwnerShopRegNumImgAddButton.setId(DYNAMIC_VIEW_ID + numShop * 10 + 7);
                newOwnerShopRegNumImgAddButton.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                newOwnerShopRegNumImgAddButton.setText("사업자 등록증 업로드");
                dynamicLayout.addView(newOwnerShopRegNumImgAddButton);
                numShop++;





            }

        });

        delButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });

        submitButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        owner.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다

            }

        });



    }
}