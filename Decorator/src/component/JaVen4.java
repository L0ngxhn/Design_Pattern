package component;
/**
 * ��װ�����
 * @author swh
 *
 */
public class JaVen4 implements Hero{

	String name;
	public JaVen4(String name){
		this.name = name;
	}
	
	public void learnSkills() {
		System.out.println(name+":ѧϰ�˼���");
	}

}
