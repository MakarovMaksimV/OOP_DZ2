package veterinaryClinic.personal;

import veterinaryClinic.personal.personalInterface.Diagnosis;
import veterinaryClinic.personal.personalInterface.Healing;
import veterinaryClinic.personal.personalInterface.Operation;
import veterinaryClinic.personal.personalInterface.PatientDischarge;

import java.util.HashMap;
import java.util.Map;

public class Doctor extends Personal implements Diagnosis, Healing, Operation, PatientDischarge {

    public Doctor(String specialization, String name, String title, Integer id, Integer phoneNumber) {
        super(specialization,name,title,id,phoneNumber);
    }

    @Override
    public void diagnosis() {
        System.out.println(specialization + " " + name + " ставит диагноз");
    }

    @Override
    public void healing() {
        System.out.println(specialization + " " + name + " лечит пациента");
    }

    @Override
    public void operation() {
        System.out.println(specialization + " " + name + " оперирует");
    }

    @Override
    public void dischargeOfThePatient() {
        System.out.println(specialization + " " + name + " выписывает пациента");

    }
}
