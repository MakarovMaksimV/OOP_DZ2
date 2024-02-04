package veterinaryClinic.client;

import veterinaryClinic.client.clinetInterface.Swimable;
import veterinaryClinic.owner.Owner;

public class Fish extends Animal implements Swimable {

    public Fish() {
    }

    public Fish(String genus,String nickName, Owner owner) {
        this.genus = genus;
        this.nickName = nickName;
        this.owner = owner;
    }

    @Override
    public double swim() {
        System.out.println(genus + " плывёт со скоростью ");
        return 8;
    }
}
