package component;

import java.util.List;
/**
 * ×éºÏÀà
 * @author swh
 *
 */
public abstract class Component {
	protected String name;

	public Component(String name) {
		this.name = name;
	}
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void operation(int depth);
	public abstract List<Component> getChildren();
	
}
