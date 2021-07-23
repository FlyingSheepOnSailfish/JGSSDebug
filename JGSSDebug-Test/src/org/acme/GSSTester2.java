package org.acme;

import org.ietf.jgss.GSSManager;

public class GSSTester2 {
  
  public static void main(String[] args) {
    System.out.println("hello before");
    GSSManager gssManager = GSSManager.getInstance();
    System.out.println("hello after");   
  }

}
