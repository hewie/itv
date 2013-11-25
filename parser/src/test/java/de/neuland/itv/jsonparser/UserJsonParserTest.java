package de.neuland.itv.jsonparser;

import de.neuland.itv.parser.ParseException;
import de.neuland.itv.parser.Parser;
import de.neuland.itv.parser.UserParseResult;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class UserJsonParserTest {

    private String json;
    private Parser parser;

    @Before
    public void setUp() throws Exception {
        parser = new UserJsonParser();
    }

    @Test
    public void shouldParseAJsonStringAndReturnAnUserParseResult() throws Exception {
        json = "{\"name\":\"John\", \"email\":\"atom@neuland-bfi.de\"}";
        UserParseResult result = parser.parse(json);
        assertNotNull("result was expected to be not null but was null", result);
        assertEquals("name was expected to be John but wasn't", "John", result.getName());
        assertEquals("email was expected to be atom@neuland-bfi.de but wasn't", "atom@neuland-bfi.de", result.getEmail());
    }

    @Test(expected = ParseException.class)
    public void shouldThrowAParseExceptionIfBadJsonStringWasGiven() throws Exception {
        json = "{\"name John\", \"email atom@neuland-bfi.de\"}";
        parser.parse(json);
    }

    @Test(expected = ParseException.class)
    public void shouldThrowAParseExceptionIfNull() throws Exception {
        parser.parse(null);
    }
}
