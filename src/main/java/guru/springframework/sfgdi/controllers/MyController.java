package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Example Controller class
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    /**
     * Constructor
     * @param greetingService
     *      A {@link GreetingService}
     */
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    /**
     * Example method for saying hello
     * @return
     *      A string that says hello
     */
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
