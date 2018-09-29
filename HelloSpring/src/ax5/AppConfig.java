package ax5;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //we can also write @Component here, the result will be the same
@ComponentScan("ax5") //java based configuration
public class AppConfig {

}
