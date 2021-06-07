package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by rb on 06/06/2021.
 */
@Controller
public class ConstructorInjectedController {
  private final GreetingService greetingService;

  public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
