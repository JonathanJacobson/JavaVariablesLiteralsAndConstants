package com.example;

import javax.swing.*;
import java.util.Arrays;

public class Variables
{
    public static void main(String[] args)
    {
        String firstName;
        firstName = JOptionPane.showInputDialog("Please enter your first name");
        String lastName;
        lastName = JOptionPane.showInputDialog("Please enter your first name");
        String greeting = ("Hello " + firstName + " " + lastName);

        JOptionPane.showMessageDialog(null, greeting);

        int firstNumber;
        int secondNumber;
        String input;
        input = JOptionPane.showInputDialog("Please enter your first number");
        firstNumber = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Please enter your second number");
        secondNumber = Integer.parseInt(input);
        //double average = (firstNumber + secondNumber) / 2.0;
        double average = (double) (firstNumber + secondNumber) / 2;

        JOptionPane.showMessageDialog(null, "average: " + (average));
    }
}
