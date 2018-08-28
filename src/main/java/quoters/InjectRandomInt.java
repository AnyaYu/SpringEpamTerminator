package quoters;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//It's important to set retention policy to RUNTIME to make annotation visible in Runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectRandomInt {
    int min();
    int max();
}
