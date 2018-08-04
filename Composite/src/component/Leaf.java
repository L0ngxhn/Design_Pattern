package component;

import java.util.List;
/**
 * р╤вс╫з╣Ц
 * @author swh
 *
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	public void operation(int depth) {
		String temp = "";
		for (int i = 0; i < depth; i++) {
			temp += "    ";
		}
		System.out.println(temp + this.name);
	}

	@Override
	public void add(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Component> getChildren() {
		throw new UnsupportedOperationException();
	}

}
