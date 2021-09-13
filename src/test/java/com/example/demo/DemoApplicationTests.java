package com.example.demo;

import com.example.model.services.hyj.AssayMealService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    AssayMealService assayMealService;
    @Test
    void contextLoads() {
        Integer a = 1;
        Integer b = 1;
        Integer c = 500;
        Integer d = 500;
        System.out.println(a==b);
        System.out.println(c==d);
    }
    //根据身份证计算年龄
    @Test
    public void testAge(){
        String idCard="430522200207176630";
        String birthday = idCard.substring(6, 14);
        Calendar now = Calendar.getInstance();
        int nowYear = now.get(Calendar.YEAR);
        int nowMonth = (now.get(Calendar.MONTH)+1);
        int nowDay = now.get(Calendar.DAY_OF_MONTH);

        int year = Integer.valueOf(birthday.substring(0, 4));
        int month = Integer.valueOf(birthday.substring(4, 6));
        int day = Integer.valueOf(birthday.substring(6));

        if (nowMonth - month >= 0 && nowDay - day >=0) {
            int age = nowYear - year;
            System.out.println(age);
        }else {
            int age = nowYear - year - 1;
            System.out.println(age);
        }
    }
}
