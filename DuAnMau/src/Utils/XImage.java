/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class XImage {
    public static Image getApplcon(){
        URL url=XImage.class.getResource("/icon/icon-bao-hanh.png");
        return new ImageIcon(url).getImage();
    }
}
