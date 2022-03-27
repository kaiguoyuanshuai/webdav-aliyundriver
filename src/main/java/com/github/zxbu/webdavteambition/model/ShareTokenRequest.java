package com.github.zxbu.webdavteambition.model;

public class ShareTokenRequest {
    private String share_id;
    private String share_pwd;

    public String getShare_id() {
        return share_id;
    }

    public ShareTokenRequest setShare_id(String share_id) {
        this.share_id = share_id;
        return this;
    }

    public String getShare_pwd() {
        return share_pwd;
    }

    public ShareTokenRequest setShare_pwd(String share_pwd) {
        this.share_pwd = share_pwd;
        return this;
    }
}
