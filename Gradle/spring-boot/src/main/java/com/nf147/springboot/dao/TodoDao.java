package com.nf147.springboot.dao;

import com.nf147.springboot.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoDao extends JpaRepository<Todo,Long> {
}
