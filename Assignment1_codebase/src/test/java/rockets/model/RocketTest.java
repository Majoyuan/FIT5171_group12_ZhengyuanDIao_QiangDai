package rockets.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RocketTest {
    private Rocket target;
    private String name = "aa";

    private String nationality = "bb";

    private String manufacturer = "cc";

    @BeforeEach
    public void setUp() {
        target = new Rocket(name, nationality, manufacturer);
    }

    @DisplayName("should throw exception when pass a empty email address to setMassToGTO function")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    public void shouldThrowExceptionWhensetMassToGTOToEmpty(String massToGTO) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> target.setMassToGTO(massToGTO));
        assertEquals("massToGTO cannot be empty or null", exception.getMessage());
    }

    @DisplayName("should throw exception when pass null to setMassToGTO function")
    @Test
    public void shouldThrowExceptionWhensetMassToGTOToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setMassToGTO(null));
        assertEquals("massToGTO cannot be empty or null", exception.getMessage());
    }

    @DisplayName("should throw exception when pass a empty email address to setMassToGTO function")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    public void shouldThrowExceptionWhensetMassToLEOToEmpty(String massToLEO) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> target.setMassToLEO(massToLEO));
        assertEquals("massToLEO cannot be empty or null", exception.getMessage());
    }

    @DisplayName("should throw exception when pass null to setMassToGTO function")
    @Test
    public void shouldThrowExceptionWhensetMassToLEOToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setMassToLEO(null));
        assertEquals("massToLEO cannot be empty or null", exception.getMessage());
    }

    @DisplayName("should throw exception when pass a empty email address to setMassToGTO function")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    public void shouldThrowExceptionWhensetMassToOtherToEmpty(String massToOther) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> target.setMassToOther(massToOther));
        assertEquals("massToOther cannot be empty or null", exception.getMessage());
    }

    @DisplayName("should throw exception when pass null to setMassToOther function")
    @Test
    public void shouldThrowExceptionWhensetMassToOtherToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setMassToOther(null));
        assertEquals("massToOther cannot be empty or null", exception.getMessage());
    }
    @DisplayName("should return true when two users have the same massToGTO")
    @Test
    public void shouldReturnTrueWhenUsersHaveSamemasstogto() {
        String massToGTO = "aa";
        target.setMassToGTO(massToGTO);
        Rocket anotherUser = new Rocket(name,nationality,manufacturer);
        anotherUser.setMassToGTO(massToGTO);
        assertTrue(target.equals(anotherUser));
    }
    @DisplayName("should return false when two users have different emails")
    @Test
    public void shouldReturnFalseWhenUsersHaveDifferentmasstogto() {
        target.setMassToGTO("aa");
        Rocket anotherUser = new Rocket(name,nationality,manufacturer);
        anotherUser.setMassToGTO("cc");
        assertFalse(target.equals(anotherUser));
    }
    @DisplayName("should return true when two users have the same massToLEO")
    @Test
    public void shouldReturnTrueWhenUsersHaveSamemasstoleo() {
        String massToLEO = "bb";
        target.setMassToLEO(massToLEO);
        Rocket anotherUser = new Rocket(name,nationality,manufacturer);
        anotherUser.setMassToLEO(massToLEO);
        assertTrue(target.equals(anotherUser));
    }
    @DisplayName("should return false when two users have different emails")
    @Test
    public void shouldReturnFalseWhenUsersHaveDifferentleo() {
        target.setMassToLEO("aa");
        Rocket anotherUser = new Rocket(name,nationality,manufacturer);
        anotherUser.setMassToLEO("cc");
        assertFalse(target.equals(anotherUser));
    }
    @DisplayName("should return true when two users have the same massToOther")
    @Test
    public void shouldReturnTrueWhenUsersHaveSamemassToOther() {
        String massToOther = "cc";
        target.setMassToOther(massToOther);
        Rocket anotherUser = new Rocket(name,nationality,manufacturer);
        anotherUser.setMassToOther(massToOther);
        assertTrue(target.equals(anotherUser));
    }
    @DisplayName("should return false when two users have different emails")
    @Test
    public void shouldReturnFalseWhenUsersHaveDifferentothers() {
        target.setMassToOther("aa");
        Rocket anotherUser = new Rocket(name,nationality,manufacturer);
        anotherUser.setMassToOther("cc");
        assertFalse(target.equals(anotherUser));
    }



}