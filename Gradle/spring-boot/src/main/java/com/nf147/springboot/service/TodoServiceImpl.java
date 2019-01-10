package com.nf147.springboot.service;

import com.nf147.springboot.dao.TodoDao;
import com.nf147.springboot.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoDao todoDao;

    @Override
    public List<Todo> listAllTodo() {
        return todoDao.findAll();
    }

    @Override
    public void addTodo(Todo todo) {
        todoDao.save(todo);
    }

    @Override
    public void delTodo(Todo todo) {
        todoDao.delete(todo);
    }

    @Override
    public void upTodo(Todo todo) {
        todoDao.save(todo);
    }
}
