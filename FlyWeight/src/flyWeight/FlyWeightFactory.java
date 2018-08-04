package flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ԫ������ɫ
 * @author swh
 *
 */
public class FlyWeightFactory {
	// ��Ԫ��
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
