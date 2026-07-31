# Tabelas

- Clientes
- Animais

Objetivo: Fazer o modelo conceitual.

# Requisitos
Dados armazenados em cada uma das tabelas
## Tutor:

- Nome Completo
- Cpf PK
- E-mail
- Telefone
- Endereço

## Pet

- Id PK
- Nome
- Espécie
- Raça
- Data nascimento
- Peso

## Regras

Um tutor pode **ter um ou mais pets**.

1. Entidades e Atributos

    * Listar Entidades
    * Definir Atributos

2. Mapear as 

    * Chaves Primarias PK
    * Chave Estrangeiras

3. Cardinalidade e Relacionamentos:
    * Relacionamento entre duas entidades (1:1, 1:N, N:N)

4. Diagrama Entidade-Relacionamento (DER)

    * Esboce o Diagrama conceitual com as entidades, atributos, chaves e cardinalidades

## Confecção do exercício

``` mermaid
erDiagram

TUTOR{

    int cpf PK
    string nome_pessoa
    string e_mail
    string telefone
    string endereco

}

PET{
    int id_pet PK
    string nome_pet
    string especie
    string raca
    date data_nasc
    int peso

}

TEM {
 int id_tem PK
 int id_pet FK
 int cpf FK
}
TUTOR }|--|{ PET: TEM 

```
