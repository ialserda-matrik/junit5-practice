package nl.matrik.practice.junit;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class GreetingImplTest {

    @Test
    void greetShouldReturnAValidOutput() {
        Greeting greeting = new GreetingImpl();
        String result = greeting.greet("JUnit5");
        assertNotNull(result);
        assertEquals("Hello JUnit5", result);
    }

    @Test
    void greetShouldReturnAInvalidOutput() {
        Greeting greeting = new GreetingImpl();
        String result = greeting.greet("JUnit5");
        assertNotNull(result);
        assertNotEquals("Hello JUnit4", result);
    }

    @Test
    void greetShouldReturnAInvalidOutput2() {
        Greeting greeting = new GreetingImpl();
        String result = greeting.greet("JUnit5");
        assertNotNull(result);
        assertNotEquals("Hello JUnit3", result);
    }

}