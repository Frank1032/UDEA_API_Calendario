package apifestivofrank.apifestivofrank.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import apifestivofrank.apifestivofrank.entidades.Festivo;

public interface FestivoRepositorio extends JpaRepository<Festivo, Integer> {

}
