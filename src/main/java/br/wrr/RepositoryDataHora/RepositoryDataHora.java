package br.wrr.RepositoryDataHora;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.wrr.ModelDataHora.ModelDataHora;

@Repository
public interface RepositoryDataHora extends JpaRepository<ModelDataHora, LocalDateTime>{

}
