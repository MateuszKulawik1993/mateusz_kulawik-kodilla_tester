
mport org.junit.jupiter.params.ParameterizedTest;
import inheritance.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuit {

    @ParameterizedTest
    @CsvSource({
            "1.80, 45.0, Very severely underweight",
            "1.80, 50.0, Severely underweight",
            "1.80, 60.0, Underweight",
            "1.80, 70.0, Normal (healthy weight)",
            "1.80, 85.0, Overweight",
            "1.80, 100.0, Obese Class I (Moderately obese)",
            "1.80, 115.0, Obese Class II (Severely obese)",
            "1.80, 130.0, Obese Class III (Very severely obese)",
            "1.80, 140.0, Obese Class IV (Morbidly Obese)",
            "1.80, 160.0, Obese Class V (Super Obese)",
            "1.80, 200.0, Obese Class VI (Hyper Obese)"
    })
    public void shouldCalculateCorrectBMI(double heightInMeters, double weightInKilogram, String expectedBMI) {
        // Given
        Person person = new Person(heightInMeters, weightInKilogram);

        // When
        String actualBMI = person.getBMI();

        // Then
        assertEquals(expectedBMI, actualBMI);
    }
}