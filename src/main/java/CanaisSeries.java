public class CanaisSeries extends PacoteDecorator{

    public CanaisSeries(PacoteTv pacoteDecorado){
        super(pacoteDecorado);
    }

    public String getDescricao(){
        return pacoteDecorado.getDescricao() + " Canais de Series";
    }

    public double getCusto(){
        return pacoteDecorado.getCusto() + 20.0;
    }
}
