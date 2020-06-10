package com.boss.controller;

import com.boss.entity.Users;
import com.boss.entity.UsersExample;
import com.boss.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.text.normalizer.NormalizerBase;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping(value="/all",method = RequestMethod.POST)
    public List<Users> all(UsersExample usersExample){
        List<Users> users =usersService.findAll(usersExample);
        for(Users users1:users){
            System.out.println(users.get(1));
        }
        return users;
    }
    @RequestMapping("/all1")
    public ModelAndView find(){
         ModelAndView modelAndView=new ModelAndView();
         modelAndView.setViewName("new");
         modelAndView.addObject("nums",100);
         return modelAndView;

    }
    @RequestMapping("/hello")
    public String all1(){
       return "hello";
    }
}
