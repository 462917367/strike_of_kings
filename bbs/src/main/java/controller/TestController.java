package controller;

import domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.TestService;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Controller
public class TestController{
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/get")
    @ResponseBody
    public Test getTestById(@RequestParam("user_id") Integer user_id) {
        System.out.println(user_id);
        System.out.println(testService.getById(user_id).getUser_name());
        return testService.getById(user_id);
    }
}
