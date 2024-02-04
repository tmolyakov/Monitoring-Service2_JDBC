package org.example.repository;

import org.example.model.Role;
import org.example.model.User;

public class UserRepository {

    public Integer createUser(User user) {
        return 0;
    }

    public User getUserByLogin(String login) {
        return null;
    }

    public boolean isCorrectUser(String login, String password) {
        return false;
    }

    public boolean isUserExists(String login) {
        return false;
    }

    public boolean isUserAdmin(String login) {
        return false;
    }

    public void changeUserRole(String login, Role role) {

    }
}