package com.example.oncare_front;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class UserFragment extends Fragment {

    LinearLayout tab_info, tab_noti, tab_dev, tab_del;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_user, container, false);

        tab_info=v.findViewById(R.id.user_tab_info);
        tab_noti=v.findViewById(R.id.user_tab_noti);
        tab_dev=v.findViewById(R.id.user_tab_dev);
        tab_del=v.findViewById(R.id.user_tab_del);

        tab_info.setOnClickListener(new View.OnClickListener() {
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