package com.example.myweb.ex;

public class AppleSpeaker implements Speaker {

	private int volume;
	
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("SonySpeaker Volume");
			this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}

	
}
