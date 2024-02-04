package veterinaryClinic.personal;

import veterinaryClinic.personal.personalInterface.Registration;

public class Administrator extends Personal implements Registration {

    public Administrator(String name, String title, Integer id, Integer phoneNumber) {
        super(name,title,id,phoneNumber);
    }
    @Override
    public void registration() {
        System.out.println(title + " " + name + " регистрирует пациента");
    }
}
