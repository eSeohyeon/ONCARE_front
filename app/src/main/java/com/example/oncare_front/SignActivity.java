package com.example.oncare_front;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAnimation;


public class SignActivity extends AppCompatActivity {

    ImageView btn_back, tooltip_warn;
    Button btn_next;
    EditText edit_email, edit_pwd, edit_pwd_again;
    String email_input, pwd_input, pwd_again_input;
    Balloon tooltip_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn_back=findViewById(R.id.btn_back);
        tooltip_warn=findViewById(R.id.tooltip_warn);
        btn_next=findViewById(R.id.btn_next);
        edit_email=findViewById(R.id.edit_email);
        edit_pwd=findViewById(R.id.edit_pwd);
        edit_pwd_again=findViewById(R.id.edit_pwd_again);

        tooltip_pwd = new Balloon.Builder(getApplicationContext())
                .setArrowSize(10)
                .setArrowOrientation(ArrowOrientation.TOP)
                .setIsVisibleArrow(true)
                .setArrowPosition(0.3f)
                .setWidthRatio(0.4f)
                .setHeight(60)
                .setPadding(5)
                .setTextSize(10f)
                .setCornerRadius(4f)
                .setAlpha(0.9f)
                .setText("8~16자\n영문 대소문자, 숫자 포함")
                .setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white))
                .setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.theme_blue))
                .setBalloonAnimation(BalloonAnimation.FADE)
                .build();

        tooltip_warn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooltip_pwd.showAlignTop(tooltip_warn, 71, -10);
            }
        });


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 뒤로가기 버튼 클릭
                Intent to_login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(to_login);
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 다음으로 버튼 클릭
                email_input= String.valueOf(edit_email.getText());
                pwd_input= String.valueOf(edit_pwd.getText());
                pwd_again_input= String.valueOf(edit_pwd_again.getText());

                Intent next =  new Intent(getApplicationContext(), SignActivity2.class);
                startActivity(next);

            }
        });




    }
}