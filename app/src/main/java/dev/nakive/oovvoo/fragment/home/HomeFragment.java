package dev.nakive.oovvoo.fragment.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import dev.nakive.oovvoo.MainActivity;
import dev.nakive.oovvoo.R;
import dev.nakive.oovvoo.activity.History;
import dev.nakive.oovvoo.activity.Login;
import dev.nakive.oovvoo.activity.TopUp;
import dev.nakive.oovvoo.activity.Transfer;

public class HomeFragment extends Fragment {
    private MainActivity parentFragment;
    private HomeViewModel homeViewModel;
    private ImageButton btn_topup, btn_transfer, btn_history;
    private Button btn_login;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        parentFragment = (MainActivity) getActivity();
        btn_topup = root.findViewById(R.id.btntopupbalance);
        btn_transfer = root.findViewById(R.id.btntransfer);
        btn_history = root.findViewById(R.id.btnhistory);
        parentFragment = (MainActivity) getActivity();
        btn_login = root.findViewById(R.id.btn_login);
        btn_topup.setOnClickListener(v->{
          startActivity(new Intent(getActivity(), TopUp.class));
        });

        btn_transfer.setOnClickListener(v->{
            startActivity(new Intent(getActivity(), Transfer.class));
        });
        btn_history.setOnClickListener(v->{
            startActivity(new Intent(getActivity(), History.class));
        });
        btn_login.setOnClickListener(v->{
            startActivity(new Intent(getActivity(), Login.class));

        });
        return root;
    }


}