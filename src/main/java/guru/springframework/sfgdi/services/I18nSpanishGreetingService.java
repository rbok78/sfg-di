package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by rb on 07/06/2021.
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hola Mundo - ES";
  }
}
