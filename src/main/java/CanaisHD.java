public class CanaisHD extends PacoteDecorator{
    public CanaisHD(PacoteTv pacoteDecorado){
        super(pacoteDecorado);
    }

    public String getDescricao(){
        return pacoteDecorado.getDescricao() + "Canais em HD";
    }

    public double getCusto(){
        return pacoteDecorado.getCusto() + 25.0;
    }
}
