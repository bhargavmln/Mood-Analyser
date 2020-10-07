package com.Capgemini.com.moodAnalyser;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Capgemini.com.moodAnalyser.MoodAnalysisException.TypeOfException;

public class MoodAnalyser {

	String message;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	private static Logger LOG = LogManager.getLogger(MoodAnalyser.class);

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("Sad") || message.contains("sad")) {
				return "SAD";
			} else if(message.length() == 0) {
				throw new MoodAnalysisException(TypeOfException.ENTERED_EMPTY, "Enter Proper Value");
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(TypeOfException.ENTERED_NULL, "Enter Proper Value");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LOG.info("Enter your Mood: ");
		String message = sc.nextLine();
		MoodAnalyser moodAnalyser = new MoodAnalyser(message);
		try {
			LOG.info(moodAnalyser.analyseMood());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
}
