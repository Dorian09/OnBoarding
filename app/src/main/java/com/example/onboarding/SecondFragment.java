package com.example.onboarding;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    TextView next;
    TextView back;
    TextView skip;
    ViewPager viewPager;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        //Inicializa el ViewPager para el Main Activity
        viewPager = getActivity().findViewById(R.id.viewpager);

        next = view.findViewById(R.id.slideThoNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });


        back = view.findViewById(R.id.slideThoBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
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

        /*@Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //Cargamos el texto a exportar
            final EditText textoexportar;
            textoexportar=(EditText)findViewById(R.id.pasarTexto);

            Button btn = (Button) findViewById(R.id.botonact1);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (v.getContext(), AcercaDe.class);
                    //Exportar parametro
                    intent.putExtra("frase", textoexportar.getText().toString());
                    //
                    startActivityForResult(intent, 0);
                }
            });
        }
    }*/


        return view;
    }

}
