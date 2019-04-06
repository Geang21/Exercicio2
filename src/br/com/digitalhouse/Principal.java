package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {

        Filho filho1 = new Filho();
        Filho filho2 = new Filho();

        filho1.setMae("Tereza");
        filho1.setPai("João");

        filho2.setMae("Tereza");
        filho2.setPai("João");

        System.out.println("Mãe de filho 1 é " + filho1.getMae());
        System.out.println("Pai de Filho 1 é " + filho1.getPai());
        System.out.println("Mão de Filho 2 é " + filho2.getMae());
        System.out.println("Pai de Filho 2 é " + filho2.getPai());

        System.out.println(temAmesmaMae(filho1, filho2));
        System.out.println(temOmesmoPai(filho1, filho2));
        System.out.println(saoMeioIrmaos(filho1, filho2));
    }

    public static String maeDe(Filho novoFilho) {
        novoFilho.getMae();
        return novoFilho.getMae();
    }

    public static String paiDe(Filho novoFilho) {
        novoFilho.getPai();

        return novoFilho.getPai();
    }

    public static Boolean temAmesmaMae(Filho filho1, Filho filho2) {
        if (filho1.getMae() == filho2.getMae()) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean temOmesmoPai(Filho filho1, Filho filho2) {
        if (filho1.getPai() == filho2.getPai()) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean saoMeioIrmaos(Filho filho1, Filho filho2) {

        return temAmesmaMae(filho1, filho2) && !temOmesmoPai(filho1, filho2)
                || !temAmesmaMae(filho1, filho2) && temOmesmoPai(filho1, filho2);
    }
}
