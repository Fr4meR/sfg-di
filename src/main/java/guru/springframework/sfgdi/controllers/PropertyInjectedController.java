package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Example of an dependency getting injected by property.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    /**
     * @return
     *      A Greeting
     */
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
