package cn.xh.ad.test;

import java.lang.reflect.Field;

/**
 * @Author:hao.xu
 * @Email:hao.xu@rograndec.com
 * @Date: 2019/5/16
 * @Version:1.0
 */
public class Abc {
    private Integer a;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 2;
        System.out.println("before:a=" + a +",b=" +b);
        swap(a,b);
        System.out.println("after:a=" + a +",b=" +b);
    }

    private static void swap(Integer a, Integer b) {
        Field field = null;
        try {
            field = Integer.class.getDeclaredField("value");
            field.setAccessible(true);
            int temp = a.intValue();
            field.set(a,b.intValue());
            field.set(b,temp);
            System.out.println(b.intValue());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
