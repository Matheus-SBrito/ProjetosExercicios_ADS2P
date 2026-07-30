# Função do Repositório

O repositório serve como portifólio para exibir o desenvolvimento de exercícios, dos seguintes conteúdos -- Estrutura de Dados, Programação Orientada a Objetos e Banco de dados -- e para a confecção de projetos com utilizando o paradigma de programação POO. Inicialmente a utilização dos conceitos citados anteriormente será feita de modo desconexa uma a outra, na pasta *aulas*, mas o intuito é desenvolver projetos e exercícios que, em um certo ponto, tenham em si, o máximo de conceitos possíveis para o desenvolvimento de aplicações e a aplicação de boas práticas de programação.

> Resumo: Portifólio para exibição de exercícios e evolução na aplicação de Conceitos de Programação.

## Pastas do Projeto
- *[aulas](https://github.com/Matheus-SBrito/POO_exercicios/tree/main/aulas)*: A pasta aulas está sendo utilizada para compartilhar exercícios e pequenas práticas realizadas em sala de aula.
- *[xadrez](https://github.com/Matheus-SBrito/POO_exercicios/tree/main/xadrez)*: A pasta xadrez está sendo utilizada como um projeto **Open Source**, paralelo ao conteúdo e a ementa da matéria, desenvolvido durante as aulas.

## Especificações Básicas de Desenvolvimento
- Linguagem de Programação utilizada: Java.
- Padrão de Nomenclatura: Camel Case - para atributos, métodos e classes - e Snake Case para Constantes.
- Commit´s de colaboradores: ...

### Padronização na utilização de git - *Commit´s*
- Todo *commit* feito deve ser feito, preferencialmente, com a utilização do editor padrão do git (Vim)
- *commit* com o Vim:
  - O título do *commit* deve ser o caminho da pasta ou o projeto que está sendo alterado.
  - O subtítulo deve ser o tipo de alteração - doc, backend ou frontend - em caso de uma alteração de mais de um tipo, numera-la é o suficiente.
  - Fornecer uma visão geral da alteração.
  - Fazer uma lista ordenada dos principais arquivos alterados e sua respectiva alteração.
  - Exemplo:

     ```txt
      Xadrez
      doc, backend e frontend
      
      Visão geral - Alteração nos arquivos de instanciação de objetos.
      
      Peao: adição da validação dos dados.
      Cavalo: mudança no método de comportamento
      ```

- Em caso de alterações pequenas, utilizar a seguinte formatação:
  - Utilizar o comando *git commit -m*
  - Iniciar a descrição com o projeto alterado
  - Descrever um resumo pequeno das alterações
  - Exemplo:
  
     ``` git
      padrão do texto do commit: "[projeto_alterado]: [descrição geral da alteração]"
      
      $ git commit -m "Xadrez: alteração nas instancias das classes."
      ```
