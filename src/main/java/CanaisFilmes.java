public class CanaisFilmes extends PacoteDecorator {

    public CanaisFilmes(PacoteTv pacoteDecorado){
        super(pacoteDecorado);
    }

    public String getDescricao(){
        return
                pacoteDecorado.getDescricao() + " Canais de Filmes";
    }

    public double getCusto(){
        return pacoteDecorado.getCusto() + 15.0;
    }
}
