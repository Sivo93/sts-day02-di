package com.example.myweb.ex;

public class SamsungTV implements TV {

	private Speaker speaker;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("�ＺTV �ѱ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("�ＺTV ����");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		speaker.setVolume(volume);
		System.out.println("�Ｚ TV ���Ƿ� ���� = " + "");
	}

	@Override
	public void setSpeaker(Speaker speaker) {
		// TODO Auto-generated method stub
		
	}

}
