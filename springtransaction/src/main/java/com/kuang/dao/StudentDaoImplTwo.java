package com.kuang.dao;

import com.kuang.pojo.Student;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class StudentDaoImplTwo extends SqlSessionDaoSupport implements StudentDao {
    @Override
    public List<Student> selectStudent() {
        return getSqlSession().getMapper(StudentDao.class).selectStudent();
    }
}
