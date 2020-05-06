package App.Controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"*", "http://localhost:4200"})
@RestController
public class AppController {

    @RequestMapping("")
    public String welcome(){
        return "Welcome to the Recipe Book!";
    }
}
