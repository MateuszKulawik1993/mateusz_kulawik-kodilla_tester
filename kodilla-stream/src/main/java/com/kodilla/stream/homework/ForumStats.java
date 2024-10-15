package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static double calculateAverageForUsers40AndAbove(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }

    public static double calculateAverageForUsersBelow40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double averageFor40AndAbove = calculateAverageForUsers40AndAbove(users);
        double averageForBelow40 = calculateAverageForUsersBelow40(users);
    }
}