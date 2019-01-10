package com.nf147.springboot.service;

import com.nf147.springboot.entity.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> listAllTodo();

    void addTodo(Todo todo);

    void delTodo(Todo todo);

    void upTodo(Todo todo);

}
