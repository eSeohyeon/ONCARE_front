package com.example.oncare_front;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    TextView txt_name, data_heartrate, data_step, data_ecg, nim;
    int heartrate, step;
    String ecg, user_name;// 가져온 생체 데이터 저장


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_home, container, false);

        txt_name=v.findViewById(R.id.user_name);
        nim=v.findViewById(R.id.nim);
        data_heartrate=v.findViewById(R.id.data_heartrate);
        data_step=v.findViewById(R.id.data_step);
        data_ecg=v.findViewById(R.id.data_ecg);
        txt_name.bringToFront();
        nim.bringToFront();

        heartrate=120;
        step=7878;
        ecg="부정맥";
        user_name="김김김김";  // 테스트용

        txt_name.setText(user_name);
        data_heartrate.setText(Integer.toString(heartrate));
        data_step.setText(Integer.toString(step));
        data_ecg.setText(ecg);


        return v;

    }
}