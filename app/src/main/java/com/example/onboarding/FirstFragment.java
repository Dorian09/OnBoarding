package com.example.onboarding;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FirstFragment extends Fragment {
    TextView next;
    TextView skip;
    ViewPager viewPager;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        //Inicializate ViewPaper from main activity
        viewPager = getActivity().findViewById(R.id.viewpager);
        next = view.findViewById(R.id.slideOneNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
        skip = view.findViewById(R.id.slideSkip);
        skip.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent (v.getContext(), SegundoActivity.class);
                startActivity(siguiente);
            }
        });

        return view;
    }

}
