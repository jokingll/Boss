package com.boss.service.Impl;

import com.boss.entity.Users;
import com.boss.entity.UsersExample;
import com.boss.mapping.UsersMapper;
import com.boss.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> findAll(UsersExample usersExample) {
        return usersMapper.selectByExample(usersExample);
    }
}
