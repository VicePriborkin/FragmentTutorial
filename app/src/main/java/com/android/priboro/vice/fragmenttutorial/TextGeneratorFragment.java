package com.android.priboro.vice.fragmenttutorial;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class TextGeneratorFragment extends Fragment implements View.OnClickListener {

    TextView tvRandom;

    String[] randText = {
            "Shangri-la is not the celestine affirmation of the lotus.",
            "Our popular definition for moonlight is to remember others confidently.",
            "The chaos of forgetting creators is superior.",
            "The individual traps.",
            "Confucius says: the guru is like the lotus.",
            "The politics of facilitating followers is honorable.",
            "The strange light of milk is to respect with enlightenment.",
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_text_generator2, container, false);

        tvRandom = (TextView) view.findViewById(R.id.tvRandom);
        tvRandom.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Random r = new Random();
        int index = r.nextInt(randText.length);

       tvRandom.setText(randText[index]);
    }
}
