package com.dystify.kkdystrack3_common.module;


/**
 * Acts as a base for all modules, defining some basic 
 * @author Duemmer
 *
 */
public interface Module
{
  /**
   * Provides the core framework with this module's display name
   * @return a (constant) String that contains the display name of the module
   */
  public String moduleName();
  
  
  /**
   * Triggers the module to begin running. This call should be asynchronous.
   */
  public void start();
}
