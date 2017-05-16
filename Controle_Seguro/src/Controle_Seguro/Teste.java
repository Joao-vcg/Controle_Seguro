package Controle_Seguro;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    public static String RecebeNome() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Entre com o nome do segurado");
        String nome = sc1.nextLine();
        return nome;
    }
    public static long RecebeCpf() {
        Scanner n = new Scanner(System.in);
        System.out.println("Entre com o Cpf do segurado");
        long cpf = n.nextLong();
        return cpf;
    }
    public static void ImprimeOperadora(ArrayList<Operadora> ops) {
        System.out.println("Escolha um plano");
        int i = 1;
        int j = 1;
        for (Operadora op : ops) {

            for (Plano_Saude p : op.getPlanos()) {
                System.out.println(i + "" + j + " " + op.getNomeOp() + " - " + p.getNome_p());
                j++;
            }
            i++;
            j = 1;
        }
    }
    public static int PegaOpcao2() {
        int opcao;
        Scanner sc2 = new Scanner(System.in);
        do {
            System.out.println("Escolha sua opção");
            opcao = sc2.nextInt();
        } while ((opcao < 11 || opcao > 14) && (opcao < 21 || opcao > 24) && (opcao < 31 || opcao > 34));
        return opcao;
    }
    public static int NumeroSegurados() {
        Scanner scint = new Scanner(System.in);
        System.out.println("Entre com o número de segurados");
        return scint.nextInt();
    }
    public static Segurado Adiciona(String nome, long cpf, Plano_Saude plano) {
        Segurado s = new Segurado();

        s.setNome_segurado(nome);
        s.setCpf(cpf);
        s.setPlanos(plano);
        return s;
    }
    public static Plano_Saude SelecionaPlano(int opcao, ArrayList<Plano_Saude> plans) {
        switch (opcao) {
            case 11:
                System.out.println("Unimed Platina");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 11) {
                        return plan;
                    }
                }
                break;
            case 12:
                System.out.println("Unimed Ouro");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 12) {
                        return plan;
                    }
                }
                break;
            case 13:
                System.out.println("Unimed Prata");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 13) {
                        return plan;
                    }
                }
                break;
            case 14:
                System.out.println("Unimed Bronze");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 14) {
                        return plan;
                    }
                }
                break;
            case 21:
                System.out.println("SulAmérica Prestige");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 21) {
                        return plan;
                    }
                }
                break;
            case 22:
                System.out.println("SulAmérica Executivo");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 22) {
                        return plan;
                    }
                }
                break;
            case 23:
                System.out.println("SulAmérica Clássico");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 23) {
                        return plan;
                    }
                }
                break;
            case 24:
                System.out.println("SulAmérica Exato");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 24) {
                        return plan;
                    }
                }
                break;
            case 31:
                System.out.println("Amil Ameno");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 31) {
                        return plan;
                    }
                }
                break;
            case 32:
                System.out.println("Amil Ameplan");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 32) {
                        return plan;
                    }
                }
                break;
            case 33:
                System.out.println("Amil Dix");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 33) {
                        return plan;
                    }
                }
                break;
            case 34:
                System.out.println("Amil Medial");
                for (Plano_Saude plan : plans) {
                    if (plan.getNum_aut() == 34) {
                        return plan;
                    }
                }
                break;
        }
        return null;
    }
    public static void ImprimeMenuPrincipal() {
        System.out.println("1 - Adicionar segurado");
        System.out.println("2 - Imprime segurados de um plano");
        System.out.println("3 - Imprime segurados do sistema");
        System.out.println("4 - Imprime procedimentos de um plano");
        System.out.println("5 - Alterar estado de uma autorização");
        System.out.println("0 - Sair");
    }
    public static int PegaOpcao1() {
        int opcao;
        Scanner sc2 = new Scanner(System.in);
        do {
            System.out.println("Escolha sua opção");
            opcao = sc2.nextInt();
        } while (opcao > 5 || opcao < 0);
        return opcao;
    }
    public static void ImprimeSeguradosDePlano(Plano_Saude plano) {
        for (Segurado s : plano.getSegurados()) {
            System.out.println("Nome:" + s.getNome_segurado() + "\nCpf:" + s.getCpf() + "\n");
        }
    }
    public static void ImprimeSegurados(ArrayList<Segurado> segurados) {
        for (Segurado s : segurados) {
            System.out.println("Nome:" + s.getNome_segurado() + "\nCpf:" + s.getCpf() + "\n");
            for (Plano_Saude p : s.getPlanos()) {
                System.out.println("Planos:" + p.getNome_p() + "\n");
            }
        }
    }
    public static void ImprimeProcedimentos(Plano_Saude plano) {
        for (Procedimento p : plano.getProcedimentos()) {
            System.out.println(p.getNomeProc());
        }
    }
    public static void AdicionaProcedimento(String nome, ItemProcedimento item, Plano_Saude plano) {
        Procedimento p = new Procedimento();        
        p.setNomeProc(nome);
    }
    
    public static void main(String[] args) {

        ArrayList<Operadora> ops = new ArrayList<>();
        ArrayList<Plano_Saude> plans = new ArrayList<>();

        Operadora Unimed = new Operadora("Unimed");
        ops.add(Unimed);
        Plano_Saude Platina = new Plano_Saude("Platina", 11, Unimed);
        plans.add(Platina);
        Plano_Saude Ouro = new Plano_Saude("Ouro", 12, Unimed);
        plans.add(Ouro);
        Plano_Saude Prata = new Plano_Saude("Prata", 13, Unimed);
        plans.add(Prata);
        Plano_Saude Bronze = new Plano_Saude("Bronze", 14, Unimed);
        plans.add(Bronze);

        Operadora Sulamerica = new Operadora("SulAmérica");
        ops.add(Sulamerica);
        Plano_Saude Prestige = new Plano_Saude("Prestige", 21, Sulamerica);
        plans.add(Prestige);
        Plano_Saude Executivo = new Plano_Saude("Executivo", 22, Sulamerica);
        plans.add(Executivo);
        Plano_Saude Classico = new Plano_Saude("Clássico", 23, Sulamerica);
        plans.add(Classico);
        Plano_Saude Exato = new Plano_Saude("Exato", 24, Sulamerica);
        plans.add(Exato);

        Operadora Amil = new Operadora("Amil");
        ops.add(Amil);
        Plano_Saude Ameno = new Plano_Saude("Ameno", 31, Amil);
        plans.add(Ameno);
        Plano_Saude Ameplan = new Plano_Saude("Ameplan", 32, Amil);
        plans.add(Ameplan);
        Plano_Saude Dix = new Plano_Saude("Dix", 33, Amil);
        plans.add(Dix);
        Plano_Saude Medial = new Plano_Saude("Medial", 34, Amil);
        plans.add(Medial);

        ArrayList<Segurado> segurados = new ArrayList();
        int op1;

        do {
            ImprimeMenuPrincipal();
            op1 = PegaOpcao1();
            switch (op1) {
                case 1:
                    String nome = RecebeNome();
                    long cpf = RecebeCpf();
                    ImprimeOperadora(ops);
                    int op2 = PegaOpcao2();
                    Plano_Saude plano = SelecionaPlano(op2, plans);
                    segurados.add(Adiciona(nome, cpf, plano));
                    break;
                case 2:
                    ImprimeOperadora(ops);
                    op2 = PegaOpcao2();
                    plano = SelecionaPlano(op2, plans);
                    ImprimeSeguradosDePlano(plano);
                    break;
                case 3:
                    ImprimeSegurados(segurados);
                    break;
                case 4:
                    ImprimeOperadora(ops);
                    op2 = PegaOpcao2();
                    plano = SelecionaPlano(op2, plans);
                    ImprimeProcedimentos(plano);
                    break;
            }
        } while (op1 != 0);
    }
}
