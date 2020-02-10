package com.TwentyFourTech.brainlimits.Fragment;

import android.content.Intent;
import android.support.annotation.NonNull;
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

public class FragmentHasil extends Fragment {

    SharedPrefManager sp;
    TextView nama, email;
    Button btnlogin;
    View v;
    public FragmentHasil() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_hasil, container, false);
        sp = new SharedPrefManager(getContext());
        //preferenceHelper = PreferenceHelper.getInstance(getContext().getApplicationContext());

        nama = (TextView) v.findViewById(R.id.txt_nama_hasil);

        sp = new SharedPrefManager(getContext());

        nama.setText("" + sp.getKeyNama());

        return v;
    }

}
