/*
Exercise in java.
Created 2019-10-17
Programmer Pierre Lundström
*/
import java.util.*;
import javax.swing.*;

public class Uppgift43 {
    public static void main(String[] args) {
	    int E = 25;
		int D = 30;
		int C = 35;
		int B = 40;
		int A = 45;
		int maxPoints = 50;
		int userPoints;
		String userGrade = "";
		userPoints = Integer.parseInt(JOptionPane.showInputDialog("How many points did you get on your test?"));
		if (userPoints < 25) {
		userGrade = "F";
		JOptionPane.showMessageDialog(null, "Your grade is " + userGrade);
		} else if (userPoints >= 25 && (userPoints < 30)) {
		userGrade = "E";
		JOptionPane.showMessageDialog(null, "Your grade is " + userGrade);
		} else if (userPoints >= 30 && (userPoints < 35)) {
		userGrade = "D";
		JOptionPane.showMessageDialog(null, "Your grade is " + userGrade);
		} else if (userPoints >= 35 && (userPoints < 40)) {
		userGrade = "C";
		JOptionPane.showMessageDialog(null, "Your grade is " + userGrade);
		} else if (userPoints >= 40 && (userPoints < 45)) {
		userGrade = "B";
		JOptionPane.showMessageDialog(null, "Your grade is " + userGrade);
		} else if (userPoints >= 45 && (userPoints <= 50)) {
		userGrade = "A";
		JOptionPane.showMessageDialog(null, "Your grade is " + userGrade);
		} else {
		JOptionPane.showMessageDialog(null, "Max points are " + maxPoints);

		}
    }
}