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
public class KnightDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Quest quest = null;
        if (args.length > 0) {
            quest = (Quest) Class.forName(args[0]).newInstance();
        }
        Knight knight = new Knight();
        knight.setQuest(quest);
        System.out.println(knight.goQuest());
    }

}
