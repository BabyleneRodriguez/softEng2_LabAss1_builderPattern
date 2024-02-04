package softEng2_LabAss1_builderPattern;

public class eCommerce_Application
{
    public static void main(String[] args)
    {
        User user = new User.UserBuilder()
                .firstName("Babylene")
                .lastName("Rodriguez")
                .email("babylene.rodriguez@neu.edu.ph")
                .address("Taytay, Rizal")
                .phone("09662960902")
                .age(21)
                .build();

        System.out.print("\n~USER ACCOUNT INFO~"
                        + "\nFirstname: " + user.firstName
                        + "\nLastname: " + user.lastName
                        + "\nE-mail: " + user.email
                        + "\nAddress: " + user.address
                        + "\nPhone Number: " + user.phone
                        + "\nAge: " + user.age);
    }
}
