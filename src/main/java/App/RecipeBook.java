package App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// this class MUST BE IN A PACKAGE otherwise it cannot run!
@SpringBootApplication
public class RecipeBook {

    public static void main(String[] args) {
        SpringApplication.run(RecipeBook.class, args);
    }

}
