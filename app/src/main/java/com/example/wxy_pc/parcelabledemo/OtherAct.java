package com.example.wxy_pc.parcelabledemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class OtherAct extends Activity {

    private ArrayList<InfoBean> infoBeans = new ArrayList<InfoBean>();
    private TextView textView1, textView2, textView3, textView4, textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        textView1 = (TextView) findViewById(R.id.reciveTv1);
        textView2 = (TextView) findViewById(R.id.reciveTv2);
        textView3 = (TextView) findViewById(R.id.reciveTv3);
        textView4 = (TextView) findViewById(R.id.reciveTv4);
        textView5 = (TextView) findViewById(R.id.reciveTv5);

//        getStringList();
//        getBean();
//        getListBean();
        getMapList();
    }


    private void getBean() {
        InfoBean infoBean = getIntent().getExtras().getParcelable("infoBean");
        textView1.setText(infoBean.getText().toString());
        textView2.setText(infoBean.getText1().toString());
        textView3.setText(infoBean.getText2().toString());
        textView4.setText(infoBean.getText3().toString());
    }

    private void getListBean() {
        infoBeans = getIntent().getParcelableArrayListExtra("infoBeans");
        if (infoBeans.size() > 0) {
            textView1.setText(infoBeans.get(0).getText().toString());
            textView2.setText(infoBeans.get(0).getText1().toString());
            textView3.setText(infoBeans.get(0).getText2().toString());
            textView4.setText(infoBeans.get(0).getText3().toString());
            textView5.setText(infoBeans.get(4).getText3().toString());
        }
    }

    private void getStringList(){
        ArrayList<String> list = getIntent().getStringArrayListExtra("strings");
        textView1.setText(list.get(0));
        textView2.setText(list.get(1));
        textView3.setText(list.get(2));
        textView4.setText(list.get(3));
    }

    private void getMapList(){
       MapInfoBean mapInfoBean = (MapInfoBean) getIntent().getExtras().getSerializable("map");
        textView1.setText(mapInfoBean.getMapList().get(0).get("aaa"));
        textView2.setText(mapInfoBean.getMapList().get(0).get("bbb"));
        textView3.setText(mapInfoBean.getMapList().get(0).get("ccc"));
        textView4.setText(mapInfoBean.getMapList().get(0).get("ddd"));
    }
}
