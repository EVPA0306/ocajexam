package com.evpa.ocajexam.exercises.chapterseven;

public abstract class MusicPlayer {
	
	private int volumeLevel;

	public abstract void play();
	public abstract void stop();
	public abstract void changeVolume(int volumeLevel);
}
