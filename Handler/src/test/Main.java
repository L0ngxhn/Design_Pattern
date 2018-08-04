package test;

import handler.ConcreteHandlerA;
import handler.ConcreteHandlerB;
import handler.ConcreteHandlerC;
import handler.Handler;

public class Main {
	public static void main(String[] args) {
		 Handler a = new ConcreteHandlerA();
		    Handler b = new ConcreteHandlerB();
		    Handler c = new ConcreteHandlerC();
		    
		    a.setSuccessor(b);
		    b.setSuccessor(c);
		    // 责任链最终无法处理
		   /* final int requet = 80;
		    a.handlerRequest(request);
		    */
		    //
		    final int requestb = 26;
		    a.handlerRequest(requestb);
	}
}
