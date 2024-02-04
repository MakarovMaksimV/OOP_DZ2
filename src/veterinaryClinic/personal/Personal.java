package veterinaryClinic.personal;

import veterinaryClinic.VeterynaryClinic;

public class Personal extends VeterynaryClinic {
    protected String specialization;
    protected String name;
    protected String title;
    protected Integer id;
    protected Integer phoneNumber;

    public Personal(String name, String title, Integer id, Integer phoneNumber) {
        this.specialization = "нет";
        this.name = name;
        this.title = title;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public Personal(String specialization,String name, String title, Integer id, Integer phoneNumber) {
        this.specialization = specialization;
        this.name = name;
        this.title = title;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Имя сотрудника = %s, должность = %s, специализация = %s, id = %s, номер телефона = %s",name, title, specialization, id, phoneNumber);
    }
}
