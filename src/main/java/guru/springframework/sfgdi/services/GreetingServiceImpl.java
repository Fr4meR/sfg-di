package guru.springframework.sfgdi.services;

/**
 * implementation of the greeting service
 */
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
