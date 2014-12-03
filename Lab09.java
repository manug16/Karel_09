/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author <Manu Gualandri>
 * @version <25/11/2014>
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab09 {
    
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
		 Display.setSpeed(10);
       Athlete athena = new Athlete(1, 1, Display.EAST, 0);
       int beepers = 0;
       while(athena.nextToABeeper()) {
            athena.pickBeeper();
            beepers++;
       }
       athena.move();
       int p = 0;
       while(athena.nextToABeeper()) {
            athena.pickBeeper();
            p++;
       }
       for(int n = beepers; n > 0; n--) {
            athena.putBeeper();
            beepers--;
       }
       athena.move();
       while(athena.nextToABeeper()) {
            athena.pickBeeper();
            beepers++;
       }
       for(int z = p; z > 0; z--) {
            athena.putBeeper();
            p--;
       }
       athena.move();
       while(athena.nextToABeeper()) {
            athena.pickBeeper();
            p++;
       }
       for(int n = beepers; n > 0; n--) {
            athena.putBeeper();
            beepers--;
       }
       athena.move();
       while(athena.nextToABeeper()) {
            athena.pickBeeper();
            beepers++;
       }
       for(int z = p; z > 0; z--) {
            athena.putBeeper();
            p--;
       }
       athena.move();
       while(athena.nextToABeeper()) {
            athena.pickBeeper();
            p++;
       }
       for(int n = beepers; n > 0; n--) {
            athena.putBeeper();
            beepers--;
       }
       athena.move();
       while(athena.nextToABeeper()) {
            athena.pickBeeper();
            beepers++;
       }
       for(int z = p; z > 0; z--) {
            athena.putBeeper();
            p--;
       }
       athena.move();
       while(athena.nextToABeeper()) {
            athena.pickBeeper();
            p++;
       }
       for(int n = beepers; n > 0; n--) {
            athena.putBeeper();
            beepers--;
       }
       athena.move();
	 }
 }