package decorator;

import component.Hero;

/**
 * 抽象装饰器 ：Decortor
 * 
 * @author swh
 * 
 */
public class Skills implements Hero {
	// 被装饰的组件的引用
	private Hero hero;

	public Skills(Hero hero) {
		this.hero = hero;
	}
	// 装饰新功能
	public void learnSkills() {
		 if (hero != null)
		hero.learnSkills();
	}

}
