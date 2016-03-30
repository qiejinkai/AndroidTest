package com.example.qiejinkai.learnrecyclerview;

/**
 * Created by qiejinkai on 16/3/30.
 */
public class CellData {

    private String title;

    private String content;

    public CellData(){

    }
    public CellData(String title,String content){
        this.title = title;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
