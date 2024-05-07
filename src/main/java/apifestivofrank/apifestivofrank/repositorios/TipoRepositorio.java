package apifestivofrank.apifestivofrank.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import apifestivofrank.apifestivofrank.entidades.Festivo;

public interface TipoRepositorio extends JpaRepository<Festivo, Integer> {

}
