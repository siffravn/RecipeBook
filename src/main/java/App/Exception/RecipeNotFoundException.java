package App.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such recipe")
public class RecipeNotFoundException extends RuntimeException {

    public RecipeNotFoundException(){
        super();
    }
}
