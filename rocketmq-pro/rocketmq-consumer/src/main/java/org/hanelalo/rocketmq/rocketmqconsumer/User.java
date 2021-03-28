package org.hanelalo.rocketmq.rocketmqconsumer;

public class User {

  private String username;
  private int age;

  public String getUsername() {
    return username;
  }

  public User setUsername(String username) {
    this.username = username;
    return this;
  }

  public int getAge() {
    return age;
  }

  public User setAge(int age) {
    this.age = age;
    return this;
  }

  @Override
  public String toString() {
    return "User{" +
        "username='" + username + '\'' +
        ", age=" + age +
        '}';
  }
}
