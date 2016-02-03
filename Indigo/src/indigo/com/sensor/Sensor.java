/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indigo.com.sensor;

import java.net.URL;

/**
 *
 * @author Matt
 */
public interface Sensor
{
    public void setAddress(URL url);
    public URL getAddress();
    public String getData();
}
