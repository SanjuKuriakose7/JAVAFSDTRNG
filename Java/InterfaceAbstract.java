package com.ust;

abstract interface MusicPlayer {
	public static final int defaultVolume=30;
	public abstract void play();
	public abstract void stop();
}
class MelodySongs implements MusicPlayer {
	public void play() {
		System.out.println("Music Player Playing Melody Songs");
	}
	public void stop() {
		System.out.println("Music Player is Playig DJ ");
	}
	
}

public class InterfaceAbstract {

	public static void main(String[] args) {
		MelodySongs m=new MelodySongs();
		m.play();
		m.stop();

	}

}
