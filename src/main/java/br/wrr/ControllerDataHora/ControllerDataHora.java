package br.wrr.ControllerDataHora;// para o springer encontrar essa classe

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.wrr.ModelDataHora.*;
import br.wrr.RepositoryDataHora.RepositoryDataHora;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value = "Swagger2RestController", description = "Acessar as funções disponíveis swagger além de realizar o controle dos dados"  )
@RestController
@RequestMapping("/datashoras") //para dizer qual a url, quando o spring deve chamar essa página
public class ControllerDataHora {
	
	@Autowired
	private RepositoryDataHora repositoryDataHora;
	

	@ApiOperation(value = "Retorna as datas", response = Iterable.class, tags = "getHora_atual")
	@GetMapping
	public List<ModelDataHora> getHora_atual(){
		return repositoryDataHora.findAll();
		
	}
	
	@ApiOperation(value = "Cadastra nova data e hora ", response = Iterable.class, tags = "DataHora")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ModelDataHora adicionar(@RequestBody ModelDataHora hora_atual) {
		return repositoryDataHora.save(hora_atual);
	}
    //@ResponseBody  // para não navegar para uma página, se não colocar ele ira procurar uma página
}