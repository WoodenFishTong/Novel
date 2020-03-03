package com.example.novel.Entity;

public class User {
    private String name;
    private String openid;//微信小程序用户唯一标识
    private String session_key;
    private int[][] collect;//收藏数目ID数组及章节数


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public int[][] getCollect() {
        return collect;
    }

    public void setCollect(int[][] collect) {
        this.collect = collect;
    }
}
