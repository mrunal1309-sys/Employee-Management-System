package employee.management.system;


import javax.swing.*;
import java.awt.Image;

public class Splash extends JFrame{


    Splash(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));//To set the image in the frame
        Image i2 = i1.getImage().getScaledInstance(1170,650,Image.SCALE_DEFAULT);//To set the size of the image
        ImageIcon i3 = new ImageIcon(i2);//To set the image in the frame
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1170,650);//To set the size of the image
        add(image);//To add the image in the frame








        setSize(1170, 650);//To set the size of the frame
        setLocation(200, 50);//To set the location of the frame
        setLayout(null);
        setVisible(true);// Is class mein apko visible hona hai (To make the frame visible)

        try{
            Thread.sleep(5000);
            setVisible(false);//To close the frame after 5 seconds
            new Login();//To open the login page after closing the splash page



        }catch(Exception e){
            e.printStackTrace();
        }


    }
    public static void main(String args[]){
        new Splash();


    }
}
