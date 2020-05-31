package com.ggyy0851.servlet;

import com.ggyy0851.pojo.Student;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author GeYao
 * @create 2020-05-30 - 16:52
 */
@WebServlet("/demo")
public class MySetvlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        WebApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        Student a = ac.getBean("normal_student", Student.class);
        Student b = ac.getBean("normal_student", Student.class);
        System.out.println(a==b);
    }
}
