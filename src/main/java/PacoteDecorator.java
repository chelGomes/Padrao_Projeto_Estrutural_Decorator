public abstract class PacoteDecorator implements PacoteTv{
    protected PacoteTv pacoteDecorado;

    public PacoteDecorator(PacoteTv pacoteDecorado){
        this.pacoteDecorado = pacoteDecorado;
    }

    public String getDecorado(){
        return pacoteDecorado.getDescricao();
    }

    public double getCusto(){
        return pacoteDecorado.getCusto();
    }

    public void setPacoteDecorado(PacoteTv pacoteDecorado) {
        this.pacoteDecorado = pacoteDecorado;
    }
}
