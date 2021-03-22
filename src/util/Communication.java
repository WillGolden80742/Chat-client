package util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author elder
 */
public class Communication implements Serializable {

    private String operation;
    private Status status;

    /* 
    chave : Object
     */
    Map<String, Object> params;

    public Communication(String operacao) {
        this.operation = operacao;
        params = new HashMap<>();
    }

    public Communication() {
        params = new HashMap<>();        
    }

    public String getOperation() {
        return operation;
    }

    public void setStatus(Status s) {
        this.status = s;
    }

    public Status getStatus() {
        return status;
    }

    /*
        "NOME" --> "José"
        "IDADE" --> 35
     */
    public void setParam(String chave, Object valor) {
        params.put(chave, valor);
    }

    public Object getParam(String chave) {
        return params.get(chave);
    }

    @Override
    public String toString() {
        String m = "Operacao: " + operation;
        m += "\nStatus: " + status;

        m += "\nParâmetros:\n ";
        for (String p : params.keySet()) {
            m += p + ": " + params.get(p) + "\n";
        }
        return m;
    }

}
