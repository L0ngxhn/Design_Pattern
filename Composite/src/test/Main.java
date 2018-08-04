package test;

import component.Composite;
import component.Leaf;

public class Main {
	public static void main(String[] args) {
		        Composite root = new Composite("����");

		        Composite branch01 = new Composite("��֦01");
		        Composite branch02 = new Composite("��֦02");
		        Composite branch03 = new Composite("��֦03");
		        Composite branch04 = new Composite("��֦04");

		        branch01.add(new Leaf("��Ҷ01"));
		        branch01.add(new Leaf("��Ҷ02"));
		        branch03.add(new Leaf("��Ҷ03"));
		        branch03.add(new Leaf("��Ҷ04"));
		        branch03.add(new Leaf("��Ҷ05"));
		        branch01.add(branch03);

		        branch02.add(new Leaf("��Ҷ06"));
		        branch02.add(new Leaf("��Ҷ07"));
		        branch02.add(new Leaf("��Ҷ08"));
		        branch04.add(new Leaf("��Ҷ09"));
		        branch04.add(new Leaf("��Ҷ10"));
		        branch02.add(branch04);

		        root.add(branch01);
		        root.add(branch02);

		        root.operation(0);
	}
}
