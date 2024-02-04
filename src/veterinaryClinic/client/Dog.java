package veterinaryClinic.client;

import veterinaryClinic.client.clinetInterface.Goable;
import veterinaryClinic.client.clinetInterface.Swimable;
import veterinaryClinic.owner.Owner;

public class Dog  extends Animal implements Goable, Swimable {

    public Dog(String genus,String nickname, Owner owner) {
        super(genus,nickname, owner);
    }
    public Dog(){
    }

    @Override
    public double run() {
        System.out.println(genus +" бежит со скоростью ");
        return 20;
    }

    @Override
    public double swim() {
        System.out.println(genus +" плывёт со скоростью ");
        return 2;
    }
}
