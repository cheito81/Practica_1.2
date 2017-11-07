/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import validation.ValidationForm;

/**
 * Test para validar datos de una persona
 * @author Jose, anas
 * @version 1.0 
 */
public class ej_8_test {
    
    public ej_8_test() {
    }
    

    @Test
    public void testNombre() {
        
         ValidationForm valid = new ValidationForm();
        boolean resultado = valid.areChars("jose1234");
        boolean esperado = false;
        
        assertEquals(resultado, esperado);
       
    }
      @Test
    public void testDni() {
        
         ValidationForm valid = new ValidationForm();
        boolean resultado = valid.isDni("12345678Z");
        boolean esperado = true;
        
        assertEquals(resultado, esperado);
       
    }
      @Test
    public void testPeso() {
        
         ValidationForm valid = new ValidationForm();
        boolean resultado = valid.isBetweenFloat(40, 30, 200);
        boolean esperado = true;
        
        assertEquals(resultado, esperado);
       
    }
    
       @Test
    public void testMail() {
        
         ValidationForm valid = new ValidationForm();
        boolean resultado = valid.isEmail("loko.com");
        boolean esperado = false;
        
        assertEquals(resultado, esperado);
       
    }

       @Test
    public void testEdad() {
        
         ValidationForm valid = new ValidationForm();
        boolean resultado = valid.isBetweenInt(20, 1, 100);
        boolean esperado = true;
        
        assertEquals(resultado, esperado);
       
    }
 
}
