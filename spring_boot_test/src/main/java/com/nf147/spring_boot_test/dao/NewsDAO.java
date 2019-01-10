package com.nf147.spring_boot_test.dao;

import com.nf147.spring_boot_test.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsDAO extends JpaRepository<News, Long> {

}
