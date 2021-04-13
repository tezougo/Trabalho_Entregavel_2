package br.wrr.ModelDataHora;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.swagger.annotations.ApiModelProperty;


@Entity
public class ModelDataHora {
	
	@ApiModelProperty (notes="Mostra a e hora local", name="DataHoraAgora",required = true, value = "data e hora")
	@Column(nullable=false)
	private LocalDateTime hora_atual= LocalDateTime.now();

	public LocalDateTime getHora_atual() {
		return hora_atual;
	}

	public void setHora_atual(LocalDateTime hora_atual) {
		this.hora_atual = hora_atual;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hora_atual == null) ? 0 : hora_atual.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelDataHora other = (ModelDataHora) obj;
		if (hora_atual == null) {
			if (other.hora_atual != null)
				return false;
		} else if (!hora_atual.equals(other.hora_atual))
			return false;
		return true;
	}
	
	
}
