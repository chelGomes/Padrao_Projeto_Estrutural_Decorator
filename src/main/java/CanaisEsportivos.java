public class CanaisEsportivos extends PacoteDecorator{
    public CanaisEsportivos(PacoteTv pacoteDecorado){
        super(pacoteDecorado);
    }

    public String getDescricao(){
        return pacoteDecorado.getDescricao() + "Canais de Esportes";
    }

    public double getCusto(){
        return pacoteDecorado.getCusto() + 10.0;
    }
}
