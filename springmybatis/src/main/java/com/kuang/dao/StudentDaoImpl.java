package com.kuang.dao;

import com.kuang.pojo.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    // 原来--所有的操作都使用SqlSession来执行
    // 现在--使用SqlSessionTemlate
    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Student> selectStudent() {
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        return mapper.selectStudent();
    }
}
