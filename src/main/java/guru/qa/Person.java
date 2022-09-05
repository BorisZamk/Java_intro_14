package guru.qa;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private int personID;
    private String firstName;
    private String secondName;
    private LocalDate bDay;
    private String treatment;

    public Person(String firstName, String secondName, LocalDate bDay) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.bDay = bDay;
        this.personID = setID();
    }

    private int setID (){
        //преобразуем текущую дату в Int для имитации генерации "уникального" ID
        LocalDate toDay = LocalDate.now();
        int intYear = toDay.getYear();
        int intMonth = toDay.getMonthValue();
        int intDay = toDay.getDayOfMonth();
        String sID = String.valueOf(intYear) + String.valueOf(intMonth) + String.valueOf(intDay);

        return Integer.valueOf(sID);
    }

    public int GetAge (){
        //Вычисляем возраст персоны
        LocalDate toDay = LocalDate.now();
        Period p;

        p = Period.between(bDay, toDay);
        return p.getYears();
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getFullName() {
        String fullName = this.firstName + ' ' + this.secondName;

        return fullName;
    }

    public int getPersonID() {
        return personID;
    }
}
