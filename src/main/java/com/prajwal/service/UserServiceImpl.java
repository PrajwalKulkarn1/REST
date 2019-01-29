package com.prajwal.service;

import com.prajwal.bean.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserServiceImpl implements UserService {
    List<User> users=getUsers();
    public User findById(int id){
        User res=new User(1,"p","j");
        Iterator<User> itr=users.iterator();
        while(itr.hasNext()){
            User temp=itr.next();
            if(temp.getId()==id){
                res=temp;
            }
        }
        return res;
    }

    List<User> getUsers(){
        users=new ArrayList<User>();
        users.add(new User(123,"Prajwal Kulkarni","India"));
        return users;
    }
}
