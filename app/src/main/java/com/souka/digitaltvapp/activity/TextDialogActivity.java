package com.souka.digitaltvapp.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.souka.digitaltvapp.R;

public class TextDialogActivity extends AppCompatActivity {

    private Context mContext;
    private Button okBtn;
    private TextView titleView;
    private EditText messageText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_text_layout);
        mContext = TextDialogActivity.this;

    }

    private void initView()
    {
        titleView = (TextView)findViewById(R.id.title_dialog);
        messageText = (EditText)findViewById(R.id.edit_dialog);
        okBtn =(Button)findViewById(R.id.button_dialog);
    }

}
