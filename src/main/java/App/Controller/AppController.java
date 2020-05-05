package App.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @RequestMapping("")
    public String welcome(){
        return "Welcome to the Recipe Book!";
    }
}
