package decorator;

import component.Hero;
/**
 * ConcreteDecrotorA
 * @author swh
 *
 */
public class Skill_Q extends Skills{
	// 组件上的挂件
	private String skillName;
	
	public Skill_Q(Hero hero,String skillName){
		super(hero);
		this.skillName = skillName;
	}
	
    public void learnSkills() {
    	  System.out.println("学习了技能Q:" +skillName);
    	  super.learnSkills();
    }
}
