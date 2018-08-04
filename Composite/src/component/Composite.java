package component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * вс╫з╣Ц
 * @author swh
 *
 */
public class Composite extends Component{

	List<Component> children ;
	
	public Composite(String name) {
		super(name);
		this.children = new LinkedList<>();
	}

	public void operation(int depth) {
		 String temp = "";
	        for(int i=0;i<depth;i++)
	        {
	            temp += "    ";
	        }

	        LinkedList<Component> children = (LinkedList<Component>) this.getChildren();
	        System.out.println(temp+this.name);
	        for (Component c : children) {
	            c.operation(depth+1);
	        } 
		
	}

	@Override
	public void add(Component component) {
		this.children.add(component);
	}

	@Override
	public void remove(Component component) {
		this.children.remove(component);
	}

	@Override
	public List<Component> getChildren() {
		return this.children;
	}

}
