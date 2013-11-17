package de.neuland.itv.jsonparser;
import de.neuland.itv.parser.*;
import org.json.JSONObject;

public class UserJsonParser implements Parser {

    @Override
    public UserParseResult parse(String json) throws ParseException {
        try {
            JSONObject o = new JSONObject(json);
            return new UserJsonParseResult((String)o.get("name"), (String)o.get("email"));
        } catch (Exception e) {
            throw new ParseException();
        }
    }
}
