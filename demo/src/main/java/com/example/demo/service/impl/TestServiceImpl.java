package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TestDaoMapper;
import com.example.demo.entity.TestUserEntity;
import com.example.demo.service.TestService;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestDaoMapper testDaoMapper;

    @Override
    public List<TestUserEntity> queryUsers() {
        List<TestUserEntity> list = testDaoMapper.queryUsers();
        return list;
    }

}
