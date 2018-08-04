package test;

import component.Hero;
import component.JaVen4;
import decorator.Skill_Q;
import decorator.Skill_R;
import decorator.Skills;

public class Test {
	public static void main(String[] args) {
		// 被装饰的组件
		Hero hero = new JaVen4("德玛西亚皇子");
		// 装饰器含有 被装饰组件 的引用
		Hero skills = new Skills(hero);  // 给Component装饰上新功能
		
		Hero q = new Skill_Q(skills, "猛龙出击"); // 给Decorator再次装上新功能
		// 注意此处是q  不是hero
		Hero r = new Skill_R(q, "德邦军旗");
		
		r.learnSkills();
	}
}
