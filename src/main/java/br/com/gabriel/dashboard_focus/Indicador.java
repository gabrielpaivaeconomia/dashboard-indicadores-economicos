package br.com.gabriel.dashboard_focus;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "projecoes_focus")
public class Indicador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data_relatorio;
    private String indicador;
    private int projecao_ano;
    private BigDecimal mediana_projecao;

    // Getters e Setters (métodos de acesso)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getData_relatorio() {
        return data_relatorio;
    }
    public void setData_relatorio(LocalDate data_relatorio) {
        this.data_relatorio = data_relatorio;
    }
    public String getIndicador() {
        return indicador;
    }
    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
    public int getProjecao_ano() {
        return projecao_ano;
    }
    public void setProjecao_ano(int projecao_ano) {
        this.projecao_ano = projecao_ano;
    }
    public BigDecimal getMediana_projecao() {
        return mediana_projecao;
    }
    public void setMediana_projecao(BigDecimal mediana_projecao) {
        this.mediana_projecao = mediana_projecao;
    }
}