package client;

import observer.Observer;
import observer.Player;
import subject.AllyControlCenter;
import subject.ConcreteAllyControlCenter;

public class Client {
	 public static void main(String args[]) {  
	        //����۲�Ŀ�����  
		 AllyControlCenter acc= new ConcreteAllyControlCenter("��ӹȺ��");  

	        //�����ĸ��۲��߶���  
	        Observer player1,player2,player3,player4;  

	        player1 = new Player("���");  
	        acc.join(player1);  

	        player2 = new Player("�����");  
	        acc.join(player2);  

	        player3 = new Player("���޼�");  
	        acc.join(player3);  

	        player4 = new Player("����");  
	        acc.join(player4);  

	        //ĳ��Ա���ܹ���  
	        player1.beAttacked(acc);  
	    }  

}
