package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by rb on 05/06/2021.
 */
@Service
public class ConstructorInjectedGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - Constructor";
  }
}
