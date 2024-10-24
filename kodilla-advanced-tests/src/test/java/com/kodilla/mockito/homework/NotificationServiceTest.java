package com.kodilla.mockito.homework;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NotificationServiceTest {

    private NotificationService notificationService;
    private Client client1;
    private Client client2;
    private Location location1;
    private Location location2;

    @BeforeEach
    public void setUp() {
        notificationService = new NotificationService();
        client1 = mock(Client.class);
        client2 = mock(Client.class);
        location1 = new Location("Warsaw");
        location2 = new Location("Krakow");
    }

    @Test
    public void shouldSubscribeClientToLocation() {
        notificationService.subscribe(client1, location1);
        notificationService.notifyLocation(location1, "Storm warning");

        verify(client1, times(1)).receiveNotification("Storm warning");
    }

    @Test
    public void shouldNotNotifyClientsInDifferentLocation() {
        notificationService.subscribe(client1, location1);
        notificationService.notifyLocation(location2, "Storm warning");

        verify(client1, never()).receiveNotification(anyString());
    }

    @Test
    public void shouldUnsubscribeClientFromLocation() {
        notificationService.subscribe(client1, location1);
        notificationService.unsubscribe(client1, location1);
        notificationService.notifyLocation(location1, "Storm warning");

        verify(client1, never()).receiveNotification(anyString());
    }

    @Test
    public void shouldUnsubscribeClientFromAllLocations() {
        notificationService.subscribe(client1, location1);
        notificationService.subscribe(client1, location2);
        notificationService.unsubscribeFromAll(client1);

        notificationService.notifyLocation(location1, "Storm warning");
        notificationService.notifyLocation(location2, "Flood warning");

        verify(client1, never()).receiveNotification(anyString());
    }

    @Test
    public void shouldNotifyAllClients() {
        notificationService.subscribe(client1, location1);
        notificationService.subscribe(client2, location2);

        notificationService.notifyAllClients("New terms and conditions");

        verify(client1, times(1)).receiveNotification("New terms and conditions");
        verify(client2, times(1)).receiveNotification("New terms and conditions");
    }

    @Test
    public void shouldRemoveLocation() {
        notificationService.subscribe(client1, location1);
        notificationService.removeLocation(location1);
        notificationService.notifyLocation(location1, "Storm warning");

        verify(client1, never()).receiveNotification(anyString());
    }
}
