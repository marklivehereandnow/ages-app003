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
public abstract class YellowTokenAbstract extends Token {

    public YellowTokenAbstract() {
        this.setColor("Yellow");
        this.setTotalNumbers(25);

    }

    public abstract boolean moveOneTokenFrom人力庫to工人區();

    public abstract boolean moveOneTokenFrom工人區to人力庫();

    public abstract boolean moveOneTokenFrom工人區to桌牌(int id);
    public abstract boolean moveOneTokenFrom桌牌to工人區(int id);
public abstract boolean moveOneTokenFrom桌牌Xto桌牌Y(int x, int y);

    
}
