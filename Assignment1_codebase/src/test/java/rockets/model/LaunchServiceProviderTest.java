package rockets.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LaunchServiceProviderTest {
    private LaunchServiceProvider target;
    private String name;

    private int yearFounded;

    private String nationality;

    @BeforeEach
    public void setUp() {
        target = new LaunchServiceProvider(name,yearFounded,nationality);
    }
    @DisplayName("should throw exception when pass a empty headquerters address to setHeadquarters function")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    public void shouldThrowExceptionWhensetHeadquartersToEmpty(String headquarters) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> target.setHeadquarters(headquarters));
        assertEquals("headquarters cannot be empty or null", exception.getMessage());
    }

    @DisplayName("should throw exception when pass null to setHeadquarters function")
    @Test
    public void shouldThrowExceptionWhensetHeadquartersToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setHeadquarters(null));
        assertEquals("headquarters cannot be empty or null", exception.getMessage());
    }
    @DisplayName("should throw exceptions when pass a null password to setRockets function")
    @Test
    public void shouldThrowExceptionWhensetRocketsToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setRockets(null));
        assertEquals("rockets cannot be empty or null", exception.getMessage());
    }
    @DisplayName("should return true when two users have the same headquarters")
    @Test
    public void shouldReturnTrueWhenUsersHaveSameheadquarters() {
        String email = "beijing";
        target.setHeadquarters(email);
        LaunchServiceProvider anotherUser = new LaunchServiceProvider(name,yearFounded,nationality);
        anotherUser.setHeadquarters(email);
        assertTrue(target.equals(anotherUser));
    }



}

