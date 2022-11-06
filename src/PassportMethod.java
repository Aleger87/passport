import java.util.*;

public class PassportMethod {
    public static Map<String, Passport> passports = new HashMap<>();

    public static void addPassport(Passport passport) {
        if (passports.containsKey(passport.getPassportNumber())) {
            passports.remove(passport.getPassportNumber());
            Passport updatePassport = new Passport(passport.getPassportNumber(), passport.getLastName(), passport.getFirstName(), passport.getPatronymic(), passport.getBirthDate());
            System.out.println("Данные гражданина "  + updatePassport.getLastName() +" "+updatePassport.getFirstName() +  " обновлены");
        }
        passports.put(passport.getPassportNumber(), passport);


    }

}
