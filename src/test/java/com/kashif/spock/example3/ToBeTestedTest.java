package com.kashif.spock.example3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ToBeTestedTest {

    @DisplayName("should invoke ToBeMocked.method once")
    @Test
    public void testToBeTestedFoo(){
        ToBeMocked toBeMocked = mock(ToBeMocked.class);
        when(toBeMocked.method("test")).thenReturn("mocked test");
        ToBeTested toBeTested = new ToBeTested(toBeMocked);
        String output = toBeTested.foo("test");
        Assertions.assertEquals(output,"foo mocked test");
        verify(toBeMocked,times(1)).method("test");
    }
}
