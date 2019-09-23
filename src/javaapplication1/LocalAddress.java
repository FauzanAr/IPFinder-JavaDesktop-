/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.net.InetAddress;

/**
 *
 * @author FauzanAr
 */
public class LocalAddress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress address;
            address = InetAddress.getLocalHost();
            
            System.out.println(address);
        } catch (Exception e) {
            System.out.println("Local Address tidak ditemukan");
        }
    }
    
}
