package TestApp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Department.Department;
import Emploee.Emploee;

public class Test {

	public static void main(String[] args) {
		//classpathxmlapplicationcontext只能读取在src目录下的文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		Department department = (Department) ac.getBean("depart");
		String[] strings = department.getStrings();
		System.out.println(strings);
		
		List<Emploee> list = department.getList();
		System.out.println(list);
		
		Set<Emploee> set = department.getSet();
		System.out.println(set);
		
		Map<String, Emploee> map = department.getMap();
		System.out.println(map);
		
		Properties properties = department.getProperties();
		System.out.println(properties);
		
		Emploee emploee = department.getEmploee();
		System.out.println(emploee.getId());
	}

}
