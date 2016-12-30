package com.taotao.web.threadlocal;

import com.taotao.web.bean.User;

public class UserThreadLocal {

    private static final ThreadLocal<User> LOCAL = new ThreadLocal<User>();
    
    public static void set(User use){
        LOCAL.set(use);
    }
    
    public static User get(){
        return LOCAL.get();
    }
}