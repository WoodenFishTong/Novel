package com.example.novel.Service;

import com.example.novel.Dao.NovelDao;
import com.example.novel.Entity.Novel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelService {
    @Autowired
    private NovelDao novelDao;
    public List<Novel> selectNovel(){return novelDao.selectNovel();}
}
