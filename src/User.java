public class User {
    private String nome;
    private int eta;

    // Istanza statica unica (singleton)
    private static User instance;

    private User() {
        this.nome = "Default Nome";
        this.eta = 0;
    }

    // Metodo per ottenere l'istanza singleton
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void stampaInfo() {
        System.out.println("Nome: " + nome + ", Età: " + eta);
    }
}

