package com.example.betterraycastingthethird;

public class Camera {
    public double posX, posY; //Camera position variables
    public double dirX, dirY; //Camera angle variables
    public double planeX, planeY; //2D version of the room.

    public double time = 0, oldTime = 0; //time of current and previous frame.

    public Camera(double posX, double posY, double dirX, double dirY, double planeX, double planeY) {
        this.posX = posX; this.posY = posY; //location set
        this.dirX = dirX; this.dirY = dirY; //direction set
        this.planeX = planeX; this.planeY = planeY; //camera plane set
    }

}
