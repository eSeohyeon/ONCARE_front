package com.example.oncare_front;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ModifyActivity extends AppCompatActivity {

    Button btn_modi_email, btn_modi_pwd, btn_update;
    TextView txt_email, edit_name, edit_birthday, edit_phone, edit_call;
    String old_pwd, old_name, old_birthday, old_phone, old_call, new_pwd, new_pwd_again, new_name, new_birthday, new_phone, new_call;
    ModPwdDialog modPwdDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_modify);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn_modi_email=findViewById(R.id.btn_modi_email);
        btn_modi_pwd=findViewById(R.id.btn_modi_pwd);
        btn_update=findViewById(R.id.btn_update);
        txt_email=findViewById(R.id.data_email);
        edit_name=findViewById(R.id.edit_modi_name);
        edit_birthday=findViewById(R.id.edit_modi_birthday);
        edit_phone=findViewById(R.id.edit_modi_phone);
        edit_call=findViewById(R.id.edit_modi_call);

        modPwdDialog = new ModPwdDialog(this);

        // 테스트용
        old_name="김김김";
        old_birthday="20211010";
        old_phone="01012345678";
        old_call="119";

        
        // 현재 정보 표시
        edit_name.setHint(old_name);
        edit_birthday.setHint(old_birthday);
        edit_phone.setHint(old_phone);
        edit_call.setHint(old_call);

        
        btn_modi_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 이메일 변경 버튼 클릭

            }
        });

        btn_modi_pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {// 비밀번호 변경 버튼 클릭
                modPwdDialog.show();
                modPwdDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        old_pwd= modPwdDialog.getOld();
                        new_pwd= modPwdDialog.getNew();
                        new_pwd_again= modPwdDialog.getAgain();

                        if(old_pwd.equals(new_pwd)){
                            Log.v("Did I make it?", "Pleeeeeeeeeease");
                        }
                    }
                });
            }
        });

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 변경 사항 저장 버튼 클릭

                // 형식 유효성 체크 추가

                new_name= (String) edit_name.getText();
                new_birthday= (String) edit_birthday.getText();
                new_phone= (String) edit_phone.getText();
                new_call= (String) edit_call.getText();
            }
        });

    }
}