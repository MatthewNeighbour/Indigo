/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indigo.com.sensor;

import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class SystemOutput
{
    private Scanner scan = new Scanner(System.in);
    public String getOutput()
    {
        return scan.next();
    }
}
