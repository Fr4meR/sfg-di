package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * this controller uses spring profiles to determine the language of the greeting to return
 */
@Controller
public class I18nController {

    private final GreetingService greetingService;

    /**
     * Constructor
     * @param greetingService
     *      A {@link GreetingService}
     */
    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    /**
     * @return
     *      A greeting
     */
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
