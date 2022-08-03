public class FabricaNetflix implements Fabrica
{
    @Override
    public Peliculas pelicula() {
        return new PeliculaN();
    }

    @Override
    public Series serie() {
        return new SerieN();
    }
}
