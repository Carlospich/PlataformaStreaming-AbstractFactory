public class Principal
{
    public static void main (String[] args)
    {
        FabricaAmazon fabricaAmazon = new FabricaAmazon();
        System.out.println("AMAZON");
        System.out.println("Pelicula: " + fabricaAmazon.pelicula().getNombre());
        System.out.println("Duracion: " + fabricaAmazon.pelicula().getDuracion());
        System.out.println("Genero: " + fabricaAmazon.pelicula().getGenero());
        System.out.println("Serie: " + fabricaAmazon.serie().getNombre());
        System.out.println("Duracion: " + fabricaAmazon.serie().getDuracion());
        System.out.println("Genero: " + fabricaAmazon.serie().getGenero());
        System.out.println("Cantidad de Capitulos: " + fabricaAmazon.serie().getCantCapitulos());

        FabricaNetflix fabricaNetflix = new FabricaNetflix();
        System.out.println("\n" + "\n" +  "NETFLIX");
        System.out.println("Pelicula: " + fabricaNetflix.pelicula().getNombre());
        System.out.println("Duracion: " + fabricaNetflix.pelicula().getDuracion());
        System.out.println("Genero: " + fabricaNetflix.pelicula().getGenero());
        System.out.println("Serie: " + fabricaNetflix.serie().getNombre());
        System.out.println("Duracion: " + fabricaNetflix.serie().getDuracion());
        System.out.println("Genero: " + fabricaNetflix.serie().getGenero());
        System.out.println("Cantidad de Capitulos: " + fabricaNetflix.serie().getCantCapitulos());
    }
}
