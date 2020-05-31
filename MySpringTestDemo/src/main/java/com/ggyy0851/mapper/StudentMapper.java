package com.ggyy0851.mapper;

import com.ggyy0851.pojo.SimpleStudent;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author GeYao
 * @create 2020-05-26 - 16:36
 */
public interface StudentMapper {
    public SimpleStudent selbyname(String name);
}
