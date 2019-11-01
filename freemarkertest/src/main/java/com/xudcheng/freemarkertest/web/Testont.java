package com.xudcheng.freemarkertest.web;

import com.xudcheng.freemarkertest.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/22
 */
@Controller
public class Testont {

    @RequestMapping("/testone")
    public String getmap(Map<String, Object> map) {

        map.put("name", "zhangsan");

        Student student = new Student();
        student.setName("校长");
        student.setAge(19);
        student.setMoney(456f);
        student.setBirthday(new Date());

        Student student1 = new Student();
        student1.setName("老是");
        student1.setAge(21);
        student1.setMoney(4564f);

        Map<String, Object> hashMap = new HashMap<>();

        hashMap.put("stu", student);
        hashMap.put("stuu", student1);

        map.put("stumap", hashMap);
        map.put("str", student);

        return "one";

    }

}
