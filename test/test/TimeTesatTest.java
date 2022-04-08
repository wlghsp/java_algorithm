package test;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class TimeTesatTest {

    @Test
    void today() {
        TimeTesat timeTesat = new TimeTesat();
        assertEquals(timeTesat.today(), "20220407");
    }

    @Test
    void now() throws ParseException {
        TimeTesat timeTesat = new TimeTesat();
        assertEquals(timeTesat.now(), "1429");
    }

    @Test
    void bool() {

    }
}