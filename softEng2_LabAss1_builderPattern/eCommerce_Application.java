package softEng2_LabAss1_builderPattern;

public class eCommerce_Application
{
    public static void main(String[] args)
    {
        User user = new User.BuilderPattern()
                .firstName("Babylene")
                .lastName("Rodriguez")
                .email("babylene.rodriguez@neu.edu.ph")
                .address("Taytay, Rizal")
                .phone("09662960902")
                .age(21)
                .build();

        System.out.print("\n~USER ACCOUNT INFO~");
        System.out.print("\nFirstname: " + user.firstName);
        System.out.print("\nLastname: " + user.lastName);
        System.out.print("\nE-mail: " + user.email);
        System.out.print("\nAddress: " + user.address);
        System.out.print("\nPhone Number: " + user.phone);
        System.out.print("\nAge: " + user.age);
    }
}
