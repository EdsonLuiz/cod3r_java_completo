package com.edson;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("should answer with true!!!!")
    public void should_Answer_With_True()
    {
        assertTrue( true );
    }
}
