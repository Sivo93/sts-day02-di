package com.example.myweb.ex;

public class SamsungTV implements TV {

	private Speaker speaker;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("»ï¼ºTV ÄÑ±â");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("»ï¼ºTV ²ô±â");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		speaker.setVolume(volume);
		System.out.println("»ï¼º TV ½ºÇÇ·¯ º¼·ý = " + "");
	}

	@Override
	public void setSpeaker(Speaker speaker) {
		// TODO Auto-generated method stub
		
	}

}
