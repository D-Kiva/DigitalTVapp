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
 * {@link DTMBFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DTMBFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DTMBFragment extends Fragment {
    private  static final String TAG = "DTMBFragment";
    public DTMBFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dtmb, container, false);
        Log.e("HEHE", "2日狗");
        return view;
    }

}
