package decorator;

import component.Hero;
/**
 * ConcreteDecrotorA
 * @author swh
 *
 */
public class Skill_Q extends Skills{
	// ����ϵĹҼ�
	private String skillName;
	
	public Skill_Q(Hero hero,String skillName){
		super(hero);
		this.skillName = skillName;
	}
	
    public void learnSkills() {
    	  System.out.println("ѧϰ�˼���Q:" +skillName);
    	  super.learnSkills();
    }
}
