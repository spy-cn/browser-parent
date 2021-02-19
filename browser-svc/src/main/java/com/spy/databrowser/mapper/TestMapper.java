package com.spy.databrowser.mapper;

import com.spy.databrowser.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
@Mapper
public interface TestMapper {
    List<Teacher> getAll();
}
