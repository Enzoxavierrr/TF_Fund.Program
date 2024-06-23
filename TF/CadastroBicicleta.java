package Pucrs.TF;

public class CadastroBicicleta {
   private bicicleta[] cadastro;
    private int contador = 0;

    public CadastroBicicleta() {
        this.cadastro = new bicicleta[10];
        this.contador = 0;
    }

    public boolean incluirBicicleta(bicicleta bicicleta) {
        if (contador < cadastro.length) {
            cadastro[contador] = bicicleta;
            contador++;
            return true;
        } else {
            return false;
        }
    }

    public String totalUnidades() {
        int total = 0;
        for (int i = 0; i < contador; i++) {
            total += cadastro[i].getQuantidade();
        }
        return "Possui:" +total +" " +" bicicletas disponíveis.";
    }

    public void mostraBicicletas(bicicleta bicicleta) {
        for (int i = 0; i < contador; i++) {
            System.out.println(cadastro[i]);
        }
    }
}
}
