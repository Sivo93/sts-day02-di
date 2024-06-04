package com.example.myweb.ex;

public class DeviceContainer {
	//�ܺο��� TV���� ������ �ش� TV ��ü�� ��ȯ�Ѵ�.
	public static TV getTv(String tvname, String speakerName) {
		String pkg = "com.example.myweb.ex.";
		// ����Ŀ ����
		try {
			Speaker speaker = (Speaker) Class.forName(pkg + "speakerName").newInstance();
		// TV ����
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
