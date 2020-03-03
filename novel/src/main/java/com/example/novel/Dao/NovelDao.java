package com.example.novel.Dao;

import com.example.novel.Entity.Novel;

import java.util.List;

//接口层
public interface NovelDao {
    List<Novel> selectNovel();
}
