package com.example.myweb.ex;

public class DeviceContainer {
	//외부에서 TV명이 들어오면 해당 TV 객체를 반환한다.
	public static TV getTv(String tvname, String speakerName) {
		String pkg = "com.example.myweb.ex.";
		// 스피커 생성
		try {
			Speaker speaker = (Speaker) Class.forName(pkg + "speakerName").newInstance();
		// TV 생성
			TV tv = (TV) Class.forName(pkg + "tvName").newInstance();
			tv.setSpeaker(speaker);
			
			return tv;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return null;
	}
}
