package Department;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import Emploee.Emploee;

public class Department {
	
	private String[] strings;
	private List<Emploee> list;
	private Set<Emploee> set;
	private Map<String, Emploee> map;
	private Properties properties;
	//自动注解
	//当有多个类型时，同时指定名称
	@Autowired
	@Qualifier("emp2")
	private Emploee emploee;
	
	public Emploee getEmploee() {
		return emploee;
	}
	public String[] getStrings() {
		return strings;
	}
	public void setStrings(String[] strings) {
		this.strings = strings;
	}
	public List<Emploee> getList() {
		return list;
	}
	public void setList(List<Emploee> list) {
		this.list = list;
	}
	public Set<Emploee> getSet() {
		return set;
	}
	public void setSet(Set<Emploee> set) {
		this.set = set;
	}
	public Map<String, Emploee> getMap() {
		return map;
	}
	public void setMap(Map<String, Emploee> map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
