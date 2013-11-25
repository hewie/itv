package de.neuland.itv.jsonparser;

import de.neuland.itv.parser.UserParseResult;

public class UserJsonParseResult implements UserParseResult {
    private String name;
    private String email;

    public UserJsonParseResult(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
