package apifestivofrank.apifestivofrank.interfaces;

import java.util.List;

import apifestivofrank.apifestivofrank.entidades.Festivo;

public interface IFestivoServicio {

    public List<Festivo> listar();

    public List<Festivo> obtener(int id);

    public String verificar(int year, int month, int day);
}
