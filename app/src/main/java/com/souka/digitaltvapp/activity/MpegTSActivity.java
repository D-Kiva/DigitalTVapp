package com.souka.digitaltvapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.souka.digitaltvapp.R;
import com.souka.digitaltvapp.utils.Utils;

public class MpegTSActivity extends AppCompatActivity {

    private Button mpegtsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpeg_ts);
        initView();
        initListener();
    }

    private void initView()
    {
        mpegtsBtn =(Button)findViewById(R.id.button);
    }

    private void initListener()
    {
        Utils.cancelBtn(this,mpegtsBtn);
    }

//    private View.OnClickListener mpegtsOnClickListener = new View.OnClickListener(){
//
//        @Override
//        public void onClick(View v) {
//            finish();
//            MpegTSActivity.this.overridePendingTransition(0, R.anim.activity_down);
////            onDestroy();
//            Log.e("123","124");
//        }
//    };

    protected void onDestroy() {
        super.onDestroy();

    }
}
