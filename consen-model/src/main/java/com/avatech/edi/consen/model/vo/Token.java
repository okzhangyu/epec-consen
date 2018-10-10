package com.avatech.edi.consen.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="AVA_IN_TOKEN")
public class Token {
    @Id
    @Column(name = "Uniquekey")
    private String id;

    @Column(name = "Clientid")
    private String clientId;

    @Column(name = "Clientsceret")
    private String clientSceret;

    @Column(name = "Companyid")
    private String companyId;

    @Column(name = "Username")
    private String userName;

    @Column(name = "Password")
    private String password;

    @Column(name = "Expiredtime")
    private long expiredTime;

    @Column(name = "Token")
    private String token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSceret() {
        return clientSceret;
    }

    public void setClientSceret(String clientSceret) {
        this.clientSceret = clientSceret;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(long expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Token{" +
                "id='" + id + '\'' +
                ", clientId='" + clientId + '\'' +
                ", clientSceret='" + clientSceret + '\'' +
                ", companyId='" + companyId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", expiredTime=" + expiredTime +
                ", token='" + token + '\'' +
                '}';
    }
}
