package dev.nakive.oovvoo.fragment.topup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import dev.nakive.oovvoo.R;

public class Instant_top_up extends Fragment {
    EditText nominaltopup;
    Button topup;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_instant_top_up, container, false);
        nominaltopup = view.findViewById(R.id.et_nominal_topup);
        topup = view.findViewById(R.id.btn_topup);

        topup.setOnClickListener(v->{

        });

        return view;
    }
}