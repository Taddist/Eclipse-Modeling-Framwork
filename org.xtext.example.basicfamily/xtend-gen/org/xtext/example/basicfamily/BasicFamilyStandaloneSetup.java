/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.basicfamily;

import org.xtext.example.basicfamily.BasicFamilyStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BasicFamilyStandaloneSetup extends BasicFamilyStandaloneSetupGenerated {
  public static void doSetup() {
    new BasicFamilyStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
