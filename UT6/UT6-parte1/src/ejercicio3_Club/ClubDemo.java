package ejercicio3_Club;

/**
 * Demo para las clases Club y Miembro
 */
public class ClubDemo {

    public static void main(String[] args) {
        Club club = new Club();

        club.anyadir(new Miembro("David", 2, 2004));
        club.anyadir(new Miembro("Alba", 2, 2004));
        club.anyadir(new Miembro("Michael", 2, 2005));
        club.anyadir(new Miembro("Pedro", 1, 2004));
        club.anyadir(new Miembro("Diana", 2, 2004));
        System.out.println("El club tiene " + club.numeroMiembros() + " miembros.");
        System.out.println("En febrero se incorporaron " + club.incorporadosEnMes(2) + " miembros.");
        club.listarClub();

        club.borrar(2, 2004);
        club.listarClub();

    }
}
