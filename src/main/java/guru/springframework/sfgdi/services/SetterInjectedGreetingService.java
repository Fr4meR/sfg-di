package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * A {@link GreetingService} to use with dependency injection via setter.
 */
@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}