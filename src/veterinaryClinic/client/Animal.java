package veterinaryClinic.client;

import veterinaryClinic.VeterynaryClinic;
import veterinaryClinic.owner.Owner;

public class Animal extends VeterynaryClinic {
    protected String nickName;
    protected Owner owner;
    protected String genus;


    public Animal(String genus,String nickname, Owner owner) {
        this.genus = genus;
        this.nickName = nickname;
        this.owner = owner;
    }
    public Animal(){
        this("неизвестен","неизвестна", new Owner("неизвестен"));}
    public Animal(String genus){
        this.genus = genus;
        this.nickName = "неизвестна";
        this.owner = new Owner();
    }


    @Override
    public String toString() {
        return String.format("Род животного = %s,Кличка = %s, хозяин = %s",genus,nickName,
                owner);
    }
}
