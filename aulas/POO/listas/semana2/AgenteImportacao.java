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
