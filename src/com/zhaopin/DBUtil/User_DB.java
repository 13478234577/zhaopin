package com.zhaopin.DBUtil;

import com.zhaopin.java.User;

import java.util.List;

/**
 * Created by ttc on 17-11-20.
 */
public interface User_DB
{
    User select_userinfo(User user);
    List selectQuestion();
    List select_jobinfo();
    boolean select_user(User user);
    boolean insert(User user);

    boolean update_userinfo(User user);
    boolean insert_user(User user);
    void delete(int id);
}
