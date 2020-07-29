package com.covertspace.householdservices;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {


    public DashboardFragment() {
        // Required empty public constructor
    }


    TextView profile,textprofile,textelectrician,textwater,textmaid;
    ImageView imageprofilemain,imageprofile,imagemaid,imageelectrician,imagewater;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dashboard, container, false);
        //getActivity().setTitle("Household Services");
        profile = (TextView) v.findViewById(R.id.profile);
        textprofile = (TextView) v.findViewById(R.id.textprofile);
        textmaid = (TextView) v.findViewById(R.id.textmaid);
        textelectrician = (TextView) v.findViewById(R.id.textelectrician);
        textwater = (TextView) v.findViewById(R.id.textwater);

        imageprofilemain = (ImageView) v.findViewById(R.id.imageprofilemain);
        imageprofile = (ImageView) v.findViewById(R.id.imageprofile);
        imagemaid = (ImageView) v.findViewById(R.id.imagemaid);
        imageelectrician = (ImageView) v.findViewById(R.id.imageelectrician);
        imagewater = (ImageView) v.findViewById(R.id.imagewater);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,new ProfileFragment()).commit();
            }
        });

        imageprofilemain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,new ProfileFragment()).commit();
            }
        });
        imagemaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,new MaidFragment()).commit();
            }
        });
        imageelectrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,new ElectricianFragment()).commit();
            }
        });
        imagewater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,new WatersupplyFragment()).commit();
            }
        });
        imageprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,new ProfileFragment()).commit();
            }
        });

        return v;
    }

}
