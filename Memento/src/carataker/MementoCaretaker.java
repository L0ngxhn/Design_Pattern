package carataker;

import memento.ChessmanMemento;
/**
 * 管理者：负责维护备忘录
 * @author swh
 *
 */
public class MementoCaretaker {
	  private ChessmanMemento memento;  

	    public ChessmanMemento getMemento() {  
	        return memento;  
	    }  

	    public void setMemento(ChessmanMemento memento) {  
	        this.memento = memento;  
	    }  
}
