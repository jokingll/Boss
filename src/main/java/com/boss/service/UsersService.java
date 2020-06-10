package com.boss.service;

import com.boss.entity.Users;
import com.boss.entity.UsersExample;

import java.util.List;

public interface UsersService {
    public List<Users> findAll(UsersExample usersExample);
}
