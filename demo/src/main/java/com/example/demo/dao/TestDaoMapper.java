package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.TestUserEntity;

@Mapper
public interface TestDaoMapper {
    public List<TestUserEntity> queryUsers();
    public String queryBigNum(String today);
}