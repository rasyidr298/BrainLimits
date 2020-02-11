package com.TwentyFourTech.brainlimits.BottomNav;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.TwentyFourTech.brainlimits.Fragment.FragmentHasil;
import com.TwentyFourTech.brainlimits.Fragment.FragmentProfile;
import com.TwentyFourTech.brainlimits.Fragment.FragmentSoal;
import com.TwentyFourTech.brainlimits.R;

public class BottomNav extends AppCompatActivity {


    private TabLayout tabLayout ;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout) findViewById(R.id.tablayout_id);
        viewPager =(ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.AddFragment(new FragmentProfile(),"Profile");
        adapter.AddFragment(new FragmentSoal(),"ModelSoal");
        adapter.AddFragment(new FragmentHasil(),"Hasil");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.activity_profile);

        tabLayout.getTabAt(1).setIcon(R.drawable.activity_soal);

        tabLayout.getTabAt(2).setIcon(R.drawable.activity_hasil);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);




    }
}
