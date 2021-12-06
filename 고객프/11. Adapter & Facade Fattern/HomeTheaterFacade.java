package smu_2;

public class HomeTheaterFacade {

	private Amplifier amp;
	private Tuner tuner;
	private DvdPlayer dvd;
	private CdPlayer cd;
	private Projector projector;
	private TheaterLights lights;
	private Screen screen;
	private PopcornPopper popper;
	
	
	public HomeTheaterFacade(Amplifier a, Tuner t, DvdPlayer d, CdPlayer c,
			Projector p, Screen s, TheaterLights l, PopcornPopper pp) {
		this.amp = a;
		this.tuner = t;
		this.dvd = d;
		this.cd = c;
		this.projector = p;
		this.lights = l;
		this.screen = s;
		this.popper = pp;
		
	}

}
