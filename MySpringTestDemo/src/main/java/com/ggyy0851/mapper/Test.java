package com.ggyy0851.mapper;

import com.ggyy0851.Serviceimpl.StudentService;
import com.ggyy0851.pojo.SimpleStudent;
import com.ggyy0851.service.SimpleStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GeYao
 * @create 2020-05-30 - 13:12
 */
public class Test {
    //测试数据库连通性
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        SimpleStudentService ss = ac.getBean("studentservice", StudentService.class);
        SimpleStudent stu = ss.getStudent("gy");
        System.out.println(stu.getId());
    }
}
