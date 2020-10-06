package com.Capgemini.com.moodAnalyser;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest 
{
	static MoodAnalyser myMood = null;
	
	@BeforeClass
	public static void setUp() {
	myMood = new MoodAnalyser();
	}
	
    @Test
    public void givenMessage_whenSad_returnSad()
    {
       String mood = myMood.analyseMood("I am in Sad Mood");
       Assert.assertEquals("SAD", mood);
    }
    
    @Test
    public void givenMessage_whenNotSad_returnSad()
    {
       String mood = myMood.analyseMood("I am in Any Mood");
       Assert.assertEquals("HAPPY", mood);
    }
}
