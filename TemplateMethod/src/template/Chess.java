package template;
/**
 * ��������
 * @author swh
 *
 */
public class Chess extends Game{
	// ʵ���ɸ��ඨ��ĳ��󷽷�
	public void initializeGame() {
		System.out.println("chess��ʼ��");
	}

	void makePlay(int player) {
		System.out.println(player+"��ҿ�ʼ��Ϸ");
	}

	boolean endOfGame() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��Ϸ����");
		return true;
	}

	void printWinner() {
		// TODO Auto-generated method stub
		
	}

}
