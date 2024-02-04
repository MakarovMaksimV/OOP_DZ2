package veterinaryClinic.personal;

import veterinaryClinic.personal.personalInterface.Operation;

public class Nurse extends Personal implements Operation {

    public Nurse(String name, String titile, Integer id, Integer phoneNumber) {
        super(name,titile,id,phoneNumber);
    }

    @Override
    public void operation() {
        System.out.println(title + " " + name + " ассистирует");
    }
}
