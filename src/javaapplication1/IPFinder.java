/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;


/**
 *
 * @author FauzanAr
 */
public class IPFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		InetAddress address;

		System.out.print ("\n\n Masukan Nama host : ");
        String host = input.next();

		try {
			address = InetAddress.getByName(host);
			System.out.print (" Ip Address : " +address.toString());
		} catch (UnknownHostException uhEh) {
			System.out.print (" Host tidak ditemukan " + host);
		}
    }
    
}
