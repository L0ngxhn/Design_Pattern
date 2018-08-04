package component;
/**
 * 被装饰组件
 * @author swh
 *
 */
public class JaVen4 implements Hero{

	String name;
	public JaVen4(String name){
		this.name = name;
	}
	
	public void learnSkills() {
		System.out.println(name+":学习了技能");
	}

}
