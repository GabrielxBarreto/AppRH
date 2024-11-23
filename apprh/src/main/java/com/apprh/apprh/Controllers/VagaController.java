package com.apprh.apprh.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.apprh.apprh.Models.Candidato;
import com.apprh.apprh.Models.Vaga;
import com.apprh.apprh.Repository.CandidatoRepository;
import com.apprh.apprh.Repository.VagaRepository;

@RestController
public class VagaController {
    private VagaRepository vr;
    private CandidatoRepository cr;

    public CandidatoRepository getCr() {
        return cr;
    }
    public VagaRepository getVr() {
        return vr;
    }
    //cadastra uma vaga no sistema
    //@GetMApping indica que o método é get
    @RequestMapping(value = "/cadastrarVaga", method=RequestMethod.GET)
    public String form(){
        return "vaga/formVaga";
    }
    @RequestMapping(value = "/cadastrarVaga", method=RequestMethod.POST)
    public String form(@Validated Vaga vaga, BindingResult result,  RedirectAttributes attributes){
        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem,verifique os campos");
            return "redirect:/cadastrarVaga";
        }
        vr.save(vaga);//metodo de vaga reository
        attributes.addFlashAttribute("mensagem","Vaga Cadastrada com sucesso!");
        return "redirect:/CadastrarVaga";
    }
    //Listar Vagas
    @RequestMapping("/vagas")
    public ModelAndView ListaVagas(){
        ModelAndView mv = new ModelAndView("vaga/listaVaga");
        Iterable<Vaga>vagas = vr.findAll();
        mv.addObject("vagas", vagas);
        return mv;
    }
    @RequestMapping(value = "/{codigo}",method = RequestMethod.GET)
    public ModelAndView detalhesVaga(@PathVariable("codigo") long codigo){
        Vaga vaga = vr.findByCodigo(codigo);
        ModelAndView mv = new ModelAndView("vaga/detalhesVaga");
        mv.addObject("vaga", vaga);
        Iterable<Candidato>candidato = cr.findByVaga(vaga);
        mv.addObject("candidato", candidato);
        return mv;
    }
    @RequestMapping("/deletarVaga")
    public String deletarVaga(long codigo){
        Vaga vaga = vr.findByCodigo(codigo);
        vr.delete(vaga);
        return"redirect:/vagas";
    }
    public String detalhesVagaPost(@PathVariable("codigo") long codigo,
     @Validated Candidato candidato, BindingResult result, RedirectAttributes attributes){
        
        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem,verifique os campos");
            return "redirect:/{codigo}cadastrarVaga";
        }
       //teste de consistencia rg duplicado
       if(cr.findByRG(candidato.getRg())!=null){
        attributes.addFlashAttribute("mensagem erro", "Rg duplicado");
       }
       Vaga vaga = vr.findByCodigo(codigo);
       candidato.setVaga(vaga);
       cr.save(candidato);
       attributes.addFlashAttribute("mensagem","candidato adicionado");
       return "redirect:/{código}";
    }
    //DELETAR CANDIDATO PELO RG
    //O BindingResult é um objeto do Spring que contém informações sobre o resultado da
    // validação de um objeto, geralmente um objeto de domínio que representa os dados
    //enviados por um formulário. Ele é crucial para garantir a 
    //integridade dos dados antes de persistir ou processar informações em sua aplicação.
    
}
