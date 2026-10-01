# Atividade III: Normalização, Modelagem Lógica e Implementação em SQL

Uma escola deseja organizar as informações sobre os empréstimos de livros realizados pelos estudantes. Atualmente, os dados são armazenados em
uma única tabela. Normalize-o.


```html

<img src="./Captura de tela 2026-08-20 210200.png" alt="">

```

## Diagrama DER

```mermaid
erDiagram

Aluno {

    id_aluno INT PK "AUTO_INCREMENT" 

    nome_aluno VARCHAR(100) "NOT NULL"

    turma VARCHAR(50) "NOT NULL"

}

Livro {

    id_livro INT PK "AUTO_INCREMENT"

    titulo_livro VARCHAR(100) "NOT NULL"

    autor VARCHAR(100) "NOT NULL"

}

Emprestimo {

    id_emprestimo INT PK "AUTO_INCREMENT"

    id_aluno INT FK "NOT NULL"

    id_aluno INT FK "NOT NULL"

    data_emprestimo DATE "NOT NULL"

    data_devolucao DATE

}

Aluno || -- |{ Emprestimo : "Um aluno pode realizar vários empréstimos. Cada empréstimo pertence a apenas um aluno. " 

Livro || -- |{ Emprestimo : "Um livro pode aparecer em vários empréstimos ao longo do tempo. Cada empréstimo refere-se a apenas um livro."
```