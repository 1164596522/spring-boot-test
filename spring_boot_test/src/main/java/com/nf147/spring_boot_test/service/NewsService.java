package com.nf147.spring_boot_test.service;

import com.nf147.spring_boot_test.entity.News;

import java.util.List;

public interface NewsService {

    List<News> listAllNews();

    void addNews(News news);

    void delNews(News news);
}
