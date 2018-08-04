package structure;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;
import element.Element;

public class ObjectStructure {
	private List<Element> elements = new ArrayList<>();
	
	public void attach(Element e){
		elements.add(e);
	}
	
	public void detach(Element e){
		elements.remove(e);
	}
	
	
	public void accept(Visitor visitor){
		for(Element e:elements){
			e.Accpet(visitor);
		}
	}
}
