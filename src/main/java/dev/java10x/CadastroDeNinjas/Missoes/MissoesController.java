package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // GET: Listar todas as missões
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes() {
        return missoesService.listarMissoes();
    }

    // GET: Buscar missão por ID (ex: /missoes/listar/1)
    @GetMapping("/listar/{id}")
    public MissoesModel buscarMissaoPorId(@PathVariable Long id) {
        return missoesService.buscarMissaoPorId(id);
    }

    // POST: Criar missão
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao) {
        return missoesService.criarMissao(missao);
    }

    // PUT: Atualizar missão por ID (ex: /missoes/alterar/1)
    @PutMapping("/alterar/{id}")
    public MissoesModel atualizarMissao(@PathVariable Long id, @RequestBody MissoesModel missao) {
        return missoesService.atualizarMissao(id, missao);
    }

    // DELETE: Deletar missão por ID (ex: /missoes/deletar/1)
    @DeleteMapping("/deletar/{id}")
    public String deletarMissao(@PathVariable Long id) {
        missoesService.deletarMissao(id);
        return "Missão com ID " + id + " deletada com sucesso!";
    }
}
