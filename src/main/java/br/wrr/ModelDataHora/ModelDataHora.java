package br.wrr.ModelDataHora;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;


@Entity
public class ModelDataHora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty (notes="Mostra a e hora local", name="DataHoraAgora",required = true, value = "data e hora")
	@Column(nullable=false)
	private long Id;
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	private LocalDateTime hora_atual= LocalDateTime.now();
	public LocalDateTime getHora_atual() {
		return hora_atual;
	}

	public void setHora_atual(LocalDateTime hora_atual) {
		this.hora_atual = hora_atual;
	}
	
	
}
