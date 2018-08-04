package template;

/**
 * ģ�常��
 * 
 * @author swh
 * 
 */
public abstract class Game {

	private int playersCount;

	// ������ʵ�ֵĳ������
	public abstract void initializeGame();

	// ������ʵ�ֵĳ������
	abstract void makePlay(int player);

	// ������ʵ�ֵĳ������
	abstract boolean endOfGame();

	// ������ʵ�ֵĳ������
	abstract void printWinner();

	/* A template method : */
	public final void playOneGame(int playersCount) {
		this.playersCount = playersCount;

		initializeGame();  // ��������ʵ�����㷨

		int j = 0;
		while (true) {

			makePlay(j); // ��������ʵ�����㷨

			j = (j + 1) % playersCount;

			if (endOfGame()) {
				break;
			}
		}

		printWinner();  // ��������ʵ�����㷨
	}
}
