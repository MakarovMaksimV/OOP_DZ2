package veterinaryClinic.owner;

import veterinaryClinic.VeterynaryClinic;

import java.util.ArrayList;

public class Owner extends VeterynaryClinic {
    String name;
    public Owner(String name) {
        this.name = name;
        owner(name);
    }
    public Owner() {
        this.name = "неизветен";
    }

    public void owner(String name) {
        ArrayList<String> ownerName = new ArrayList<>();
        ownerName.add(name);
//        for (int i = 0; i < ownerName.size(); i++) {
//            System.out.println(ownerName.get(i));
//        }
    }

    @Override
        public String toString () {
        return String.format("%s ", name);
        }
}
