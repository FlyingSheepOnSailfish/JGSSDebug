package org.nadir;

import org.ietf.jgss.GSSManager;

public class GSSTester1 {
  
  public static void main(String[] args) {
    System.out.println("hello before");
    GSSManager gssManager = GSSManager.getInstance();
    System.out.println("hello after");   
  }

}
