public class FabricaAmazon implements Fabrica
{
    @Override
    public Peliculas pelicula() {
        return new PeliculaA();
    }

    @Override
    public Series serie() {
        return new SerieA();
    }
}
