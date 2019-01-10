package com.nf147.spring_boot_test.controller;

import com.nf147.spring_boot_test.entity.News;
import com.nf147.spring_boot_test.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsConntroller {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/newslist")
    public List<News> listadd() {
        return newsService.listAllNews();
    }

    @GetMapping("/newsget")
    public String add(News news) {
        newsService.addNews(news);
        return "success";
    }
}
