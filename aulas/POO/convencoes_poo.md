# Convenções de Programação POO

## Padrão de Nomenclatura

- **Variáveis/Atributos:** camelCase
- **Métodos:** camelCase
- **Classes:** PascalCase (Camel Case)
- **Constantes:** SCREAMING_SNAKE_CASE

### Camel Case

#### Classes

A primeira letra de cada palavra é maiúscula.

**Exemplo:**

```java
CelularNacional
```

#### Atributos, Variáveis e Métodos

A primeira palavra começa com letra minúscula e as demais palavras iniciam com letra maiúscula.

**Exemplo:**

```java
ligarCelular
```

### SCREAMING_SNAKE_CASE

#### Constantes

Todos os caracteres devem estar em letras maiúsculas. Os espaços entre as palavras são substituídos por `_`.

**Exemplo:**

```java
VALOR_MAXIMO
```

---

## Configuração de Acessibilidade

Os atributos e o padrão de acessibilidade em Java são definidos por quatro modificadores principais:

- `private`
- `default`
- `protected`
- `public`

Esses modificadores controlam a visibilidade dos dados de uma classe, garantindo segurança e encapsulamento.

### Boas práticas

- **Atributos privados:** mantenha sempre os atributos como `private` para garantir o encapsulamento.

- **Métodos públicos de acesso:** utilize métodos `get` e `set` públicos quando outras classes precisarem ler ou modificar os atributos.

- **Princípio do menor privilégio:** comece utilizando o modificador mais restritivo (`private`) e aumente a visibilidade (`protected` ou `public`) apenas quando houver necessidade.

- **Input´s, entrada de dados:** sempre leia inicialmente uma entrada 'externa' (uma entrada do terminal) como string e, após isso, faça uma converção para o dado necessária para a funcionalidade.

---

## Utilização do `this` em Classes

### 1. Diferenciar nomes iguais

Permite distinguir um atributo da classe de um parâmetro que possui o mesmo nome.

**Exemplo:**

```java
this.nome = nome;
```

### 2. Chamar outro construtor

Permite que um construtor invoque outro construtor da mesma classe, evitando repetição de código.

**Exemplo:**

```java
this();
```

### 3. Passar o objeto atual

Envia a própria instância da classe como argumento para outro método ou construtor.

**Exemplo:**

```java
outroMetodo(this);
```
