package com.itheima.ui;

import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //ApplicationContext ac = new FileSystemXmlApplicationContext("E:\\bean.xml");
        IAccountService as1 = (IAccountService)ac.getBean("accountService");
        IAccountService as2 = (IAccountService)ac.getBean("accountService2");
        IAccountService as3 = (IAccountService)ac.getBean("accountService3");

        System.out.println(as1);
        System.out.println(as2);
        System.out.println(as3);
        as1.saveAccount();
        as2.saveAccount();
        as3.saveAccount();
    }
}
