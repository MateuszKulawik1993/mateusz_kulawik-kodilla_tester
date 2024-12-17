package com.kodilla.stream;

import java.util.List;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    public static List<String> filterChemistGroupUsernames(List<User> users) {
        return users.stream()
                .filter(user -> "Chemists".equals(user.getGroup()))
                .map(User::getUsername)
                .collect(Collectors.toList());
    }

    public static List<User> getUsersOlderThan(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public static List<String> getUsernamesStartingWith(List<User> users, String prefix) {
        return users.stream()
                .map(User::getUsername)
                .filter(username -> username.startsWith(prefix))
                .collect(Collectors.toList());
    }
}