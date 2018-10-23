package com.example.jianshuapi.dao;

import com.example.jianshuapi.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserRepositoryTest {

    @Resource
    private SysUserRepository sysUserRepository;
//    @Test
//    public void initData(){
//        SysUser sysUser = new SysUser("bbb.com","bbb","北城","2.png","这是作者2",321421,432);
//        sysUserRepository.save(sysUser);
//    }
    @Test
    public void findSysUserByEmail() {
        SysUser sysUser = sysUserRepository.findSysUserByEmail("aaa.com");
        System.out.println(sysUser);
    }

    @Test
    public void findHotUsers() {
    }
}