# 📊 Dashboard de Indicadores Econômicos - Relatório Focus

## 🎯 Sobre o Projeto
Este projeto é uma aplicação web full-stack que apresenta um dashboard interativo para a visualização e análise da evolução das expectativas de mercado para os principais indicadores macroeconômicos do Brasil.

O objetivo principal é transformar os dados semanais do Relatório Focus do Banco Central em uma ferramenta visual, permitindo que estudantes, analistas e entusiastas possam acompanhar não apenas a projeção atual, mas como o sentimento do mercado mudou ao longo de **um período histórico de 12 meses**.

O painel responde a perguntas como:
* Como a expectativa do mercado para a inflação (IPCA) de 2025 se comportou ao longo do último ano?
* Houve algum evento específico no início de 2025 que provocou uma onda de pessimismo nas projeções de crescimento do PIB para 2026?
* As projeções de longo prazo para a taxa de juros (SELIC) e câmbio se mantiveram estáveis ou sofreram grandes reviravoltas?

## 🖥️ Visualização do Dashboard
Abaixo, uma prévia da visualização principal do painel. A versão online é totalmente interativa.

**<img width="946" height="603" alt="image" src="https://github.com/user-attachments/assets/9af95ff0-555a-4151-a806-a7e75fbcc84f" />
**

➡️ **Acesse o dashboard ao vivo aqui! https://gabrielpaivaeconomia.github.io/dashboard-indicadores-economicos/**

## ✨ Funcionalidades Principais
* **Séries Históricas de 12 Meses:** Gráficos de linha que exibem a evolução das projeções de mercado ao longo do tempo.
* **Visualização por Ano de Projeção:** Cada linha no gráfico representa a expectativa para um ano futuro diferente (ex: 2025, 2026, etc.), permitindo uma análise rica e comparativa.
* **Filtro Dinâmico por Indicador:** O usuário pode alternar facilmente entre a visualização da SELIC, IPCA, PIB e Câmbio.
* **Backend Robusto com API REST:** Uma API construída em Java fornece os dados de forma segura e estruturada.
* **Deploy Estático:** O dashboard está hospedado gratuitamente no GitHub Pages, garantindo acesso público e contínuo.

## 🛠️ Tecnologias e Ferramentas Utilizadas
Este projeto foi construído do zero utilizando uma arquitetura full-stack moderna:

* **Backend:** Java 17; Spring Boot 3 (com Spring Web e Spring Data JPA)
* **Banco de Dados:** PostgreSQL; SQL para criação e manipulação de tabelas.
* **Frontend:** HTML5 e CSS3; JavaScript (ES6+) para interatividade.
* **Visualização de Dados:** Chart.js com o adaptador chartjs-adapter-date-fns.
* **Ambiente e DevOps:** Visual Studio Code; Git & GitHub para controle de versão; GitHub Pages para hospedagem; Gradle como ferramenta de build.

## 📈 Fonte de Dados
Os dados foram extraídos dos relatórios semanais públicos e oficiais do Banco Central do Brasil (BCB) - Relatório Focus, cobrindo o período histórico de **Setembro de 2024 a Agosto de 2025**.

## 👨‍💻 Autor
**Gabriel Paiva**

* **GitHub:** @gabrielpaivaeconomia
* **LinkedIn:** [Gabriel Paiva](https://www.linkedin.com/in/gabriel-ruan-dos-santos-paiva-6566a021b/)
