package veterinaryClinic;

import veterinaryClinic.client.*;
import veterinaryClinic.owner.Owner;
import veterinaryClinic.personal.Administrator;
import veterinaryClinic.personal.Doctor;
import veterinaryClinic.personal.Nurse;
import veterinaryClinic.personal.Personal;

import java.util.ArrayList;

public class VeterynaryClinic {
    public  void veterynaryClinic() {

        ArrayList<Animal> animals = new ArrayList<>();
        Animal bird = new Bird("Орёл");
        animals.add(bird);
        Animal cat = new Cat("Кот","Филипп",new Owner("Елена"));
        animals.add(cat);
        Animal dog = new Dog("Собака","Купер",new Owner("Катя"));
        animals.add(dog);
        Animal fish = new Fish("Рыба","Золотая рыбка",new Owner("Костя"));

        animals.add(fish);
        Animal insect = new Insect("Таракан","Шухер",new Owner("Игорь"));
        animals.add(insect);

        for(int i = 0; i<animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println(((Bird) bird).fly());
        System.out.println(((Bird) bird).run());
        System.out.println(((Cat) cat).run());
        System.out.println(((Cat) cat).swim());
        System.out.println(((Dog) dog).run());
        System.out.println(((Dog) dog).swim());
        System.out.println(((Fish) fish).swim());
        System.out.println(((Insect) insect).fly());
        System.out.println(((Insect) insect).run());


        ArrayList<Personal> personal = new ArrayList<>();
        Administrator administrator = new Administrator("Наталья Леонидовна Заявкина",
                "Администратор",8768123,123478765);
        personal.add(administrator);
        Doctor doctor = new Doctor("Хирург","Ломалкин Андрей Сергеевич", "Доктор",23456789,
                91456743);
        personal.add(doctor);
        Nurse nurse = new Nurse("Лечилина Анна Васильевна","Медсестра", 12342345,911345672);
        personal.add(nurse);

        administrator.registration();
        doctor.diagnosis();
        doctor.healing();
        if(personal.contains(nurse))
        {
            doctor.operation();
            nurse.operation();
        }
        else{
            System.out.println("Не могу проводить оперецию без асcистента");
        }
        doctor.dischargeOfThePatient();
    }
}
