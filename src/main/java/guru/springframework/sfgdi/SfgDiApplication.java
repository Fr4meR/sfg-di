package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		//get a Controller from the application context and use a method of the controller
		//notice: there is no explicit new keyword here.. spring framework is managing
		//the object of MyController
		MyController myController = (MyController) ctx.getBean("myController");
		String hello = myController.sayHello();
		System.out.println(hello);
	}
}
