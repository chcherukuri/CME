/* Notice: This software is proprietary to CME, its affiliates, partners and/or
 *  licensors.  Unauthorized copying, distribution or use is strictly 
 *  prohibited.  All rights reserved. */
package com.cme.qa.techChallenge;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.FixMethodOrder;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Order and execute tests by Method name 

public class PasswordValidatorTest {
  
//insert additonal test code here

  @Test
  public void test1_ValidatePasswordsNotSame() throws Exception {
    PasswordValidator validator = new PasswordValidator();

    String newPassword = null;
    String confirmPassword = null;
    assertFalse(validator.validatePasswordsNotSame(newPassword, confirmPassword));

    newPassword = "XXXXXXXX";
    assertFalse(validator.validatePasswordsNotSame(newPassword, confirmPassword));

    confirmPassword = "XXXXXXXX";
    assertFalse(validator.validatePasswordsNotSame(newPassword, confirmPassword));

    newPassword = "ABCD1234";
    confirmPassword = "XXXXXXXX";
    assertTrue(validator.validatePasswordsNotSame(newPassword, confirmPassword));

  }


  @Test
  public void test2_ValidatePasswordLength() throws Exception {
      PasswordValidator validator = new PasswordValidator();
  
      // Test short password length(less than 8 characters)
      String newPassword = "Test@01";
      String confirmPassword = "Test@01";
      assertFalse("Password length should be at least 8 characters", validator.validatePasswordLength(newPassword, confirmPassword) );
  
      // Test valid password length (More than 8 Characters) 
    
      newPassword = "Chandu@01";
      confirmPassword = "Chandu@01";
      assertTrue("Password length should be valid", validator.validatePasswordLength(newPassword, confirmPassword));
    
    }



    @Test
    public void test5_ValidatePasswordContainsSpecialCharacter() throws Exception {
        PasswordValidator validator = new PasswordValidator();
      
        // Test password without special characters
        String newPassword = "Chandu01";
        String confirmPassword = "Chandu01";
        assertFalse("Password should contain at least one special character", validator.validatePasswordContainsSpecialCharacter(newPassword, confirmPassword));
      
        // Test password with special characters
        
        newPassword = "Chandu@01";
        confirmPassword = "Chandu@01";
        assertTrue("Password should contain at least one special character", validator.validatePasswordContainsSpecialCharacter(newPassword, confirmPassword));

      }
  

    
   @Test
     public void test4_ValidatePasswordContainsNumber() throws Exception {
     PasswordValidator validator = new PasswordValidator();

    // Test password without Numbers
    String newPassword = "Chandra@";
    String confirmPassword = "Chandra@";
    assertFalse("Password should contain at least one number", validator.validatePasswordContainsNumber(newPassword, confirmPassword));

    // Test password with Numbers

    newPassword = "Chandra@1";
    confirmPassword = "Chandra@1";
    assertTrue("Password should contain at least one number", validator.validatePasswordContainsNumber(newPassword, confirmPassword));

     }


  
  
    @Test
    public void test3_ValidatePasswordWithASCII() throws Exception {
        PasswordValidator validator = new PasswordValidator();
    
    // Test password with out all Valid data (Letters, numbers, special characters) 
    String newPassword = "Chandra";
    String confirmPassword = "Chandra";
    assertFalse("Password should be valid with ASCII", validator.validatePasswordContainsNumber(newPassword, confirmPassword));

    // Test Password with all Valid data (Letters, numbers, special characters)

    newPassword = "Trump@TheBoss007";
    confirmPassword = "Trump@TheBoss007";
      assertTrue("Password should be valid with ASCII", validator.validatePasswordASCII(newPassword, confirmPassword));
    
        
    }
   


}












