package baseball;

public class Application {

	static void printStartMessage() {
		System.out.println("숫자 야구 게임을 시작합니다.");
	}

	public static void main(String[] args) {

		printStartMessage();

		Game game = new Game();
		game.playGame();
	}
}
