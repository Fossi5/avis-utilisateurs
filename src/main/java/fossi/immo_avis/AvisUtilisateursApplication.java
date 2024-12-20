package fossi.immo_avis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AvisUtilisateursApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvisUtilisateursApplication.class, args);
    }
}