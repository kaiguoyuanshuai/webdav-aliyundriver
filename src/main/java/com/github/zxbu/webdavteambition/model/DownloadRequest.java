package com.github.zxbu.webdavteambition.model;

public class DownloadRequest {
    private String drive_id;
    private String share_id;
    private String file_id;
    private String shareToken;
    private Integer expire_sec = 14400;

    public String getDrive_id() {
        return drive_id;
    }

    public void setDrive_id(String drive_id) {
        this.drive_id = drive_id;
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public Integer getExpire_sec() {
        return expire_sec;
    }

    public void setExpire_sec(Integer expire_sec) {
        this.expire_sec = expire_sec;
    }

    public String getShare_id() {
        return share_id;
    }

    public DownloadRequest setShare_id(String share_id) {
        this.share_id = share_id;
        return this;
    }

    public String getShareToken() {
        return shareToken;
    }

    public DownloadRequest setShareToken(String shareToken) {
        this.shareToken = shareToken;
        return this;
    }
}
