package com.example.gustavo.protipo1;

public class MovieList {

    private String title;
    private String avatar_url;
    private String html_url;
    private String sinopse;

    public MovieList(String title, String avatar_url, String html_url, String sinopse) {
        this.title = title;
        this.avatar_url = avatar_url;
        this.html_url = html_url;
        this.sinopse = sinopse;
    }

    public String getTitle() {
        return title;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getSinopse() {
        return sinopse;
    }
}
