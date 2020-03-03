package com.example.novel.Entity;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

//实体类中的小说类--可能还不全，可以补充
@Entity
public class Novel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int novelNum;//小说编号
    private String name;
    private String writer;
    private Date createTime; //小说上传时间mysql自动填充即可
    private String type; //小说类别

    public int getNovelNum() {
        return novelNum;
    }

    public void setNovelNum(int novelNum) {
        this.novelNum = novelNum;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
