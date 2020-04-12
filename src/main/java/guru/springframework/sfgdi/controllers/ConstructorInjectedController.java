package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * example of dependency injection via constructor
 */
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    /**
     * Constructor
     * @param greetingService
     *      A {@link GreetingService}
     */
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    /**
     * @return
     *      A greeting
     */
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
