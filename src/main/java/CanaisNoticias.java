public class CanaisNoticias extends PacoteDecorator{
    public CanaisNoticias(PacoteTv pacoteDecorado){
        super(pacoteDecorado);
    }

    public String getDescricao(){
        return pacoteDecorado.getDescricao() + "Canais de Noticias";
    }

    public double getCusto(){
        return pacoteDecorado.getCusto() + 5.0;
    }
}
