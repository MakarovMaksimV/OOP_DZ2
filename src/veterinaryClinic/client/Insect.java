package veterinaryClinic.client;

import veterinaryClinic.client.clinetInterface.Flyable;
import veterinaryClinic.client.clinetInterface.Goable;
import veterinaryClinic.owner.Owner;

public class Insect extends Animal implements Goable, Flyable {
    public Insect(String genus,String nickname, Owner owner) {
        super(genus,nickname, owner);}

    public Insect() {
    }

    @Override
    public double fly() {
        System.out.println(genus + " летит со скоростью ");
        return 11;
    }

    @Override
    public double run() {
        System.out.println(genus + " бежит со скоростью ");
        return 0.3;
    }
}
