package test;


import subject.Proxy;
import subject.RealSubject;

public class Main {
	public static void main(String[] args) {
		Proxy  proxy = new Proxy(new RealSubject());
		
		proxy.buyMac();
	}
}
