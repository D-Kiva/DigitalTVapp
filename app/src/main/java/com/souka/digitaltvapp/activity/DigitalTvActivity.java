package com.souka.digitaltvapp.activity;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.souka.digitaltvapp.R;
import com.souka.digitaltvapp.fragment.ATSCFragment;
import com.souka.digitaltvapp.fragment.DVBFragment;
import com.souka.digitaltvapp.fragment.DTMBFragment;
import com.souka.digitaltvapp.fragment.ISDBFragment;

import org.w3c.dom.Text;


public class DigitalTvActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener
{

    private TextView txt_topbar;
    private RadioGroup rg_tab_bar;
    private RadioButton rb_atsc;
    private RadioButton rb_dvb;
    private RadioButton rb_isdb;
    private RadioButton rb_dtmb;

    private TextUtils rb_atsc_text;
    private TextUtils rb_dvb_text;
    private TextUtils rb_isdb_text;
    private TextUtils rb_dtmb_text;

    private View baseListView;
    private TextView digitaltvView;
//    private ViewPager vpager;

    private Button Adbtn;

    private Fragment dvbFragment;
    private Fragment isdbFragment;
    private Fragment dtmbFragment;
    private Fragment atscFragment;

    protected static final String TAG = "DigitalTvActivity";

//    private DigitalTvFragmentPagerAdapter mAdapter;

//    public static final int PAGE_ONE =0;
//    public static final int PAGE_TWO =1;
//    public static final int PAGE_THREE =2;
//    public static final int PAGE_FOUR =3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_tv);

//        find View
        initView();

//        vpager.setAdapter(mAdapter);
//        vpager.setCurrentItem(0);

//        set listener
        rg_tab_bar.setOnCheckedChangeListener(this);
        Adbtn.setOnClickListener(adOnClickListener);
//        vpager.addOnPageChangeListener(this);

//        init
//        mAdapter = new DigitalTvFragmentPagerAdapter(getSupportFragmentManager());
//        bindViews();
//        rb_atsc.setChecked(true);
    }

//    private void initClickListener()
//    {
//        rb_atsc.setOnClickListener(atscOnClickListener);
//        rb_dvb.setOnClickListener(dvbOnClickListener);
//        rb_dtmb.setOnClickListener(dtmbOnClickListener);
//        rb_isdb.setOnClickListener(isdbOnClickListener);
//
//    }

    private void initView()
    {
        txt_topbar = (TextView) findViewById(R.id.txt_topbar);
        rg_tab_bar = (RadioGroup) findViewById(R.id.rg_tab_bar);
        rb_atsc =(RadioButton) findViewById(R.id.rb_atsc);
        rb_dvb =(RadioButton) findViewById(R.id.rb_dvb);
        rb_isdb =(RadioButton) findViewById(R.id.rb_isdb);
        rb_dtmb =(RadioButton) findViewById(R.id.rb_dtmb);
        Adbtn = (Button) findViewById(R.id.AdvanceBtn);
//        rb_atsc_text = (TextUtils)rb_atsc.getResources().getString(R.string.tab_menu_atsc);
//        vpager = (ViewPager)findViewById(R.id.vpager);
    }

    private OnClickListener adOnClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(DigitalTvActivity.this,AdvanceActivity.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            Log.e("11111111","22222");
//            overridePendingTransition(R.anim.slide_in_left,
//                    R.anim.slide_in_left);
        }
    };

    private OnClickListener atscOnClickListener = new OnClickListener()
    {
        public void onClick(View v){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            hideFragments(ft);
            atscFragment =getSupportFragmentManager().findFragmentByTag("ATSCFragment");
            if(atscFragment == null)
            {
                Log.e("HEHE", "atscFragment");
                atscFragment = new ATSCFragment();
                ft.add(R.id.fl_content,atscFragment,"ATSCFragment").commit();
            }
            else
            {
                ft.show(atscFragment).commit();
            }

//            ft.replace(R.id.fl_content,atscFragment,DigitalTvActivity.TAG);
//            ft.commit();
//            ft.commitAllowingStateLoss();
        }
    };

    private OnClickListener dvbOnClickListener = new OnClickListener()
    {
        public void onClick(View v){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            hideFragments(ft);
            dvbFragment =getSupportFragmentManager().findFragmentByTag("DVBFragment");
            if(dvbFragment == null)
            {
                dvbFragment = new DVBFragment();
                ft.add(R.id.fl_content,dvbFragment,"DVBFragment").commit();
            }
            else
            {
                ft.show(dvbFragment).commit();
            }
//            DVBFragment dvbFragment = new DVBFragment();
//            ft.replace(R.id.fl_content,dvbFragment,DigitalTvActivity.TAG);
//            ft.commit();
//            ft.commitAllowingStateLoss();
        }
    };

    private OnClickListener dtmbOnClickListener = new OnClickListener()
    {
        public void onClick(View v){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            hideFragments(ft);
            dtmbFragment =getSupportFragmentManager().findFragmentByTag("DTMBFragment");
            if(dtmbFragment == null)
            {
                dtmbFragment = new DTMBFragment();
                ft.add(R.id.fl_content,dtmbFragment,"DTMBFragment").commit();
            }
            else
            {
                ft.show(dtmbFragment).commit();
            }
//            DTMBFragment dtmbFragment = new DTMBFragment();
//            ft.replace(R.id.fl_content,dtmbFragment,DigitalTvActivity.TAG);
//            ft.commit();
//            ft.commitAllowingStateLoss();
        }
    };

    private OnClickListener isdbOnClickListener = new OnClickListener()
    {
        public void onClick(View v){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            hideFragments(ft);
            isdbFragment =getSupportFragmentManager().findFragmentByTag("ISDBFragment");
            if(isdbFragment == null)
            {
                isdbFragment = new ISDBFragment();
                ft.add(R.id.fl_content,isdbFragment,"ISDBFragment").commit();
            }
            else
            {
                ft.show(isdbFragment).commit();
            }
//            ISDBFragment isdbFragment = new ISDBFragment();
//            ft.replace(R.id.fl_content,isdbFragment,DigitalTvActivity.TAG);
//            ft.commit();
//            ft.commitAllowingStateLoss();
        }
    };
    /**
     * 将所有的Fragment都置为隐藏状态。
     *
     * @param transaction 用于对Fragment执行操作的事务
     */

    @SuppressLint("NewApi")
    private void hideFragments(FragmentTransaction transaction) {
        if (atscFragment != null) {
            transaction.hide(atscFragment);
        }
        if (dvbFragment != null) {
            transaction.hide(dvbFragment);
        }
        if (dtmbFragment != null) {
            transaction.hide(dtmbFragment);
        }
        if (isdbFragment != null) {
            transaction.hide(isdbFragment);
        }

    }
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_atsc:
                rb_atsc.setChecked(true);
                rb_atsc.setOnClickListener(atscOnClickListener);
                break;
            case R.id.rb_dvb:
                rb_dvb.setChecked(true);
                rb_dvb.setOnClickListener(dvbOnClickListener);
                break;
            case R.id.rb_isdb:
                rb_isdb.setChecked(true);
                rb_isdb.setOnClickListener(isdbOnClickListener);
                break;
            case R.id.rb_dtmb:
                rb_dtmb.setChecked(true);
                rb_dtmb.setOnClickListener(dtmbOnClickListener);
                break;
        }
    }

    protected void onDestroy() {
        super.onDestroy();
    }


//    @Override
//    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//    }
//
//    @Override
//    public void onPageSelected(int position) {
//    }

//    @Override
//    public void onPageScrollStateChanged(int state) {
//        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
//        if (state == 2) {
//            switch (vpager.getCurrentItem()) {
//                case PAGE_ONE:
//                    rb_atsc.setChecked(true);
//                    break;
//                case PAGE_TWO:
//                    rb_dvb.setChecked(true);
//                    break;
//                case PAGE_THREE:
//                    rb_isdb.setChecked(true);
//                    break;
//                case PAGE_FOUR:
//                    rb_dtmb.setChecked(true);
//                    break;
//            }
//        }
//    }


}
