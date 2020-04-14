package guru.springframework.sfgdi;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		FakeDataSource dataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(dataSource.getUserName());
		System.out.println(dataSource.getPassword());
		System.out.println(dataSource.getUrl());
	}
}
