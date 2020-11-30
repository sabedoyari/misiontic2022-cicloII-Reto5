package redflix;
import Vista.Ventana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("redflix")
public class BasicApplication {

	public static void main(String[] args) {
            System.out.println("Hola Mundo");
            new Ventana().setVisible(true);
	}
        
        public static void runSpringServer(String[] args) {
            /*
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                    .headless(false).run(args);
            */
            SpringApplication.run(BasicApplication.class, args);
        }
}