# Atividade: PetAmigo

- Clinica Veterinaria
- Controle de Clientes, Animais, Veterinários e Atendimentos
- Tabelas:
    - Clientes (Donos dos pets).
    - Pets (pacientes).
    - Veterinários.
    - Consultas realizadas (realionando o pet, veterinario responsavel, a data, o diagnostico e o valor cobrado).

## Tarefas Modelagem conceitual

Deve conter quatro entidades -> Relacionamentos só podem ser 1:N ou 1:1

``` mermaid
erDiagram

Cliente {

    id_cliente INT PK "AUTO_INCREMENT"
    nome_cliente VARCHAR(100) "NOT NULL"
    cpf_cliente CHAR(11) "NOT NULL, UNIQUE"

}

Pet {

    id_pet INT PK "AUTO_INCREMENT"

        id_cliente INT FK "NOT NULL"

    nome_pet VARCHAR(50) "NOT NULL"
    especie_pet VARCHAR(50) "NOT NULL"
    raca_pet VARCHAR(50) "NOT NULL"
    
}

Veterinario {

    id_veterinario INT PK "AUTO_INCREMENT"
    nome_veterinario VARCHAR(100) "NOT NULL"
    crmv_veterinario VARCHAR(12) "NOT NULL, UNIQUE"
    epecialidade_veterinario VARCHAR(30) "NOT NULL"

}

Consulta {

    id_consulta INT PK "AUTO_INCREMENT"
    id_veterinario INT FK "NOT NULL"
    id_pet INT FK "NOT NULL"

    data_consulta DATE "NOT NULL"
    preco FLOAT(5) "NOT NULL"
    descricao_consulta TEXT "NOT NULL"

}


Cliente || -- |{ Pet : "Um cliente é dono de um ou mais pets, mas um pet possui somente um pet."

Pet |o -- |{ Consulta : "Um mesmo pet pode estar em varias ou nenhuma consulta, mas a instancia da tabela consulta, tem somente um unico pet."

Veterinario |o -- |{ Consulta : "Um mesmo veterinario pode estar em varias ou nenhuma consulta, mas a instancia da tabela consulta, tem somente um unico veterinario."


```