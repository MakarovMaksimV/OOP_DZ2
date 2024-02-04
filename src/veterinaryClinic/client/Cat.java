package veterinaryClinic.client;

import veterinaryClinic.client.clinetInterface.Goable;
import veterinaryClinic.client.clinetInterface.Swimable;
import veterinaryClinic.illness.Illness;
import veterinaryClinic.owner.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Swimable {
    public Cat(String genus,String nickname, Owner owner) {
        super(genus,nickname, owner);
    }
    public Cat(){
    }
    @Override
    public double run() {
        System.out.println(genus +" бежит со скоростью ");
        return 14;
    }
    @Override
    public double swim() {
        System.out.println(genus +" плывёт со скоростью ");
        return 1;
    }
}
