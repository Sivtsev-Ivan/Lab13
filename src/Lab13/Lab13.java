package Lab13;

import java.awt.*;
import java.awt.event.*;

public class Lab13 extends Frame{
    Lab13(String s){
        super(s);
        setSize(400,150);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void  windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Lab13("Moya programa");
    }
}
