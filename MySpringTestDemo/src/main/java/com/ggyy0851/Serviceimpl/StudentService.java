package com.ggyy0851.Serviceimpl;

import com.ggyy0851.mapper.StudentMapper;
import com.ggyy0851.pojo.SimpleStudent;
import com.ggyy0851.service.SimpleStudentService;
import org.apache.log4j.Logger;


/**
 * @author GeYao
 * @create 2020-05-30 - 12:25
 */
public class StudentService implements SimpleStudentService {
    public StudentMapper getStudentMapper() {
        return StudentMapper;
    }

    public void setStudentMapper(StudentMapper studentMapper) {
        StudentMapper = studentMapper;
    }

    private StudentMapper StudentMapper;
    public SimpleStudent getStudent(String name) {
        Logger logger = Logger.getLogger(StudentService.class);
        logger.info("进去了");
        return StudentMapper.selbyname(name);
    }

    public int insert(SimpleStudent student) {
        return 0;
    }
}
