package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws InterruptedException {

	    //3 phase constructor: Constructor, @PostConstruct, @AfterProxy

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"context.xml");

		context.getBean(Quoter.class).sayQuote();
	}
}
