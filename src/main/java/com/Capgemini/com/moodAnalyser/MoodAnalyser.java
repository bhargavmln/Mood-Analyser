package com.Capgemini.com.moodAnalyser;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MoodAnalyser {
	
	private static Logger LOG = LogManager.getLogger(MoodAnalyser.class);
	
	public String analyseMood(String message) {
		if (message.contains("Sad")|| message.contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		LOG.info("Enter your Mood: ");
		String message = sc.nextLine();
		LOG.info(moodAnalyser.analyseMood(message));
	}
}
