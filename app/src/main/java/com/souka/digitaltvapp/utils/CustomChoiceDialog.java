//package com.souka.digitaltvapp.utils;
//
//import android.app.Dialog;
//import android.content.Context;
//import android.util.DisplayMetrics;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.widget.TextView;
//
//import com.souka.digitaltvapp.R;
///**
// * Created by kiva on 2017/1/21.
// */
//
//public class CustomChoiceDialog extends Dialog {
//    private Context context;
//    public CustomChoiceDialog(Context context) {
//        super(context);
//    }
//    public CustomChoiceDialog create() {
//        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        final CustomChoiceDialog dialog = new CustomChoiceDialog(context, R.style.Dialog);
//        dialog.setCanceledOnTouchOutside(false);
//        dialog.setCancelable(false);
//
//        View layout = inflater.inflate(R.layout.custom_choice_dialog_layout, null);
//
//        DisplayMetrics dm = context.getApplicationContext().getResources().getDisplayMetrics();
//        layout.setMinimumWidth(dm.widthPixels - 80);
//
//        dialog.addContentView(layout, new LayoutParams(
//                LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
//
//        ((ImageView) layout.findViewById(R.id.custom_choice_dialog_icon)).setBackgroundResource(icon);
//
//        ((TextView) layout.findViewById(R.id.custom_choice_dialog_title)).setText(title);
//
//        if (negativeButtonText != null) {
//            ((Button) layout.findViewById(R.id.custom_choice_dialog_negativeButton))
//                    .setText(negativeButtonText);
//            if (negativeButtonClickListener != null) {
//                ((Button) layout.findViewById(R.id.custom_choice_dialog_negativeButton))
//                        .setOnClickListener(new View.OnClickListener() {
//                            public void onClick(View v) {
//                                negativeButtonClickListener.onClick(
//                                        dialog,
//                                        DialogInterface.BUTTON_NEGATIVE);
//                            }
//                        });
//            }
//        } else {
//            layout.findViewById(R.id.custom_choice_dialog_negativeButton).setVisibility(
//                    View.GONE);
//        }
//
//        if(mItems != null){
//            mListView = (ListView)layout.findViewById(R.id.listView_choice);
//            mListView.setAdapter(adapter);
//            mListView.setOnItemClickListener(new OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view,
//                                        int position, long id) {
//                    currIndex = position;
//                    adapter.setSelectItem(position);
//                    onItemClickListener.onItemClick(parent, view, position, id);
//                    dialog.dismiss();
//                }
//
//            });
//        }
//        dialog.setContentView(layout);
//        return dialog;
//    }
//
//}



