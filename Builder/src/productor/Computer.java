package productor;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的产品： productor
 * @author swh
 *
 */
public class Computer {
	// 电脑组件集合
	private List<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	
}
