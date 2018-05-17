package app.error;

import org.springframework.web.bind.annotation.RequestMapping;

import app.exception.ResourceNotFoundException;

public class ErrorController {

	@RequestMapping("/error")
    public ResourceNotFoundException index() {
        throw new ResourceNotFoundException();
    }
    
}
