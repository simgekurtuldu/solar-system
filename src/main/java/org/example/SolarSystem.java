package org.example;
public class SolarSystem {
    public static void main(String[] args) {

        for(Planets planet : Planets.values() ){
            System.out.println("Gezegenin uzaklık sıralaması: " + planet.getOrder());

            System.out.println(planet.getOrder()+". gezegenin güneşe olan uzaklığı: " + planet.getDistance());

            System.out.println(planet.getOrder()+". gezegenin yarıçapı: " + planet.getRadius());

            System.out.println(planet.getOrder()+". gezegenin dönme süresi: " + planet.getRotationTime());
        }
        System.out.println("-------------------");
    }
}
