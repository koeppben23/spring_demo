package com.adorsys.springdemo.entity;

public class ToDo {

    private Long userId;
    private Long id;
    private String title;
    private boolean comleted;

    public ToDo() {
    }

    public ToDo(Long userId, Long id, String title, boolean comleted) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.comleted = comleted;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComleted() {
        return comleted;
    }

    public void setComleted(boolean comleted) {
        this.comleted = comleted;
    }
}
