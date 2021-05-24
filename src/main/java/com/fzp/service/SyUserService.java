package com.fzp.service;

import com.fzp.bean.SyUserBean;


public interface SyUserService {
    SyUserBean loginIn(String name, String password);
}
