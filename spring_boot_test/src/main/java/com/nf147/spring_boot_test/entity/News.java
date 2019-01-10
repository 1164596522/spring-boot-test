package com.nf147.spring_boot_test.entity;

import javax.persistence.*;

@Entity
@Table(name = "XXX") // 此注解只能标注在类上 name 属性表示实体类对应的表，不写默认表名为实体类名称
public class News {

    @Id // 注解用于声明实体类属性映射为数据库主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 用于标注主键的生成策略；IDENTITY：采用数据库ID自增长的方式来自增主键字段，Oracle 不支持这种方式、AUTO： JPA自动选择合适的策略，是默认选项、SEQUENCE：通过序列产生主键，通过@SequenceGenerator 注解指定序列名，MySql不支持这种方式 、TABLE：通过表产生主键，框架借由表模拟序列产生主键，使用该策略可以使应用更易于数据库移植
    private long id;

    private String title;

    private String body;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}