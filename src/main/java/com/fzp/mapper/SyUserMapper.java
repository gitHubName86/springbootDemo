package com.fzp.mapper;

import com.fzp.bean.SyUserBean;

public interface SyUserMapper {
    SyUserBean getInfo(String name, String password);
}
