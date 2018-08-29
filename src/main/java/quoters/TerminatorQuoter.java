package quoters;

import javax.annotation.PostConstruct;

@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {

	//InjectRandomInt is used to avoid different creations of random number
	@InjectRandomInt(min = 2, max = 7)
	private  int repeat;

	private String message;

	// <bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/>
	// should be added to context.xml to make init method work
	@PostConstruct
	public void init() {
		System.out.println("Phase 2");

		// Print repeat in init method as it can't be print in constructor
		// (repeat is not yet initialized when constructor is called)
		System.out.println(repeat);
	}

	public TerminatorQuoter() {
		System.out.println("Phase 1");
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@PostProxy
	public void sayQuote() {
		System.out.println("Phase 3");
		for (int i = 0; i < repeat; i++) {
			System.out.println("message = " + message);
		}
	}
}
