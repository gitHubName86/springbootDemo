package com.fzp.service.impl;

import com.fzp.bean.SyUserBean;
import com.fzp.mapper.SyUserMapper;
import com.fzp.service.SyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SyUserServiceImpl implements SyUserService {
    // 将Dao注入Service层
    @Autowired
    private SyUserMapper syUserMapper;

    @Override
    public SyUserBean loginIn(String name, String password) {
        SyUserBean syUserBean = syUserMapper.getInfo(name, password);
        return syUserBean;
    }
}
