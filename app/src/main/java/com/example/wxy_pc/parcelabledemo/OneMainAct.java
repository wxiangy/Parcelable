package com.example.wxy_pc.parcelabledemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OneMainAct extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_main);
    }

    private void addData(ArrayList<InfoBean> infoBeans) {
        for (int i = 0; i < 5; i++) {
            String text1 = "你好" + i;
            String text2 = "你好" + (i + 1);
            String text3 = "你好" + (i + 2);
            String text4 = "你好" + (i + 3);
            InfoBean infoBean = new InfoBean(text1, text2, text3, text4);
            infoBeans.add(infoBean);
        }
    }

    public void skipOtherAct(View view) {
//        setStringList();
//        setBean();
//        setListBean();
        setMapList();
    }

    private void setBean() {
        InfoBean infoBean = new InfoBean("nihao", "aa", "ff", "dd");
        Intent intent = new Intent(this, OtherAct.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("infoBean", infoBean);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void setListBean() {
        ArrayList<InfoBean> infoBeans = new ArrayList<InfoBean>();
        addData(infoBeans);
        Intent intent = new Intent(this, OtherAct.class);
        intent.putParcelableArrayListExtra("infoBeans", infoBeans);
        startActivity(intent);
    }

    private void setStringList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("nihao");
        list.add("jjj");
        list.add("dddd");
        list.add("aaaa");
        Intent intent = new Intent(this, OtherAct.class);
        intent.putStringArrayListExtra("strings", list);
        startActivity(intent);
    }

    private void setMapList() {
        List<Map<String, String>> maps = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<>();
        map.put("aaa", "aaa");
        map.put("bbb", "bbb");
        map.put("ccc", "ccc");
        map.put("ddd", "ddd");
        maps.add(map);
        MapInfoBean mapInfoBean = new MapInfoBean();
        mapInfoBean.setMapList(maps);
        Intent intent = new Intent(this, OtherAct.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("map", mapInfoBean);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
