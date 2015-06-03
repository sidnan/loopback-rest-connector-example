/**
 * 
 */
package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Entry point. Base main class.
 * 
 * @author snandagopal
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
