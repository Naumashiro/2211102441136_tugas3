import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class Bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullets extends Props
{
    int speed = 12;
    public Bullets(){
        GreenfootImage img = this.getImage();
        img.scale(20, 20);
        this.setImage(img);
    }
    
    public Bullets(int bulletSpeed){
        GreenfootImage img = this.getImage();
        img.scale(15, 15);
        this.setImage(img);
        this.speed = bulletSpeed;
    }
    
    public void act()
    {
        this.move(speed);
        
        if(this.isAtEdge()){
            MyWorld wrld = (MyWorld)this.getWorld();
            wrld.incShotMiss();
            wrld.removeObject(this);
            
        }
    }
}
