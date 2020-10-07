package com.Capgemini.com.moodAnalyser;

public class MoodAnalysisException extends Exception {

	enum TypeOfException {
		ENTERED_EMPTY, ENTERED_NULL;
	}

	TypeOfException type;
	
	MoodAnalysisException(TypeOfException type, String s) {
		super(s);
		this.type = type;
	}

}
