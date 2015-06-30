package com.example.wxy_pc.parcelabledemo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by wxy-pc on 2015/6/3.
 */
public class MapInfoBean implements Serializable{

    private List<Map<String,String>> mapList;

    public List<Map<String, String>> getMapList() {
        return mapList;
    }

    public void setMapList(List<Map<String, String>> mapList) {
        this.mapList = mapList;
    }

}
