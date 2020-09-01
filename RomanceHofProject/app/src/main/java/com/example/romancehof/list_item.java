package com.example.romancehof;

public class list_item {

    public list_item(int profile_image, String nickname, String title) {
        this.profile_image = profile_image;
        this.nickname = nickname;
        this.title = title;
    }

    private int profile_image;
    private String nickname;
    private String title;

    public int getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(int profile_image) {
        this.profile_image = profile_image;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
