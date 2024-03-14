package AD04_Hobbies;

import java.util.Arrays;
import java.util.HashSet;

public class TestHobbies {

    /**
     *
     */
    public static void main(String[] args) {
        Club club = new Club();

        HashSet<String> hobbiesP1 = new HashSet<>(Arrays.asList("bailar", "cantar", "leer", "nadar", "caminar",
                "deporte"));
        club.addPersona("Juan", hobbiesP1);
        HashSet<String> hobbiesP2 = new HashSet<>(Arrays.asList("bailar", "cantar", "leer"));
        club.addPersona("Elena", hobbiesP2);
        HashSet<String> hobbiesP3 = new HashSet<>(Arrays.asList("nadar", "caminar", "deporte"));
        club.addPersona("Isabel", hobbiesP3);
        HashSet<String> hobbiesP4 = new HashSet<>(Arrays.asList("bailar", "cantar", "caminar", "deporte"));
        club.addPersona("Amaia", hobbiesP4);

        System.out.println("Personas en el club y sus hobbies");
        club.printClub();
        System.out.println();

        String hobbie = "nadar";
        System.out.println("Personas con hobbie '" + hobbie + "'");
        System.out.println(club.personasConHobbie(hobbie));

        System.out.println("Borrar pesonas con hobbie '" + hobbie + "'");
        System.out.println("Se han borrado " + club.borrarPersonasConHobbie(hobbie));
    }
}
