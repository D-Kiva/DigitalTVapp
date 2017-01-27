package com.souka.digitaltvapp.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.souka.digitaltvapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DVBFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DVBFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DVBFragment extends Fragment {
    private  static final String TAG = "DVBFragment";


    public DVBFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dvb, container, false);
        Log.e("HEHE", "3日狗");
        return view;
    }


}
