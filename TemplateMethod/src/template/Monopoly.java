package template;

/**
 * 实现模板的子类
 * 
 * @author swh
 * 
 */
public class Monopoly extends Game {

	public void initializeGame() {
		System.out.println("初始化");
	}

	void makePlay(int player) {
		System.out.println(player + "玩家开始游戏");

	}

	boolean endOfGame() {
		return false;
	}

	void printWinner() {
		// TODO Auto-generated method stub

	}

}
