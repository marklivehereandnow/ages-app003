/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livehereandnow.ages.field;

/**
 *
 * @author mark
 */
public class YellowTokenTest {
    public static void main(String[] args){
        YellowToken yellowToken=new YellowToken();
        yellowToken.getMap().put(1010, 1);
        yellowToken.getMap().put(1007, 2);
        yellowToken.getMap().put(1032, 2);
        yellowToken.getMap().put(1018, 1);
        yellowToken.getMap().put(2, 1);
        yellowToken.getMap().put(1, 18);
       
        System.out.println(""+yellowToken.getMap().toString());
        yellowToken.moveOneTokenFrom人力庫to工人區();
        System.out.println(""+yellowToken.getMap().toString());
        
                
    }
}
