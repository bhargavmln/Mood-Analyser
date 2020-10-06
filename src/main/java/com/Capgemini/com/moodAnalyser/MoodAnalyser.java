package com.Capgemini.com.moodAnalyser;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoodAnalyser {

	String message;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	private static Logger LOG = LogManager.getLogger(MoodAnalyser.class);

	public String analyseMood() {
		try {
			if (message.contains("Sad") || message.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LOG.info("Enter your Mood: ");
		String message = sc.nextLine();
		MoodAnalyser moodAnalyser = new MoodAnalyser(message);
		LOG.info(moodAnalyser.analyseMood());
	}
}
