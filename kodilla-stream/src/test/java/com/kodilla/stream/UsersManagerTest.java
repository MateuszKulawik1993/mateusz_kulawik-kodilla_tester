package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class UsersManagerTest {

    @Test
    void testFilterChemistGroupUsernames_WithChemists() {
        // Given
        List<User> users = Arrays.asList(
                new User("user1", "Chemists", 25),
                new User("user2", "Physicists", 30),
                new User("user3", "Chemists", 40)
        );

        // When
        List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames(users);

        // Then
        assertEquals(2, chemistUsernames.size());
        assertTrue(chemistUsernames.containsAll(Arrays.asList("user1", "user3")));
    }

    @Test
    void testFilterChemistGroupUsernames_WithNoChemists() {
        // Given
        List<User> users = Arrays.asList(
                new User("user1", "Physicists", 25),
                new User("user2", "Biologists", 30)
        );

        // When
        List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames(users);

        // Then
        assertTrue(chemistUsernames.isEmpty());
    }

    @Test
    void testFilterChemistGroupUsernames_WithEmptyList() {
        // Given
        List<User> users = Collections.emptyList();

        // When
        List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames(users);

        // Then
        assertTrue(chemistUsernames.isEmpty());
    }

    @Test
    void testGetUsersOlderThan_WithValidUsers() {
        // Given
        List<User> users = Arrays.asList(
                new User("user1", "Chemists", 25),
                new User("user2", "Physicists", 30),
                new User("user3", "Chemists", 40)
        );

        // When
        List<User> olderUsers = UsersManager.getUsersOlderThan(users, 25);

        // Then
        assertEquals(2, olderUsers.size());
        assertTrue(olderUsers.stream().allMatch(user -> user.getAge() > 25));
    }

    @Test
    void testGetUsersOlderThan_WithNoMatchingUsers() {
        // Given
        List<User> users = Arrays.asList(
                new User("user1", "Chemists", 25),
                new User("user2", "Physicists", 20)
        );

        // When
        List<User> olderUsers = UsersManager.getUsersOlderThan(users, 30);

        // Then
        assertTrue(olderUsers.isEmpty());
    }

    @Test
    void testGetUsersOlderThan_WithAgeEqualToThreshold() {
        // Given
        List<User> users = Arrays.asList(
                new User("user1", "Chemists", 25),
                new User("user2", "Physicists", 25)
        );

        // When
        List<User> olderUsers = UsersManager.getUsersOlderThan(users, 25);

        // Then
        assertTrue(olderUsers.isEmpty());
    }

    @Test
    void testGetUsersOlderThan_WithEmptyList() {
        // Given
        List<User> users = Collections.emptyList();

        // When
        List<User> olderUsers = UsersManager.getUsersOlderThan(users, 25);

        // Then
        assertTrue(olderUsers.isEmpty());
    }

    @Test
    void testGetUsernamesStartingWith_WithValidPrefix() {
        // Given
        List<User> users = Arrays.asList(
                new User("user1", "Chemists", 25),
                new User("admin1", "Physicists", 30),
                new User("user2", "Chemists", 40)
        );

        // When
        List<String> usernames = UsersManager.getUsernamesStartingWith(users, "user");

        // Then
        assertEquals(2, usernames.size());
        assertTrue(usernames.containsAll(Arrays.asList("user1", "user2")));
    }

    @Test
    void testGetUsernamesStartingWith_WithNoMatches() {
        // Given
        List<User> users = Arrays.asList(
                new User("admin1", "Physicists", 30),
                new User("manager1", "Chemists", 40)
        );

        // When
        List<String> usernames = UsersManager.getUsernamesStartingWith(users, "user");

        // Then
        assertTrue(usernames.isEmpty());
    }

    @Test
    void testGetUsernamesStartingWith_WithEmptyList() {
        // Given
        List<User> users = Collections.emptyList();

        // When
        List<String> usernames = UsersManager.getUsernamesStartingWith(users, "user");

        // Then
        assertTrue(usernames.isEmpty());
    }
}