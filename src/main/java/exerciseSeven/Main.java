package exerciseSeven;

import exerciseSeven.gun.Gun;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun(6);
        isGunLoaded(gun);
        gun.loadWithBullets(7);

        isGunLoaded(gun);

        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
    }

    private static void isGunLoaded(Gun gun) {
        System.out.println("Broń naładowana:" + gun.isLoaded());
    }

}
