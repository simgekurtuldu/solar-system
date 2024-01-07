package org.example;
public class SolarSystem {
    public static void main(String[] args) {
        Planets planet1 = Planets.VENUS;

        System.out.println("Gezegenin uzaklık sıralaması: " + planet1.getOrder());

        System.out.println(planet1.getOrder()+". gezegenin güneşe olan uzaklığı: " + planet1.getDistance());

        System.out.println(planet1.getOrder()+". gezegenin yarıçapı: " + planet1.getRadius());

        System.out.println(planet1.getOrder()+". gezegenin dönme süresi: " + planet1.getRotationTime());

    }
}
