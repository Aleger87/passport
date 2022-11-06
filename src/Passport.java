import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private final String passportNumber;
    private final String lastName;
    private final String firstName;
    private String patronymic;
    private final String birthDate;


    public Passport(String passportNumber, String lastName, String firstName, String birthDate) {
        this(passportNumber, lastName, firstName, null, birthDate);
    }

    public Passport(String passportNumber, String lastName, String firstName, String patronymic, String birthDate) {
        this.passportNumber = passportNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        PassportMethod.addPassport(this);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "pasportNumber='" + passportNumber + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumber, passport.passportNumber) && Objects.equals(lastName, passport.lastName) && Objects.equals(firstName, passport.firstName) && Objects.equals(patronymic, passport.patronymic) && Objects.equals(birthDate, passport.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber, lastName, firstName, patronymic, birthDate);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPasportNumber() {
        return passportNumber;
    }
    public String getPassportNumber() {
        return passportNumber;
    }

}
