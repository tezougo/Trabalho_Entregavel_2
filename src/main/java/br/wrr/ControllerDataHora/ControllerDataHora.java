package br.wrr.ControllerDataHora;// para o springer encontrar essa classe

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.gvsc.AulaAtosUFNRestSpring.Models.PessoaModel;
import br.wrr.RepositoryDataHora.RepositoryDataHora;
import io.swagger.annotations.Api;

@Controller
@Api(value = "Swagger2RestController", description = "Serve para acessar as funções disponíveis swagger além de realizar o controle dos dados"  )
@RestController
@RequestMapping("/datashoras") //para dizer qual a url, quando o spring deve chamar essa página
public class ControllerDataHora {
	
	@Autowired
	private RepositoryDataHora repositoryDataHora;
	
	@GetMapping
	public List<PessoaModel> getPessoas(){
		return pessoaRepository.findAll();
    //@ResponseBody  // para não navegar para uma página, se não colocar ele ira procurar uma página
}