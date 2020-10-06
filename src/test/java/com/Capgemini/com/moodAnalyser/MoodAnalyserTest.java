package com.Capgemini.com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	private String Null;

	@Test
	public void givenMessage_whenSad_returnSad() {
		MoodAnalyser myMood = new MoodAnalyser("I am in Sad Mood");
		String mood = myMood.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_whenNotSad_returnSad() {
		MoodAnalyser myMood = new MoodAnalyser("I am in Happy Mood");
		String mood = myMood.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_whenNull_returnHappy() {
		MoodAnalyser myMood = new MoodAnalyser(null);
		String mood = myMood.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}
