package com.tao;

import java.lang.reflect.Field;

public class JSONDemo1 {
    @Demo1.JsonField("tao")
    private String name = "tao";

    public static void main(String[] args) {
        JSONDemo1 jsonDemo1 = new JSONDemo1();

        System.out.println(jsonDemo1.name.getClass().getFields()[0]);
        System.out.println("TestPush,Gitee");
    }

    public static String getSerializedKey(Field field){
        String value = field.getAnnotation(Demo1.JsonField.class).value();
        if(value.isEmpty()){
            return field.getName();
        }else{
            return value;
        }
    }
}
