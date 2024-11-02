package com.example.oncare_front;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class UserFragment extends Fragment {

    LinearLayout tab_modi, tab_noti, tab_dev, tab_del;
    TextView txt_name, txt_email;
    String user_name, user_email; // 사용자 정보 저장


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_user, container, false);

        tab_modi=v.findViewById(R.id.user_tab_modi);
        tab_noti=v.findViewById(R.id.user_tab_noti);
        tab_dev=v.findViewById(R.id.user_tab_dev);
        tab_del=v.findViewById(R.id.user_tab_del);
        txt_name=v.findViewById(R.id.user_name);
        txt_email=v.findViewById(R.id.user_email);

        // user_name, user_email 에 사용자 이름과 이메일을 불러와서 저장
        // txt_name.setText(user_name);
        // txt_email.setText(user_email);

        tab_modi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent to_modify = new Intent(getActivity(), ModifyActivity.class);
                startActivity(to_modify);

            }
        });

        tab_noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        tab_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        tab_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent to_delete = new Intent(getActivity(), DeleteActivity.class);
                startActivity(to_delete);
            }
        });

        return v;
    }
}