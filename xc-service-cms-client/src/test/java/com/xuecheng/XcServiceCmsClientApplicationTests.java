package com.xuecheng;

import org.junit.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.ReentrantLock;

@SpringBootTest
class XcServiceCmsClientApplicationTests {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        System.out.println(now);

        String format = DateTimeFormatter.ISO_LOCAL_DATE.format(now);

        System.out.println(format);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println(dateTimeFormatter.format(now));

        ReentrantLock lock = new ReentrantLock();

        lock.lock();

        lock.unlock();


    }

    @Test
    void contextLoads() {


    }

}
