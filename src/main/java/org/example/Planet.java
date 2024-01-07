package org.example;


enum Planets {
    MERKUR(1, 57.91,2439.7, 58.6),
    VENUS(2,108.2, 6051.8, 243.0),
    DUNYA(3,149.6, 6371.0, 1.0),
    MARS(4,227.9, 3389.5, 1.0),
    JUPITER(5,778.3, 69911, 0.41),
    SATURN(6,1420, 58232, 0.43),
    URANUS(7,2870, 25362, 0.72),
    NEPTUN(8,4500, 24622,0.62);

    private int order;
    private double distance;
    private double radius;
    private double rotationTime;
    Planets(int order, double distance, double radius, double rotationTime) {
        this.order = order;
        this.distance= distance;
        this.radius=radius;
        this.rotationTime=rotationTime;
    }
    public int getOrder(){
        return order;
    }
    public double getDistance(){
        return distance;
    }
    public double getRadius(){
        return radius;
    }
    public double getRotationTime(){
        return rotationTime;
    }
}