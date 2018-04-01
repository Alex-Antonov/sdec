package my.antonov.controller;


import my.antonov.jdbc.model.User;
import my.antonov.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping("add")
    public String addNewUser(@ModelAttribute User user) {
        if (user.getName() != null && !user.getName().isEmpty()) {
            userService.addNewUser(user.getName());
        }
        return "redirect:index";
    }

    @RequestMapping("search")
    public ModelAndView searchUser(@ModelAttribute User user) {
        List<User> users = new ArrayList<User>();
        if (user.getName() != null && !user.getName().isEmpty()) {
            users = userService.searchUser(user.getName());
        } else {
            return getAllUsers(user);
        }
        return new ModelAndView("index", "users", users);
    }

    @RequestMapping("index")
    public ModelAndView getAllUsers(@ModelAttribute User user) {
        List<User> users = userService.getAllUsers();
        return new ModelAndView("index", "users", users);
    }

    @RequestMapping("newUser")
    public ModelAndView registerUser(@ModelAttribute User user) {
        String message="Name:";
        return new ModelAndView("addForm", "message", message);
    }

}
