package org.launchcode.spaday.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
/*
1.create handler method displayAddUserForm() to render
correspond to path /user/add
return path to add.html template
    */
    public String displayAddUserForm() {

    }

    //a4. dd handler method from 14.6.4
    //uses model binding to create a new user object, user, and pass it into handler method

    //5. check that verify parameter matches password within the user object
    //if so, render user/index.html with a message that welcomes by user
    //if passwords dont match, ender again


}
