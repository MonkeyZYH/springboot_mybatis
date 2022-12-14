package com.zyh.service.Impl;

import com.zyh.entity.User;
import com.zyh.mapper.UserMapper;
import com.zyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {

        List<User> all = userMapper.findAll();
        return all;
    }
}
