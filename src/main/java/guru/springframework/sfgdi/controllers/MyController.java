package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Example Controller class
 */
@Controller
public class MyController {

    /**
     * Example method for saying hello
     * @return
     *      A string that says hello
     */
    public String sayHello(){
        System.out.println("Hello World!");
        return "Hi Folks!";
    }
}
