package com.nf147.springboot.controller;

import com.nf147.springboot.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

//    @GetMapping("/")
//    public List<Todo> listTodo(){
//        return todoService.listAllTodo();
//    }
}
