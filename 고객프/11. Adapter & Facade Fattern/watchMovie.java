package smu_2;

public class watchMovie(String movie) {
	System.out.println("Get ready to watch a movie...");
	popper.on();
	popper.pop();
	lights.dim(10);
	screen.down();
	projector.on();
	projector.wideScreenMode();
	amp.on();
	amp.setDvd(dvd);
	amp.setVolume(5);
	dvd.on();
	dvd.play(movie);
	
	
	public void endMoive() {
		System.out.println("Shutting movie theater down...");
		project.off();
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
	/*기타 메소드...*/
}
