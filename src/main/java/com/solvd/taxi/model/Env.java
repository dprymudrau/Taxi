package com.solvd.taxi.model;

public enum Env implements IEnv {
    PROD("http://somewebsite.com", "/home"),
    STAGE("http://stage.somewebsite.biz", "/home_test"),
    DEV("", "");

    private final String url;
    private final String homePageUri;
    private String a;

    Env(String url, String homePageUri) {
        this.url = url;
        this.homePageUri = homePageUri;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getA() {
        return this.a;
    }


    @Override
    public String getUrl() {
        return url;
    }

    public String getHomePageUri() {
        return homePageUri;
    }

    public String getHomePageUrl() {
        return this.url + this.homePageUri;
    }
}
