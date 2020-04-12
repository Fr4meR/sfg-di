package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * A {@link GreetingService} for dependency injection via property
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
