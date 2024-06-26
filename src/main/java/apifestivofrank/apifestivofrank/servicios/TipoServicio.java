package apifestivofrank.apifestivofrank.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import apifestivofrank.apifestivofrank.entidades.Tipo;
import apifestivofrank.apifestivofrank.interfaces.ITipoServicio;
import apifestivofrank.apifestivofrank.repositorios.TipoRepositorio;

@Service
public class TipoServicio implements ITipoServicio {

    private TipoRepositorio repositorio;

    public TipoServicio(TipoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Tipo> listar() {
        return this.repositorio.findAll();
    }

    @Override
    public Tipo obtener(int id) {
        var tipo = this.repositorio.findById(id);
        return tipo.isPresent() ? tipo.get() : null;
    }

    @Override
    public Tipo guardar(Tipo tipo) {
        return this.repositorio.save(tipo);
    }

    @Override
    public boolean eliminar(int id) {
        try {
            this.repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
