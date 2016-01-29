/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indigo.com.sensor;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Matt
 */
public class IPCamera
{
    private String ipAddress = null;
    private URL url = null;
    
    IPCamera(String address)
    {
        ipAddress = address;
    }
    public void connect()
    {
        try {
            url = new URL(ipAddress);
        } catch (MalformedURLException ex) {
            System.out.println("Camera failed to connect at :" + ipAddress);
        }
    }
    public BufferedImage getBufferedImage() throws IOException
    {
        return ImageIO.read(url);
    }
}
