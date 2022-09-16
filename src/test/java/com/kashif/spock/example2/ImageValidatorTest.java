package com.kashif.spock.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ImageValidatorTest {

    @ParameterizedTest(name = "Validate extensions of ''{0}''")
    @CsvSource({"someFile.jpg, true",
                "someFile.jpeg, true",
                "someFile.jpeg, false",
                "someFile.png, true",
                "someFile.tiff, false"})
    public void testImageValidator(String filename, boolean expectedValue){
        boolean isValid = ImageValidator.validate(filename);
        Assertions.assertEquals(expectedValue, isValid);
    }


}