package br.com.loja.service;

import br.com.loja.dto.InfoPedidoDTO;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("fornecedor")
public interface FornecedorClient {

    @GetMapping("/info/{estado}")
    @LoadBalanced
    String getInfoPorEstado(@PathVariable String estado);

    @PostMapping("/pedido")
    @LoadBalanced
    InfoPedidoDTO realizarPedido(List<ItensPedidoDTO> itens);

}
