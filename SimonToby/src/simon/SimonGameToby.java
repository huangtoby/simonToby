package simon;


public class SimonGameToby extends GUIApplication {

	public SimonGameToby() {
		// TODO Auto-generated constructor stub
	}
	
	protected void initScreen() {
		SimonScreenToby simons = new SimonScreenToby(getWidth(), getHeight());
		setScreen(simons);

	}

	public static void main(String[] args) {
		SimonGameToby game = new SimonGameToby();
		Thread app = new Thread(game);
		app.start();
	}

}
