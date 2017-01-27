package com.souka.digitaltvapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.souka.digitaltvapp.R;
import com.souka.digitaltvapp.utils.Utils;


public class Mpeg2Activity extends AppCompatActivity {

    private Button mpeg2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpeg2);
        initView();
        initListener();
    }

    private void initView()
    {
        mpeg2Btn =(Button)findViewById(R.id.button);
    }

    private void initListener()
    {
        Utils.cancelBtn(this,mpeg2Btn);
    }

//    private View.OnClickListener mpeg2OnClickListener = new View.OnClickListener(){
//
//        @Override
//        public void onClick(View v) {
//            finish();
//            Mpeg2Activity.this.overridePendingTransition(0, R.anim.activity_down);
//        }
//    };
}
