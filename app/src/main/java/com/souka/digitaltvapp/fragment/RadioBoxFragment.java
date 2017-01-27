package com.souka.digitaltvapp.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.souka.digitaltvapp.R;

public class RadioBoxFragment extends Fragment{

    private View view;
    private RelativeLayout relativeLayout1;
    private RelativeLayout relativeLayout2;
    private TextView title_dialog;
    private FragmentManager fm;
    private Button button_dialog;



    private ListView radioBoxView;
    private RelativeLayout relativeLayout4;
    private LinearLayout linearLayout1;
    private TextView tv_devcie_name;
    private RadioButton radioButton;


    public RadioBoxFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.dialog_radio_layout, container, false);
        radioBoxView = (ListView) inflater.inflate(R.layout.box_radio_item,null,false);
        Log.e("HEHE", "4日狗");
        return view;
    }

    private void initView()
    {
        title_dialog =(TextView)view.findViewById(R.id.title_dialog);
        button_dialog =(Button)view.findViewById(R.id.button_dialog);

    }
}