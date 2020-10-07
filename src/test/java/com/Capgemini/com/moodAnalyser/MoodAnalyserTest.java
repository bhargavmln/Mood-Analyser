package com.Capgemini.com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_whenSad_returnSad() {
		MoodAnalyser myMood = new MoodAnalyser("I am in Sad Mood");
		String mood = null;
		try {
			mood = myMood.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_whenNotSad_returnSad() {
		MoodAnalyser myMood = new MoodAnalyser("I am in Any Mood");
		String mood = null;
		try {
			mood = myMood.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_whenNull_shouldThrowException() {
		try {
			MoodAnalyser myMood = new MoodAnalyser(null);
			myMood.analyseMood();
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
			Assert.assertEquals("Enter Proper Value", e.getMessage());
		}
	}


	@Test
	public void givenMessage_whenEmpty_shouldThrowException() {
		try {
			MoodAnalyser myMood = new MoodAnalyser("");
			myMood.analyseMood();
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
			Assert.assertEquals("Enter Proper Value", e.getMessage());
		}
	}
}
