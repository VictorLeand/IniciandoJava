package Modelo;

public class Serie extends Titulo {
    private String Serie;

    private int temporadas;

    private int episodiosPorTemporadas;

    private int duracionEnMinutosPorEpisodio;

    private int tiempoDeDuracionEnMinutos;


       @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodio * episodiosPorTemporadas * temporadas;
    }

    public void setTiempoDeDuracionEnMinutos() {
        this.tiempoDeDuracionEnMinutos = duracionEnMinutosPorEpisodio * episodiosPorTemporadas * temporadas;

    }
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        return this.duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public void muestraFichaTecnica() {
        System.out.println("++++FICHA TÉCNICA++++");
        System.out.println("Nombre de la Título: " + Serie);
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episodios por Temporadas: " + episodiosPorTemporadas);
        System.out.println("Minutos por episodio: " + duracionEnMinutosPorEpisodio + " minutos");



    }

}
