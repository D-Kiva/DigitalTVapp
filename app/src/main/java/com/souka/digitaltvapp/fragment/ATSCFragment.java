package com.souka.digitaltvapp.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;

import com.souka.digitaltvapp.R;
import com.souka.digitaltvapp.utils.TextDialog;
import com.souka.digitaltvapp.utils.Utils;


public class ATSCFragment extends Fragment {
    private  static final String TAG = "ATSCFragment";

    private Context mContext;
    private View view;
    private View mtextView;
    private RelativeLayout atscFunctionFlag;
    private RelativeLayout atscLocalIp;
    private RelativeLayout atscBoardcastProfile;

    private TextDialog textDialog = null;
    private TextDialog.Builder builder = null;
    private TextView textView;
    private AlertDialog alert1 = null;
    private AlertDialog.Builder builder1 =null;

    private Utils utils;

    private int width;
    private int height;

    public ATSCFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_atsc, container, false);
        mtextView = inflater.inflate(R.layout.dialog_text_layout,null,false);
//        mlayout = inflater.inflate(R.layout.dialog_text_layout,(ViewGroup) container.findViewById(R.id.dialog));
        mContext = this.getActivity();

        WindowManager wm = (WindowManager) getContext()
                .getSystemService(Context.WINDOW_SERVICE);

        width = wm.getDefaultDisplay().getWidth();
        height = wm.getDefaultDisplay().getHeight();
//        TextView txt_content = (TextView)view.findViewById(R.id.txt_atsccontent);
//        txt_content.setText("第一个Fragment");

        Log.e("HEHE", "1日狗");
        initView();
        initListener();
        return view;
    }

    private void initView() {
        atscFunctionFlag =(RelativeLayout)view.findViewById(R.id.atscFunctionFlag);
        atscLocalIp =(RelativeLayout)view.findViewById(R.id.atscLocalIp);
        atscBoardcastProfile =(RelativeLayout)view.findViewById(R.id.atscBoardcastProfile);
    }

    private void initListener()
    {
        atscLocalIp.setOnClickListener(adGroupListener);
        atscBoardcastProfile.setOnClickListener(adGroupListener);
    }

    private OnClickListener adGroupListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
//            Intent mintent = new Intent();
            switch (v.getId()){
                case R.id.atscFunctionFlag:
                    Log.e("11111","22222");
                    break;
                case R.id.atscLocalIp:
                    utils = new Utils();
                    utils.textOnDialog(R.string.atsc_local_ip,mContext);
//                    builder = new TextDialog.Builder(mContext).setTitile("Local IP").setMessage(null).setDefaultBtn(null, new OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            Log.e("qqq","eeee");
//                        }
//                    });
//                    builder.show();

//                    builder1 = new TextDialog.Builder(mContext);
//                    builder1.setTitle(R.string.atsc_local_ip);
//                    builder1.show();
//                    new AlertDialog.Builder(mContext).setTitle(R.id.)
//                    new AlertDialog.Builder(mContext).setTitle("请输入").setIcon(android.R.drawable.ic_dialog_info).setView(new EditText(mContext)).setPositiveButton("确定", null).setNegativeButton("取消", null).show();
                    break;
                case R.id.atscBoardcastProfile:
//                    new AlertDialog.Builder(mContext).setTitle("单选框").setMultiChoiceItems(new String[] { "Item1", "Item2" },0,new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int which) {
//                                    dialog.dismiss();
//                                }
//                            }).setNegativeButton("取消", null).show();
                    break;
            }
        }
    };



}


