package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by rb on 06/06/2021.
 */
@Service
public class SetterInjectedGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - Setter";
  }
}
