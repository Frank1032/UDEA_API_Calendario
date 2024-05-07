package apifestivofrank.apifestivofrank.interfaces;

import java.util.List;

import apifestivofrank.apifestivofrank.entidades.Tipo;

public interface ITipoServicio {

    public List<Tipo> listar();

    public Tipo obtener(int id);

    public Tipo guardar(Tipo tipo);

    public boolean eliminar(int id);
}
