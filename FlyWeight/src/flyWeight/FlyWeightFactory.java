package flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色
 * @author swh
 *
 */
public class FlyWeightFactory {
	// 享元池
	private Map<String,ConcreteFlyWeight> flyWeights = new HashMap<>();
	
	public ConcreteFlyWeight factory(String str){
		ConcreteFlyWeight flyweight  =flyWeights.get(str);
		if(null == flyweight ){
			flyweight = new ConcreteFlyWeight(str);
			
			flyWeights.put(str, flyweight);
		}
		return flyweight;
	}
	
	
	public int getFlyWeightSize()
    {
        return flyWeights.size();
    }
}
