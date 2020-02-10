package com.TwentyFourTech.brainlimits.Fragment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.TwentyFourTech.brainlimits.Login.LoginActivity;
import com.TwentyFourTech.brainlimits.Login.SharedPrefManager;
import com.TwentyFourTech.brainlimits.R;

public class FragmentProfile extends Fragment {
    SharedPrefManager sp;
    TextView nama, email;
    Button btnlogin;
    View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_profile, container, false);
        sp = new SharedPrefManager(getContext());
        nama = (TextView) v.findViewById(R.id.txt_nama);
        email = (TextView) v.findViewById(R.id.txt_email);
        btnlogin = (Button) v.findViewById(R.id.btn_Logout);
        sp = new SharedPrefManager(getContext());

        nama.setText("" + sp.getKeyNama());
        email.setText("" + sp.getKeyEmail());
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
                sp.saveSPBolean(SharedPrefManager.SP_SUDAH_LOGIN, false);

                //		preferenceHelper.setLogin(false);
            }
        });
        return v;
    }
}
