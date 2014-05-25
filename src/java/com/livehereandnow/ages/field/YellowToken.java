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
public class YellowToken extends YellowTokenAbstract{

    @Override
    public boolean moveOneTokenFrom人力庫to工人區() {
        // 1 人力庫
        // 2 工人區
        Integer val人力庫;
        Integer val工人區;
        val人力庫 = (Integer)this.getMap().get(1);
        val工人區 = (Integer)this.getMap().get(2);
        System.out.print("before val人力庫="+val人力庫);
        System.out.println(" val工人區="+val工人區);
        this.getMap().put(1, val人力庫-1);
        this.getMap().put(2, val工人區+1);
    
        val人力庫 = (Integer)this.getMap().get(1);
        val工人區 = (Integer)this.getMap().get(2);        
        System.out.print("after val人力庫="+val人力庫);
        System.out.println(" val工人區="+val工人區);
        
        
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean moveOneTokenFrom工人區to人力庫() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean moveOneTokenFrom工人區to桌牌(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean moveOneTokenFrom桌牌to工人區(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean moveOneTokenFrom桌牌Xto桌牌Y(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
