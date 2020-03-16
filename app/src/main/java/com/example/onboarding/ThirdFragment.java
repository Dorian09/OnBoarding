package com.example.onboarding;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdFragment extends Fragment {

    TextView back;
    TextView done;
    ViewPager viewPager;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        //Inicializa el ViewPager para el Main Activity
        viewPager = getActivity().findViewById(R.id.viewpager);

        back = view.findViewById(R.id.slideThreeBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });

        done = view.findViewById(R.id.slideThreeDone);
        done.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent (v.getContext(), SegundoActivity.class);
                startActivity(siguiente);
            }
        });

        return view;
    }

}
