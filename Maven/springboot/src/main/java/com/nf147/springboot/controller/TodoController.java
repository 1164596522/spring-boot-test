package com.nf147.springboot.controller;

import com.nf147.springboot.entity.Todo;
import com.nf147.springboot.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/all")
    public List<Todo> listAllTodo(){
        return todoService.listAllTodo();
    }

    @GetMapping("/add")
    public void addTodo(){
        Todo todo = new Todo();
        todo.setId(47);
        todo.setName("我是谁");
        todo.setDetail("不知道");
        todoService.addTodo(todo);
    }
    @GetMapping("/del")
    public void delTodo(){
        Todo todo = new Todo();
        todo.setId(3);
        todo.setName("我是谁");
        todo.setDetail("不知道");
        todo.setCreatedAt(new Date());
        todo.setFinishedAt(new Date());
        todo.setState("已完成");
        todo.setMemo("试试");
        todoService.delTodo(todo);
    }
    @GetMapping("/upTodo")
    public void upTodo(){
        Todo todo = new Todo();
        todo.setId(3);
        todo.setName("我是谁");
        todo.setDetail("不知道");
        todo.setCreatedAt(new Date());
        todo.setFinishedAt(new Date());
        todo.setState("已完成");
        todo.setMemo("试试");
        todoService.upTodo(todo);
    }
}
