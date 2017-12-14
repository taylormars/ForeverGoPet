package com.pets.service;

import com.pets.interfence.IMyInterfence;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by liyut on 2017-12-13.
 */
@Service("helloService")
public class MyInterfenceImpl implements IMyInterfence{
    @Resource
    private JdbcTemplate jdbcTemplate;
    public String helloWolrd() {
        return "hello world";
    }

    public  String login(int id){
        try{
        String sql="select username,password from user_main where username = 'lyt'";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        if (list != null && list.size() > 0) {
            for (Map<String, Object> loan : list) {
                String a = loan.get("username").toString();
                String b = loan.get("password").toString();
                if(a.equals("lyt")&& b.equals("123"))
                {
                    return "登陆成功"+id;
                }
            }
        }}
        catch (Exception e) {
            e.printStackTrace();

        }
        return "登陆失败"+id;
    }
}
