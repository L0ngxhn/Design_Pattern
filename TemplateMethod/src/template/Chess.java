package template;
/**
 * 具体子类
 * @author swh
 *
 */
public class Chess extends Game{
	// 实现由父类定义的抽象方法
	public void initializeGame() {
		System.out.println("chess初始化");
	}

	void makePlay(int player) {
		System.out.println(player+"玩家开始游戏");
	}

	boolean endOfGame() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("游戏结束");
		return true;
	}

	void printWinner() {
		// TODO Auto-generated method stub
		
	}

}
