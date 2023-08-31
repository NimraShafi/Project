package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Fragment3 extends Fragment {

    Button btnn, btnn1;
    EditText edit;
    TextView txt;
    TextView txt2;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_3, container, false);
        return view;
    }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState){
            btnn = (Button) view.findViewById(R.id.btn);
            btnn1 = (Button) view.findViewById(R.id.btn1);
            edit = (EditText) view.findViewById(R.id.edittext);
            txt = (TextView) view.findViewById(R.id.textview);
            txt2 = (TextView) view.findViewById(R.id.textview2);



            btnn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double DollarValue = Double.parseDouble(edit.getText().toString());
                    calculateDollars(DollarValue);
                    txt2.setText("" + calculateDollars(DollarValue));
                }
            });

            btnn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double EuroValue = Double.parseDouble(edit.getText().toString());
                    calculateEuro(EuroValue);
                    txt2.setText("" + calculateEuro(EuroValue));
                }
            });


        }

        public double calculateDollars(double value) {
            double dollars = value * 0.0036;
            return dollars;
        }

        public double calculateEuro(double value) {
            double Euro = value * 0.0033;
            return Euro;
    }
}