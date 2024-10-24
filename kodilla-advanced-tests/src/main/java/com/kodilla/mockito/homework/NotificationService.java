package com.kodilla.mockito.homework;
package homework;

import java.util.*;

public class NotificationService {

    private Map<Location, Set<Client>> subscriptions = new HashMap<>();

    // Zapisz klienta do subskrypcji lokalizacji
    public void subscribe(Client client, Location location) {
        subscriptions.putIfAbsent(location, new HashSet<>());
        subscriptions.get(location).add(client);
    }

    // Wypisz klienta z danej lokalizacji
    public void unsubscribe(Client client, Location location) {
        if (subscriptions.containsKey(location)) {
            subscriptions.get(location).remove(client);
            if (subscriptions.get(location).isEmpty()) {
                subscriptions.remove(location);
            }
        }
    }

    // Wypisz klienta ze wszystkich lokalizacji
    public void unsubscribeFromAll(Client client) {
        for (Set<Client> clients : subscriptions.values()) {
            clients.remove(client);
        }
    }

    // Wyślij powiadomienie do wszystkich subskrybentów danej lokalizacji
    public void notifyLocation(Location location, String message) {
        Set<Client> clients = subscriptions.getOrDefault(location, Collections.emptySet());
        for (Client client : clients) {
            client.receiveNotification(message);
        }
    }

    // Wyślij powiadomienie do wszystkich klientów
    public void notifyAllClients(String message) {
        Set<Client> notifiedClients = new HashSet<>();
        for (Set<Client> clients : subscriptions.values()) {
            for (Client client : clients) {
                if (!notifiedClients.contains(client)) {
                    client.receiveNotification(message);
                    notifiedClients.add(client);
                }
            }
        }
    }

    // Skasuj daną lokalizację
    public void removeLocation(Location location) {
        subscriptions.remove(location);
    }
}