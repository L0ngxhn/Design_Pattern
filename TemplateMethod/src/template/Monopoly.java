package template;

/**
 * ʵ��ģ�������
 * 
 * @author swh
 * 
 */
public class Monopoly extends Game {

	public void initializeGame() {
		System.out.println("��ʼ��");
	}

	void makePlay(int player) {
		System.out.println(player + "��ҿ�ʼ��Ϸ");

	}

	boolean endOfGame() {
		return false;
	}

	void printWinner() {
		// TODO Auto-generated method stub

	}

}
