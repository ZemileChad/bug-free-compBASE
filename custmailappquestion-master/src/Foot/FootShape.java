/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Foot;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class FootShape {
    

    private Foot foot;
    
    public String drawAsEllipse(){
        foot = new Ellipse();
        return foot.draw();
    }
    public String drawAsRectangle(){
        foot = new Rectangle();
        return foot.draw();
    }
    
    public static void main(String[] args) {
        FootShape app = new FootShape();
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose foot type 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                System.out.println(app.drawAsEllipse()); 
                break;
            case 2:
                System.out.println(app.drawAsRectangle()); 
                break;          
        }
               
    }
}
    
