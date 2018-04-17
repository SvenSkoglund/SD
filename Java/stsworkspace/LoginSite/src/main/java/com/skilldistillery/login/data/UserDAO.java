package com.skilldistillery.login.data;

public interface UserDAO {
  User getUserByUserNameAndPassword(String userName, String password);
  User findUserById(int userId);
  User updateUser(int userId, User user);
}
