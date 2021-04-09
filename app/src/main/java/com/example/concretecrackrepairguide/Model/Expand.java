package com.example.concretecrackrepairguide.Model;

public class Expand {
    String title,content;
    boolean expanded;

    public Expand(String title, String content) {
        this.title = title;
        this.content = content;
        this.expanded = false;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
