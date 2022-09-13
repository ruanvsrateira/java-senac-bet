package com.senac.SenacBet.dao;
import com.senac.SenacBet.model.Perfil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilDAO extends CrudRepository<Perfil, Integer> {
}
