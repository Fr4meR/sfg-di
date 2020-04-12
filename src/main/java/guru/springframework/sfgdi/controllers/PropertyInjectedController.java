package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Example of an dependency getting injected by property.
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    /**
     * @return
     *      A Greeting
     */
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
