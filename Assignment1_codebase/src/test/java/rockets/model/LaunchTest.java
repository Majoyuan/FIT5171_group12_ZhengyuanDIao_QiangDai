package rockets.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LaunchTest {
    private Launch target;

    @BeforeEach
    public void setUp() {
        target = new Launch();
    }

    @DisplayName("should throw exception when pass a null launchdate address to setLaunchdate function")
    @Test
    public void setLaunchDate() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setLaunchDate(null));
        assertEquals("launchdate cannot be empty or null", exception.getMessage());
    }

    @DisplayName("should throw exception when pass a null LaunchVehicle address to setLaunchVehicle function")
    @Test
    public void setLaunchVehicle() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setLaunchVehicle(null));
        assertEquals("launchvehicles cannot be empty or null", exception.getMessage());
    }

    @DisplayName("should throw exception when pass a empty LaunchServiceProviders address to setLaunchServiceProviders function")
    @Test
    public void setLaunchServiceProvider() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setLaunchServiceProvider(null));
        assertEquals("launchServiceProviders cannot be empty or null", exception.getMessage());
    }

    @DisplayName("should throw exception when pass a empty Payloads address to setPayloads function")
    @Test
    public void setPayload() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setPayload(null));
        assertEquals("Payloads cannot be empty or null", exception.getMessage());
    }
    @DisplayName("should throw exception when pass a empty orbit address to setPayloads function")
    @Test
    public void setOrbit() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setOrbit(null));
        assertEquals("orbit cannot be empty or null", exception.getMessage());
    }
    @DisplayName("should throw exception when pass a empty orbit address to setEmail function")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    public void setOrbitshouldnotbeempty(String orbit) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> target.setOrbit(orbit));
        assertEquals("orbit cannot be empty or null", exception.getMessage());
    }
    @DisplayName("should throw exception when pass a null launchsite address to setPayloads function")
    @Test
    public void setLaunchSite() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setLaunchSite(null));
        assertEquals("launchSite cannot be empty or null", exception.getMessage());
    }
    @DisplayName("should throw exception when pass a empty launchsite address to setEmail function")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    public void setLaunchSiteshouldnotbeempty(String launchSite) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> target.setLaunchSite(launchSite));
        assertEquals("launchSite cannot be empty or null", exception.getMessage());
    }

}