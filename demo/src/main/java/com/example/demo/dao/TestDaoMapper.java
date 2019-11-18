package com.example.demo.dao;

import com.example.demo.entity.TestUserEntity;
import java.util.List;

//@Mapper
public interface TestDaoMapper {
    public List<TestUserEntity> queryUsers();
    public String queryBigNum(String today);
}
