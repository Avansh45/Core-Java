package DeepCopyPractice;

import DeepCopyPractice.Mobile.Specifications;

public class MobileMain {
    public static void main(String[] args) throws CloneNotSupportedException{
        
        
        Mobile mob = new Mobile(25864, "Samsung", 2021);

        Specifications spec = mob.new Specifications("Snapdragon 8 Gen 2", 12, 256, "5000mAh");
        mob.spec = spec;

        System.out.println("original Mobile : "+mob);

        Mobile clonedmob = (Mobile)mob.clone();
        clonedmob.spec.ram = 24;
        clonedmob.spec.battery = "6000mAh";

        System.out.println("original Mobile : "+mob);
        System.out.println("Cloned Mobile : "+clonedmob);
        
    }
}
