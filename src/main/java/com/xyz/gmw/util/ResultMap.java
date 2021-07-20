package com.xyz.gmw.util;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResultMap<T> implements Serializable {
    public static final long serialVersionUID = 72351938912389L;

    public static final String success = "0";

    public static final String fail = "1";

    private String state;

    private String Message;

    private int total;

    private T data;

    public static <T> ResultMap success(){
        ResultMap map = new ResultMap();
        map.setState(success);
        return map;
    }

    public static <T> ResultMap fail(){
        ResultMap map = new ResultMap();
        map.setState(fail);
        return map;
    }

    public static <T> ResultMap data( T data ){
        ResultMap map = new ResultMap();
        map.setState( success );
        map.setData( data );
        return map;
    }

    public static <T> ResultMap ofData( T data, int total ){
        ResultMap map = new ResultMap();
        map.setState( success );
        map.setData( data );
        map.setTotal(total);
        return map;
    }

    public static <T> ResultMap ofFail(String message){
        ResultMap map = new ResultMap();
        map.setState(fail);
        map.setData(message);
        return map;
    }

    public static <T> ResultMap ofSuccess(String message){
        ResultMap map = new ResultMap();
        map.setState(success);
        map.setData(message);
        return map;
    }

    public static String jsonStr(ResultMap map){
        return JSON.toJSONStringWithDateFormat(map, "YYYY-MM-DD HH:mm:ss");
    }
}
