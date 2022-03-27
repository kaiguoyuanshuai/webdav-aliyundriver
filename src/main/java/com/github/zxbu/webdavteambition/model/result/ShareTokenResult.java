package com.github.zxbu.webdavteambition.model.result;

import java.util.Date;

public class ShareTokenResult {
    private String share_token;
    private Integer expires_in;
    private Date expire_time;

    public Date getExpire_time() {
        return expire_time;
    }

    public ShareTokenResult setExpire_time(Date expire_time) {
        this.expire_time = expire_time;
        return this;
    }

    public String getShare_token() {
        return share_token;
    }

    public ShareTokenResult setShare_token(String share_token) {
        this.share_token = share_token;
        return this;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public ShareTokenResult setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
        return this;
    }
}
