package com.sample;


public class User {

  private String userid;
  private String password;
  private String username;
  private long isAuthority;


  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public long getIsAuthority() {
    return isAuthority;
  }

  public void setIsAuthority(long isAuthority) {
    this.isAuthority = isAuthority;
  }

}