package com.souka.digitaltvapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.souka.digitaltvapp.R;
import com.souka.digitaltvapp.utils.*;


public class AdvanceActivity extends AppCompatActivity {
    private Button adbtn;

    private RelativeLayout adMpegTs;
    private RelativeLayout adMpeg2;
    private RelativeLayout adH264;


//    private  Intent mintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        initView();
        initListener();
    }

    private void initListener() {
//        adbtn.setOnClickListener(adOnClickListener);
        Utils.cancelBtn(this,adbtn);
        adMpegTs.setOnClickListener(adGroupListener);
        adMpeg2.setOnClickListener(adGroupListener);
        adH264.setOnClickListener(adGroupListener);
    }

    private void initView()
    {
        adbtn = (Button)findViewById(R.id.button);
        adMpegTs =(RelativeLayout)findViewById(R.id.adMpegTs);
        adMpeg2 =(RelativeLayout)findViewById(R.id.adMpeg2);
        adH264 = (RelativeLayout)findViewById(R.id.adH264);
    }

//    private OnClickListener adOnClickListener = new OnClickListener(){
//
//        @Override
//        public void onClick(View v) {
//            finish();
//            AdvanceActivity.this.overridePendingTransition(0, R.anim.activity_down);
//        }
//    };

    private OnClickListener adGroupListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent mintent = new Intent();
            switch (v.getId()){
                case R.id.adMpegTs:
                    mintent.setClass(AdvanceActivity.this,MpegTSActivity.class);
                    startActivity(mintent);
                    break;
                case R.id.adMpeg2:
                    mintent.setClass(AdvanceActivity.this,Mpeg2Activity.class);
                    startActivity(mintent);
                    break;
                case R.id.adH264:
                    mintent.setClass(AdvanceActivity.this,H264Activity.class);
                    startActivity(mintent);
                    break;
            }
        }
    };
}
