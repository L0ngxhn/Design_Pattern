package template;

/**
 * 模板父类
 * 
 * @author swh
 * 
 */
public abstract class Game {

	private int playersCount;

	// 由子类实现的抽象操作
	public abstract void initializeGame();

	// 由子类实现的抽象操作
	abstract void makePlay(int player);

	// 由子类实现的抽象操作
	abstract boolean endOfGame();

	// 由子类实现的抽象操作
	abstract void printWinner();

	/* A template method : */
	public final void playOneGame(int playersCount) {
		this.playersCount = playersCount;

		initializeGame();  // 由子类来实现其算法

		int j = 0;
		while (true) {

			makePlay(j); // 由子类来实现其算法

			j = (j + 1) % playersCount;

			if (endOfGame()) {
				break;
			}
		}

		printWinner();  // 由子类来实现其算法
	}
}
