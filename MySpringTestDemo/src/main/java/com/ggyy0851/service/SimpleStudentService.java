package com.ggyy0851.service;

import com.ggyy0851.pojo.SimpleStudent;

/**
 * @author GeYao
 * @create 2020-05-30 - 12:24
 */
public interface SimpleStudentService {
    public SimpleStudent getStudent(String name);
    public int insert(SimpleStudent student);
}
