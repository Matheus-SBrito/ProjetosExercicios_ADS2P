# IFPB – Campus Santa Rita

## PROGRAMAÇÃO ORIENTADA A OBJETOS

**Prof. Cleyton Caetano de Souza**

### Aula Prática 1 (03/08/2026)

> **Observação:** Esta atividade deve ser feita em dupla.

1. Crie uma classe chamada `Pessoa` com os atributos:
   - `nome` (String)
   - `sexo` (String)
   - `peso` (float)
   - `altura` (int, em centímetros)
   - `idade` (int)

   Siga as convenções de nomenclatura de visibilidade vistas em sala e crie os getters e setters correspondentes.

## Projeto: Doação de Sangue

2. Requisitos para doar sangue:
   - Ter entre **19 e 69 anos**.
   - Pesar **ao menos 50 kg**.
   - Não ter feito tatuagem no último ano.
   - Não ter ingerido álcool nas últimas 12 horas.

   Crie a classe `AtendenteDaEnfermaria` com o método `avaliarDoador`, que recebe:
   - um objeto `Pessoa`;
   - um booleano indicando tatuagem no último ano;
   - um booleano indicando ingestão de álcool nas últimas 12 horas.

   O método deve retornar `true` se a pessoa puder doar sangue e `false` caso contrário.

3. Escreva um programa que:
   - leia os dados de **duas pessoas**;
   - utilize o `AtendenteDaEnfermaria` para avaliar cada uma;
   - informe quantas pessoas puderam doar sangue.

## Projeto: Porteiro Automático

4. Crie uma classe `Porteiro` com o método `boasVindas`, que recebe um objeto `Pessoa` e retorna uma `String`.

   Utilize `switch case` para gerar as mensagens:

   - **Homem:** `Bem vindo Senhor @nome`
   - **Mulher:** `Bem vinda Senhorita @nome`
   - **Criança** (menos de 10 anos, usando `if`): `Olá Jovem @nome`
   - **Adulto sem sexo atribuído:** `Olá @nome, tenha um ótimo dia.`

5. Escreva um programa que leia os dados de uma `Pessoa` e utilize o `Porteiro` para cumprimentá-la.
