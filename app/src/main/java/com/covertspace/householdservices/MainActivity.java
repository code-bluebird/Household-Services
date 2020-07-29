package com.covertspace.householdservices;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab1, fab2, fab3;
    Animation FabOpen, FabClose, FabRotateClockwise, FabRotateAnticlockwise;
    BottomNavigationView bottomNav;
    boolean isopen = false;
    private FrameLayout fragment_container;
    private MaidFragment maidFragment;
    private DashboardFragment dashboardFragment;
    private ElectricianFragment electricianFragment;
    private ProfileFragment profileFragment;
    private WatersupplyFragment watersupplyFragment;
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectFragment = null;
                    switch (menuItem.getItemId()) {

                        case R.id.navigation_dashboard:
                            selectFragment = new DashboardFragment();
                            break;
                        case R.id.navigation_maid:
                            selectFragment = new MaidFragment();
                            break;
                        case R.id.navigation_electrician:
                            selectFragment = new ElectricianFragment();
                            break;
                        case R.id.navigation_watersupply:
                            selectFragment = new WatersupplyFragment();
                            break;
                        /*case R.id.navigation_profile:
                        selectFragment = new WatersupplyFragment();
                        break;*/




                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectFragment).commit();

                    return true;
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        fragment_container = (FrameLayout) findViewById(R.id.fragment_container);

        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);

        FabOpen = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        FabClose = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_colse);
        FabRotateClockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);
        FabRotateAnticlockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anticlockwise);

        bottomNav = (BottomNavigationView) findViewById(R.id.bottomNav);

        MaidFragment maidFragment = new MaidFragment();
        DashboardFragment dashboardFragment = new DashboardFragment();
        ElectricianFragment electricianFragment = new ElectricianFragment();
        WatersupplyFragment watersupplyFragment = new WatersupplyFragment();
        ProfileFragment profileFragment = new ProfileFragment();

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isopen) {
                    fab3.startAnimation(FabClose);
                    fab2.startAnimation(FabClose);
                    fab1.startAnimation(FabRotateAnticlockwise);
                    fab2.setClickable(false);
                    fab3.setClickable(false);
                    isopen = false;
                } else {
                    fab3.startAnimation(FabOpen);
                    fab2.startAnimation(FabOpen);
                    fab1.startAnimation(FabRotateClockwise);
                    fab2.setClickable(true);
                    fab3.setClickable(true);
                    isopen = true;
                }
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/aabhishek_patel/"));
                startActivity(intent);
            }
        });

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/abhishekpatel16121997"));
                startActivity(intent);
            }
        });

        //link xml to bottom navigation menu

        bottomNav.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DashboardFragment()).commit();
    }
}
