package de.neuland.itv.parser;

public interface Parser {
	
	UserParseResult parse(String json) throws ParseException;

}
