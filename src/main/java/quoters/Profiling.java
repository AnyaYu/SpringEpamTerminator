package quoters;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//interface to write execution time to log
@Retention(RetentionPolicy.RUNTIME)
public @interface Profiling {
}
