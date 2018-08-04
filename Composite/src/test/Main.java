package test;

import component.Composite;
import component.Leaf;

public class Main {
	public static void main(String[] args) {
		        Composite root = new Composite("Ê÷¸ù");

		        Composite branch01 = new Composite("Ê÷Ö¦01");
		        Composite branch02 = new Composite("Ê÷Ö¦02");
		        Composite branch03 = new Composite("Ê÷Ö¦03");
		        Composite branch04 = new Composite("Ê÷Ö¦04");

		        branch01.add(new Leaf("Ê÷Ò¶01"));
		        branch01.add(new Leaf("Ê÷Ò¶02"));
		        branch03.add(new Leaf("Ê÷Ò¶03"));
		        branch03.add(new Leaf("Ê÷Ò¶04"));
		        branch03.add(new Leaf("Ê÷Ò¶05"));
		        branch01.add(branch03);

		        branch02.add(new Leaf("Ê÷Ò¶06"));
		        branch02.add(new Leaf("Ê÷Ò¶07"));
		        branch02.add(new Leaf("Ê÷Ò¶08"));
		        branch04.add(new Leaf("Ê÷Ò¶09"));
		        branch04.add(new Leaf("Ê÷Ò¶10"));
		        branch02.add(branch04);

		        root.add(branch01);
		        root.add(branch02);

		        root.operation(0);
	}
}
