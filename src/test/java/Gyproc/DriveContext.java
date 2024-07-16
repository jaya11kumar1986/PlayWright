package Gyproc;

import java.io.IOException;

public class DriveContext extends WebTestContext {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebTestContext.browserLaunchContext("http://192.168.1.62:84/Home/Index?uid=234JKR5678BMNREWT346");

		projectAdd.project();
		
		wallSystem.wall();
		
		wallSystem.sheet();
			
		
	}

}
