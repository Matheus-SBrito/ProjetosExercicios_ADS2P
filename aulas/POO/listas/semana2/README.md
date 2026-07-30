# Diagrama de classes dos Exercícios

``` mermaid
classDiagram

class ProdutoImportado{
    -tipo: string
    -preco: float

    +getTipo() string 
    +setTipo() void

    +getPreco()
    +setPreco()

}


class AgenteImportacao{
    
    +converter(ProdutoImportado obj) float
    +calcularImposto()


}

```
