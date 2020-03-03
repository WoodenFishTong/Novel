package com.example.novel.Repository;

import com.example.novel.Dao.NovelDao;
import com.example.novel.Entity.Novel;
import com.example.novel.Utils.RowMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class NovelRepository implements NovelDao {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Novel> selectNovel() {
        String sql = "select * from meal ";
        Map<String, Object> param = new HashMap<>();
        System.out.println(jdbcTemplate.query(sql, param, RowMapperFactory.getInstance(Novel.class)));
        return jdbcTemplate.query(sql, param, RowMapperFactory.getInstance(Novel.class));
    }
}
