package com.example.myblog.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @description: TODO
 * @author: lgd
 * @create: 2020-01-17 15:25
 */
public class objtools {
    /**
     * 获取属性名数组
     */
    private static String[] getFiledName(Object o) {
        //获取对象的属性数组
        Field[] fields = o.getClass().getDeclaredFields();
        //获取属性名称
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            //获取属性的类型
//            System.out.println(fields[i].getType());
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    /* 根据属性名获取属性值
     *
     */
    private static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(o, new Object[]{});
            return value;
        } catch (Exception e) {

            return null;
        }
    }


    /**
     * 判断对象属性是否为空
     * @param obj 对象
     * @param param 需要判断的字段
     * @return
     */
    public static boolean objIsNull(Object obj,String[] param) {

        String[] fieldNames = getFiledName(obj);
        //速度较慢
//        String[] list=  arrayTools.intersect(fieldNames,param);
//        for (int i=0;i<list.length;i++){
//            String name = list[i];
//            //根据字段获取值
//            Object value = getFieldValueByName(name, obj);
//            if(value==null||value.equals("")){
//                return true;
//            }
//        }

        for (int j = 0; j < fieldNames.length; j++) {     //遍历所有属性
            String name = fieldNames[j];    //获取属性的名字
            //判断需要判断的对象某些属性（字段名称）
            for (int i=0;i<param.length;i++){
                String comName=param[i];
                if(comName.equals(name)){
                    //根据字段获取值
                    Object value = getFieldValueByName(name, obj);
                    if(value==null||value.equals("")){
                       return true;
                    }
                }

            }
        }
        return false;

    }

}
