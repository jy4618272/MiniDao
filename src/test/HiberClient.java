package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import examples.dao.JeecgDemoDao;
import examples.entity.JeecgDemo;

public class HiberClient {
	public static void main(String args[]) {
		BeanFactory factory = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		JeecgDemoDao jeecgDemoDao = (JeecgDemoDao) factory.getBean("jeecgDemoDao");
		jeecgDemoDao.getCount();
		JeecgDemo s = jeecgDemoDao.getByIdHiber(JeecgDemo.class,"402880e7408f53a401408f53a5aa0000");
		if(s!=null){
			System.out.println(s.getUserName());
		}
	}
}
