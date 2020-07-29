package com.covertspace.householdservices;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ElectricianFragment extends Fragment {


    public ElectricianFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_electrician, container, false);

        //rename title
        //getActivity().setTitle("Electrician");

       // ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // ((MainActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);

        return  v;
    }

}
