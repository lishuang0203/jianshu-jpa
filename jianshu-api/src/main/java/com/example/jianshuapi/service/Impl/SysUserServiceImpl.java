package com.example.jianshuapi.service.Impl;

import com.example.jianshuapi.dao.SysUserRepository;
import com.example.jianshuapi.entity.LoginUser;
import com.example.jianshuapi.entity.SysUser;
import com.example.jianshuapi.service.SysUserService;
import com.example.jianshuapi.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserRepository sysUserRepository;

    @Override
    public ResponseUtil userLogin(LoginUser loginUser) {
        SysUser sysUser = sysUserRepository.findSysUserByEmail(loginUser.getEmail());
        //邮箱有效
        if (sysUser != null) {
            //判断密码是否正确
            if (loginUser.getPassword().equals(sysUser.getPassword())) {
                return new ResponseUtil(0, "login success", sysUser);
            } else {
                return new ResponseUtil(0, "password wrong");
            }
        } else {
            return new ResponseUtil(0, "email wrong");
        }
    }

    @Override
    public List<SysUser> getHotUsers() {
        return null;
    }
}
