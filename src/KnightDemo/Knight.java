/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KnightDemo;

/**
 *
 * @author Ghost
 */
public class Knight {

    private Quest quest;

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public String goQuest() {
        return quest.goQuest();
    }
}
