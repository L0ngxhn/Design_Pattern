package decorator;

import component.Hero;

/**
 * ����װ���� ��Decortor
 * 
 * @author swh
 * 
 */
public class Skills implements Hero {
	// ��װ�ε����������
	private Hero hero;

	public Skills(Hero hero) {
		this.hero = hero;
	}
	// װ���¹���
	public void learnSkills() {
		 if (hero != null)
		hero.learnSkills();
	}

}
