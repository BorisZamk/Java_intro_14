package guru.qa;

import java.time.LocalDate;

public class FirstProgram {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1984, 6, 9);
        Person pBoris = new Person("Boris", "Zam",birthday);
        pBoris.setTreatment("Massage");

        System.out.println("Полное имя пациента: " + pBoris.getFullName()+ "\n"
                + "ID пациента: " + pBoris.getPersonID() + "\n"
                + "Возраст пациента: " + pBoris.GetAge() + "\n"
                + "Назначеное лечение: " + pBoris.getTreatment());

    }
}
