package Gyproc;

import java.io.IOException;

public class Drive extends WebTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebTest.browserLaunch("http://192.168.1.62:84/Home/Index?uid=234JKR5678BMNREWT346");
		
		WebTest.screenShot("./snaps/Gyproc/Login.png");
		
		projectAdd.project();
		
		WebTest.screenShot("./snaps/Gyproc/project.png");
		
		wallSystem.wall();
		
		WebTest.screenShot("./snaps/Gyproc/wall.png");
		
		wallSystem.sheet();
		
		WebTest.screenShot("./snaps/Gyproc/sheet.png");
				

	}

}
