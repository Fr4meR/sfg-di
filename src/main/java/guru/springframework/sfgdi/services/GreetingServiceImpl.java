package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * implementation of the greeting service
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
