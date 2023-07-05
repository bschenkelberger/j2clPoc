package de.bs.j2cl.poc;

import org.treblereel.j2cl.processors.annotations.GWT3Export;
import java.util.logging.Logger;

public class UserValidation {

  Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  @GWT3Export
  public Boolean checkMinlengthFirstName(String name) {
    Boolean result = true;
    if (name.length() <= 3) {
      result = false;
    }
    return result;
  }

  @GWT3Export
  public Boolean validAge(User user) {
    Boolean result = true;
    if (user.getAge() < 18) {
      result = false;
    }
    return result;
  }
}
