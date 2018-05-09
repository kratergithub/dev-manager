package app.error;

import org.springframework.web.bind.annotation.RequestMapping;

public class ErrorController {

	@RequestMapping("/errors")
    public String index() {
        return "ERROR";
    }
    
}
