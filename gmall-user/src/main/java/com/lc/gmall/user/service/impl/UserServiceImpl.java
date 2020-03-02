package com.lc.gmall.user.service.impl;

import com.lc.gmall.user.mapper.UserMapper;
import com.lc.gmall.user.poJo.UmsMember;
import com.lc.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LC on 2020/3/2 16:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return this.userMapper.selectAll();
    }

    @Override
    public UmsMember getUserById(String userId) {

        UmsMember um = new UmsMember();
        um.setId(userId);
        UmsMember umsMember = this.userMapper.selectByPrimaryKey(um);
        return umsMember;
    }
}
