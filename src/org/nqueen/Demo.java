/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nqueen;

/**
 *
 * @author David Nobel Sihite
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BackTrackAlgorithm backTrackAlgorithm = new
        BackTrackAlgorithm(7);
        int[] solusiBackTrackAlgorithm = backTrackAlgorithm.routeUseBackTrack();
        System.out.println(BackTrackAlgorithm.getInformation());
    }
}
