package com.example.demo.service.impl;

import com.example.demo.entity.TestUserEntity;
import com.example.demo.service.TestService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    //TestDaoMapper testDaoMapper;

    @Override
    public List<TestUserEntity> queryUsers() {
        List<TestUserEntity> list =null; //testDaoMapper.queryUsers();
        return list;
    }

}
