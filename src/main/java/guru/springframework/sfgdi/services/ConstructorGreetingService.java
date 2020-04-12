package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * implementation of the greeting service for usage via constructor dependency injection
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
