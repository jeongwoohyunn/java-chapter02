package chapter02;

public class TV {
	private boolean power;//off = ch,vol 안올라감
	private int channel; //0~50 51->0
	private int volume; //0~50
	//getset X
	public TV(int channel,int volume,boolean power) {
		this.power =power;
		this.channel = channel;
		this.volume = volume;
	}
	public void power(boolean on) {
		if(on) {
			power=true;
		}
		else {
			power=false;
		}
		//power = on;
	}
	public void channel(int channel) {
		if(channel>50)
			channel=0;
		
		if(channel<0)
			channel=50;
		
		this.channel = channel;
	}
	public void channel(boolean up) {
		channel(channel + (up ? 1 : -1));
		/*
		 * if(up) { channel+=1; } else channel-=1;
		 */
	}
	public void volume(int volume) {
		if(volume>50)
			volume=0;
		
		if(volume<0)
			volume=50;
		this.volume =volume;
	}
	public void volume(boolean up) {
		volume(volume + (up ? 1 : -1));
		/*
		 * if(up) { volume+=1; } else volume-=1;
		 */
	}
	public void status() {
		//항상 상태를 표시한다.
		System.out.println(
				"TV[power="+power+ 
				", channel="+channel+
				", volume="+volume+"]");
	}
}
