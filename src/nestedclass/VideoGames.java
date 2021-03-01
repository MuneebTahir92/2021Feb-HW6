package nestedclass;

public class VideoGames {
	
	Playstation ps = new Playstation();
	
	public void buyAGame(String version) {
		if(version.equalsIgnoreCase("playstation")) {
			ps.buyPSGame();
		}else if(version.equalsIgnoreCase("xbox")) {
			XBox.buyXBoxGame();
		}else if(version.equalsIgnoreCase("nintendo")) {
			Nintendo.buySwitchGame();
		}else {
			NotAvailable.notInStock();
		}
	}
	
	
	private class Playstation {
		private void buyPSGame() {
			System.out.println("I will get the playstation game for you.");
		}
	}
	
	private static class XBox {
		private static void buyXBoxGame() {
			System.out.println("I will get the xbox game for you.");
		}
	}

	private static class Nintendo {
		private static void buySwitchGame() {
			System.out.println("I will get the switch game for you.");
		}
	}
	
	private static class NotAvailable {
		private static void notInStock() {
			System.out.println("We do not have that version of the game. Sorry.");
		}
	}
}
	
	
