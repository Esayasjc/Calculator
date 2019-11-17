/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calci;

import java.rmi.registry.Registry;

/**
 *
 * @author Esayas
 */
public class CalciServer {
    public static void main(String args[]){
    try{
        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
        r.rebind("Calci", new CalciRmi());
        System.out.println("Server connected");
    
}catch(Exception e)
{
    System.out.println("Server not connected "+e);
}
}
}
