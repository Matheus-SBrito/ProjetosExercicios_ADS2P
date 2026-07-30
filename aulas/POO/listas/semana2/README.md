# Diagrama de classes dos Exercícios

A pasta contem a contrução das classes, encontradas nos digramas de classes, utilizando linguagem de programação java.

## Erexcício 2

### Diagrama de classes.
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

### Código Java
``` java

/* Equivalencias */

import java.util.Scanner;

/**
 * ProdutoImportado
 */
public class ProdutoImportado {

    private String tipo;
    private float preco;

    
    public String getTipo (){return this.tipo;}
    public void setTipo (String novoValor){this.tipo = novoValor;}

    public float getPreco (){return this.preco;}
    public void setPreco (float novoValor){this.preco = novoValor;}
}



public class AgenteImportacao {

    public float converter (ProdutoImportado obj){
        float numReal;
        numReal = obj.getPreco() * (float) 5.13;

         return numReal;}

    
    public float calcularImposto (ProdutoImportado obj){
        
        float valorPago;
        final float IMPOSTO = (float) 60/100;
        valorPago = converter(obj) * IMPOSTO;
        
        return valorPago;}
    
}

```