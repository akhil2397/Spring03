package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("BeansConfig.xml");
		  ATM atm = context.getBean(ATM.class);
		 String status = atm.withdrawal();
		 System.out.println(status);

	}

}
