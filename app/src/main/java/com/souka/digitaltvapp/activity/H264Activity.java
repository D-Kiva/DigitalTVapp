package com.souka.digitaltvapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.souka.digitaltvapp.R;
import com.souka.digitaltvapp.utils.Utils;


public class H264Activity extends AppCompatActivity {

    private Button h264btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h264);
        initView();
        initListener();
    }

    private void initView()
    {
        h264btn =(Button)findViewById(R.id.button);
    }

    private void initListener()
    {
        Utils.cancelBtn(this,h264btn);
    }

//    private View.OnClickListener h264OnClickListener = new View.OnClickListener(){
//
//        @Override
//        public void onClick(View v) {
//            finish();
//            H264Activity.this.overridePendingTransition(0, R.anim.activity_down);
//        }
//    };
}
