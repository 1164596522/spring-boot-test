package com.nf147.spring_boot_test.service;

import com.nf147.spring_boot_test.dao.NewsDAO;
import com.nf147.spring_boot_test.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDAO newsDAO;

    @Override
    @Cacheable("listAllNews") // 可以加载类或方法上，若加载类上当前类的所有方法的返回值都会被缓存；加在方法上就只会缓存当前方法返回值
    public List<News> listAllNews() {
        return newsDAO.findAll();
    }

    @Override
    public void addNews(News news) {
        newsDAO.save(news);
    }

    @Override
    public void delNews(News news) {
        newsDAO.delete(news);
    }
}
