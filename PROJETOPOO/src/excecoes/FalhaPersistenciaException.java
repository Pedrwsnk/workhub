package excecoes;

public class FalhaPersistenciaException extends Exception {
    public FalhaPersistenciaException(String msg) {
        super("Erro crítico ao salvar/ler arquivos: " + msg);
    }
}