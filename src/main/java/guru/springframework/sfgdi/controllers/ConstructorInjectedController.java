package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * example of dependency injection via constructor
 */
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
