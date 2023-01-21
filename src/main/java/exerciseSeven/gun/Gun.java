package exerciseSeven.gun;

import java.util.ArrayList;
import java.util.List;

public class Gun {

    private int maxMagazineSize;
    private List<String> magazine = new ArrayList<>();

    public Gun(int magazineSize){
        this.maxMagazineSize = magazineSize;
    }


    public void loadBullet(String bulletName) {
        if (maxMagazineSize <= magazine.size()){
            System.out.println("Przekroczono limit pocisków");
            return;
        }
        magazine.add(bulletName);
        System.out.println(magazine);
    }
    public boolean isLoaded(){
        if (magazine.size() > 0){
            return true;
        }else {
            return false;
        }
    }
    public void shot(){
        if (isLoaded()){
            System.out.println("Pif paf! " + magazine.remove(magazine.size() - 1));
        }else{
            System.out.println("Magazynek jest pusty");
        }
    }
    public void loadWithBullets(int numberOfBullets){
        for (int i=0; i <= numberOfBullets; i++ ){
            loadBullet("Bullet " + i);
        }
    }
}
