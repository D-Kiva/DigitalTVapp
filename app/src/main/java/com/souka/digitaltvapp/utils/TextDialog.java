package com.souka.digitaltvapp.utils;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.souka.digitaltvapp.R;

import org.w3c.dom.Comment;
import org.w3c.dom.Text;

/**
 * Created by kiva on 2017/1/20.
 */

public class TextDialog extends Dialog {
    private static int default_width = 300;
    private static int default_height = 200;

    private TextView title;
    private EditText message;
    private Button defaultBtn;
    private View.OnClickListener onDefaultClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cancel();
        }
    };

    private CharSequence mtitle;
    private CharSequence mMessage;
    private CharSequence defaultText;

//    private Context mContext;

    private int titleId;
    private int mMessageId;
    private int defaultTextId;

//    public TextDialog(Context context, int layout, int style)
//    {
//        this(context,default_width,default_height,layout,style);
//    }
//
//    public TextDialog(Context context,int width,int height,int layout,int style)
//    {
//        super(context,style);
//
//        setContentView(layout);
//
//        Window window = getWindow();
//        WindowManager.LayoutParams params = window.getAttributes();
//
//        //set width,height by density and gravity
//        float density = getDensity(context);
//        params.width = (int) (width*density);
//        params.height = (int) (height*density);
//        params.gravity = Gravity.CENTER;
//
//        window.setAttributes(params);
//    }
//
//    private float getDensity(Context context) {
//        Resources resources = context.getResources();
//        DisplayMetrics dm = resources.getDisplayMetrics();
//        return dm.density;
//    }

    private TextDialog(Context context) {
        super(context, R.style.Theme_dialog);
    }

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
//        mContext=TextDialog.getContext();
        setContentView(R.layout.dialog_text_layout);
        initView();
    }

    private void initView() {
        title = (TextView) findViewById(R.id.title_dialog);
        message = (EditText) findViewById(R.id.edit_dialog);
        defaultBtn = (Button) findViewById(R.id.button_dialog);
    }

    public void show()
    {
        super.show();
        show(this);
    }

    private void show(TextDialog dialog)
    {
        if (!TextUtils.isEmpty(dialog.mtitle))
        {
            dialog.title.setText(dialog.mtitle);
        }
        if (!TextUtils.isEmpty(dialog.mMessage))
        {
            dialog.message.setText(dialog.mMessage);
        }
        if (!TextUtils.isEmpty(dialog.defaultText))
        {
            dialog.defaultBtn.setText(dialog.defaultText);
        }
    }

    public static class Builder{
        private TextDialog dialog;
        public Builder(Context context)
        {
            dialog = new TextDialog(context);
        }

        public Builder setTitile(CharSequence title)
        {
            dialog.mtitle = title;
            return this;
        }

        public Builder setMessage(CharSequence message) {
            dialog.mMessage = message;
            return this;
        }

        public Builder setDefaultBtn(CharSequence defaultBtn,View.OnClickListener onClickListener) {
            dialog.defaultText = defaultBtn;
            dialog.onDefaultClickListener = onClickListener;
            return this;
        }
        public Builder show() {
            dialog.show();
            return this;
        }

//        public Builder setTitile(int titleId) {
//            dialog.mtitle=dialog.mContext.getText(titleId);
//            return this;
//        }
    }
}
