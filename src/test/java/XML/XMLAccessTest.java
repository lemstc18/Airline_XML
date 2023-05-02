package XML;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XMLAccessTest {

    @Test
    void loadFromXml() {
        assertEquals(0, XMLAccess.getTheInstance().getAirline());
    }
}