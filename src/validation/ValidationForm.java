/**
 * Valida campos de los formularios
 * @name ValidationForm.java
 * @author José Giménez
 * @version 1.2
 * @date 2017-11-03
 */
package validation;

import static java.lang.Integer.parseInt;

public class ValidationForm {

  /**
   * Validate a simple integer number
   *
   * @param value
   * @return true or false
   */
  public static boolean isInteger(String value) {
    boolean flag = true;
    try {
      int result = parseInt(value);
    } catch (NumberFormatException error) {
      flag = false;
    }
    return flag;
  }

  /**
   * Validate a simple rational number
   *
   * @param value
   * @return true or false
   */
  public static boolean isDouble(String value) {
    boolean flag = true;
    try {
      double result = Double.parseDouble(value);
    } catch (NumberFormatException error) {
      flag = false;
    }
    return flag;
  }

  /**
   * Validate an array of strings, check if they are integers or rational
   * numbers,if you do not count them as error
   *
   * @param values
   * @return the number of errors in the string
   */
  public static double[] areValidNumbers(String[] values) { // Rational an integer
    double[] aux = new double[values.length];
    int error = 0;
    for (int i = 0; i < values.length; i++) {
      if (isDouble(values[i])) {
        aux[i] = Double.parseDouble(values[i]);
      } else {
        error++;
      }
    }
    double[] result = new double[values.length - error];
    for (int j = 0; j < result.length; j++) {
      result[j] = aux[j];
    }
    return result;
  }

  /**
   * Check if a "number int" is within the range of "min" to "max".
   *
   * @param number the number to check
   * @param min the minimum value of the range
   * @param max the maximum value of the range
   * @return true or false
   */
  public static boolean isBetweenInt(int number, int min, int max) {
    boolean flag = false;
    if (number >= min && number <= max) {
      flag = true;
    }
    return flag;
  }
  /**
   * Check if a "number" float is within the range of "min" to "max".
   *
   * @param number the number to check
   * @param min the minimum value of the range
   * @param max the maximum value of the range
   * @return true or false
   */
  public static boolean isBetweenFloat(float number, int min, int max) {
    boolean flag = false;
    if (number >= min && number <= max) {
      flag = true;
    }
    return flag;
  }

  /**
   * Check if a string is made up of only letters
   *
   * @param enterString contains strng data to check
   * @return true or false
   */
  public static boolean areChars(String enterString) {
    if (enterString.matches("[^0-9()|]{1,}")) {
      return true;
    } else {
      return false;
    }
  }
  /**
   * valida que un  string no tenga espacios
   * @param enterString
   * @return true si no contiene espacios, false si contiene. 
   */
 public static boolean withoutSpaces(String enterString) {
     
    if (enterString.indexOf(32) == -1) {
      return true;
    } else {
      return false;
    }
  }
  /**
   * Checks an input string to verify that it matches the email format
   *
   * @param enterString
   * @return true or false
   */
  public static boolean isEmail(String enterString) {
    if (enterString.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$")) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Check an input string to verify that it matches the dni format
   *
   * @param enterString
   * @return true or false
   */
  public static boolean isDni(String enterString) {
    boolean flag = false;
    enterString=enterString.toUpperCase();
    if (enterString.matches("[0-9]{8}[A-Z]{1}")) {
      String dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE";
      if (dniLetters.charAt(Integer.parseInt(enterString.substring(0, enterString.length() - 1)) % 23) == enterString.charAt(enterString.length() - 1)) {
        flag = true;
      }
    }
    return flag;
  }
}
