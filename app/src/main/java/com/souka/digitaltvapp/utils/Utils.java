package com.souka.digitaltvapp.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.StringRes;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.souka.digitaltvapp.R;

import java.lang.reflect.Array;

/**
 * Created by kiva on 2017/1/18.
 */

public class Utils {
    public static void cancelBtn(final Activity activity, Button btn)
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.finish();
                activity.overridePendingTransition(0, R.anim.activity_down);
            }
        });
    }

    public static void textOnDialog(@StringRes int titleId,Context context)
    {
        final AlertDialog build = new AlertDialog.Builder(context).create();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dialog_text_layout, null, false);

        build.setView(view,0,0,0,0);

        build.show();

        TextView title =(TextView)view.findViewById(R.id.title_dialog);
        title.setText(titleId);
        EditText message = (EditText)view.findViewById(R.id.edit_dialog);
        RelativeLayout rtbtn =(RelativeLayout)view.findViewById(R.id.relativeLayout3);
//        rtbtn.setBackgroundColor(Color.TRANSPARENT);
        Button deflautBtn = (Button)view.findViewById(R.id.button_dialog);
        deflautBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("2222","5555");
            }
        });
    }

    public static void textOnDialog(CharSequence titleId,Context context)
    {
        final AlertDialog build = new AlertDialog.Builder(context).create();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dialog_text_layout, null, false);

        build.setView(view,0,0,0,0);

        build.show();

        TextView title =(TextView)view.findViewById(R.id.title_dialog);
        title.setText(titleId);
        EditText message = (EditText)view.findViewById(R.id.edit_dialog);
        RelativeLayout rtbtn =(RelativeLayout)view.findViewById(R.id.relativeLayout3);
//        rtbtn.setBackgroundColor(Color.TRANSPARENT);
        Button deflautBtn = (Button)view.findViewById(R.id.button_dialog);
        deflautBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("2222","5555");
            }
        });
    }

//    public static void radioBox(@StringRes int titleId, Context context, String[] str)
//    {
//        final AlertDialog build = new AlertDialog.Builder(context).create();
//        LayoutInflater inflater = LayoutInflater.from(context);
//        View view = inflater.inflate(R.layout.dialog_radio_layout, null, false);
//        View item = inflater.inflate(R.layout.box_radio_item,null,false);
//        build.setView(view,0,0,0,0);
//        build.show();
//
//        TextView title=(TextView)view.findViewById(R.id.title_dialog);
//        title.setText(titleId);
//        Button btn = (Button)view.findViewById(R.id.button_dialog);
//        ListView listView =(ListView)view.findViewById(R.id.listView_dialog);
//
//        TextView tvName =(TextView)item.findViewById(R.id.tv_device_name);
//        RadioButton rdBtn = (RadioButton)item.findViewById(R.id.radiobox);
//
//        listView.setAdapter(new ArrayAdapter<String>(this,item, str));
//        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
//
//
//    }

}

