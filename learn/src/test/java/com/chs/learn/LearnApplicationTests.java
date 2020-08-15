package com.chs.learn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@SpringBootTest
class LearnApplicationTests {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        String sql = "insert into employees (name, age, position, hire_time) VALUES ('";
		String querySql = "select name from employees where name='LiLei'";
		String sql2 = "select trace from information_schema.OPTIMIZER_TRACE limit 1 ";
        String s = jdbcTemplate.queryForObject(querySql, String.class);
        String s1 = jdbcTemplate.queryForObject(sql2, String.class);
        System.out.println(s1);

//        for (int i = 0; i < 10000; i++) {
//            Random random = new Random();
//            int age = random.nextInt(99);
//
//            Date date = new Date();
//            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            String format = sf.format(date);
//            String sql1 = sql + getName() + "'," + age + "," + "'dev','" + format + "')";
//            System.out.println(sql1);
//            //name, age, position, hire_time
//            jdbcTemplate.update(sql1);
//        }

    }

    public String getName() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        char[] arr = s.toCharArray();
        Random random = new Random();
        String name = "";
        for (int i = 0; i < 6; i++) {
            int age = random.nextInt(25);
            name += arr[age];
        }
        return name;

    }

}
