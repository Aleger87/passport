public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport("0000 000000", "Иван","Иванов",  "01.01.2000" );
        System.out.println(PassportMethod.passports);
        Passport passpor2 = new Passport("0000 000000", "Иван","Иванов","Иванович", "01.01.2000" );
        System.out.println(PassportMethod.passports);
        Passport passport1 = new Passport("0000 000001", "Иван","Иванов", "01.01.2000" );
        System.out.println(PassportMethod.passports);

        searchPassport(passport.getPassportNumber());
    }

    private static void searchPassport(String passportNumber) {
        System.out.println(PassportMethod.passports.get(passportNumber));
    }
}