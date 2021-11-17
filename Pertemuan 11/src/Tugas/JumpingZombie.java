/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ddiko
 */
public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health *= 1.3;
                break;
            case 2:
                health *= 1.4;
                break;
            case 3:
                health *= 1.5;
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 10 / 100;
    }

    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}
