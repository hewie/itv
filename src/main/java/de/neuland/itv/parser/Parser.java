package de.neuland.itv.parser;

public interface Parser {
	
	ParserResult parse(String json) throws ParseException;

}
