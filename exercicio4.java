public class exercicio4 {
    public static void main(String[] args) {
        double Sp = 67836.43, Rj = 36678.66, Mg = 29299.88, Es = 27165.48, Outros = 19849.53, totalFaturado= 0. ;
        double porcentagemSp = 0, porcentagemRj = 0, porcentagemMg = 0, porcentagemEs = 0, porcentagemOutros = 0;

        totalFaturado = Sp + Rj+ Mg + Es + Outros;

        porcentagemSp = (Sp/totalFaturado) * 100;
        porcentagemRj = (Rj/totalFaturado) * 100;
        porcentagemMg = (Mg/totalFaturado) * 100;
        porcentagemEs = (Es/totalFaturado) * 100;
        porcentagemOutros = (Outros/totalFaturado) * 100;


        System.out.printf("Faturamento total: R$%.2f%n", totalFaturado);
        System.out.printf("Percentual SP: %.2f%% %n", porcentagemSp);
        System.out.printf("Percentual RJ: %.2f%% %n", porcentagemRj);
        System.out.printf("Percentual MG: %.2f%% %n", porcentagemMg);
        System.out.printf("Percentual ES: %.2f%% %n", porcentagemEs);
        System.out.printf("Percentual Outros: %.2f%% %n", porcentagemOutros);
    }
}
