package com.atguigu.gmall.user;

import com.atguigu.gmall.beans.UmsMember;
import com.atguigu.gmall.user.mapper.UmsMemberMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallUserApplicationTests {
    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Test
    public void contextLoads() {
        UmsMember umsMember = new UmsMember();
        umsMember.setId(Long.valueOf(11));
        umsMember.setNickname("嘿嘿");
        umsMember.setUsername("哟哟");
        umsMember.setCreateTime(new Date());
       // umsMemberMapper.insert(umsMember);
        umsMemberMapper.updateById(umsMember);
    }

}
