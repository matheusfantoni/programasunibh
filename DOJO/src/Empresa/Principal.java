package Empresa;

import java.util.ArrayList;

import java.util.List;

import java.util.Random;

import java.util.Scanner;

public class Principal {

    // METODO ESTATICO PARA CRIAR DEPENDENTES
    
    public static void criarDependentes(Funcionario fun, Scanner ler, Scanner in) {
        ArrayList<Dependentes> ListaDeptes = new ArrayList<>();
        int opcao = 0;
        do {
            Dependentes den = new Dependentes();
            System.out.println("Digite o nome do dependente:");
            den.setNome(ler.nextLine());
            System.out.println("Digite a idade:");
            den.setIdade(in.nextInt());
            System.out.println("Digite o CPF do dependente");
            den.setCPF(in.nextLine());
            ListaDeptes.add(den);
            System.out.println("Deseja adicionar outro dependente?\n 1 para Sim. \n 2 para Não.");
            opcao = in.nextInt();
        } while (opcao == 1);
        fun.setListaDeptes(ListaDeptes);

    }
    
    public static void main(String[] args) {

                                                                                                                                                         Scanner in = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int opcao = 0;
        List<Funcionario> listaFuncionario = new ArrayList<>();

        do {
            System.out.println("*********** Opcoes para continuar  ***********************");
            System.out.println("             Digite a opção desejada                    ");
            System.out.println("   1. CADASTRO FUNCIONARIO TIPO: MENSALISTA             ");
            System.out.println("   2. CADASTRO FUNCIONARIO TIPO: HORISTA                ");
            System.out.println("   3. CADASTRO FUNCIONARIO TIPO: COMISSIONADO           ");
            System.out.println("   4. CADASTRO FUNCIONARIO TIPO: CARGO DE CONFIANCA     ");
            System.out.println("   5. EXIBIR A FOLHA DE PAGAMENTO                       ");
            System.out.println("   0. SAIR DO PROGRAMA                                  ");
            System.out.println("********************************************************* ");
            opcao = in.nextInt();

            switch (opcao) {

                case 1:
                    Mensalista funMensalista = new Mensalista() {
                    };
                    funMensalista.setMatricula(aleatorio.nextInt(100));
                    System.out.println("Informe o nome do funcionário:");
                    funMensalista.setNome(ler.nextLine());
                    System.out.println("Informe o CPF:");
                    funMensalista.setCpf(ler.nextLine());

                    
                    int teste = 0;
                    System.out.println("Possui dependentes\nDigite 1 para SIM e 2 para NÃO");
                    teste = in.nextInt();
                    if (teste == 1) {
                        criarDependentes(funMensalista, ler, in);
                    } else {
                        ArrayList<Dependentes> naoDependetes = new ArrayList<>();
                        funMensalista.setListaDeptes(naoDependetes);
                    }
                 
                    
                    System.out.println("Infome o Salário Base:");
                    funMensalista.setSalarioBase(in.nextDouble());
                    funMensalista.DescontoINSS();
                    funMensalista.DescontoIRRF();
                    funMensalista.DescontoVT();
                    funMensalista.DescontoVR(funMensalista);
                    funMensalista.salLiquido();
                    listaFuncionario.add(funMensalista);
                    break;

                case 2:
                    Horista funHorista = new Horista();
                    funHorista.setMatricula(aleatorio.nextInt(100));
                    System.out.println("Informe o nome do funcionário:");
                    funHorista.setNome(ler.nextLine());
                    System.out.println("Informe o CPF:");
                    funHorista.setCpf(ler.nextLine());
                    
                    
                    System.out.println("Possui dependentes\nDigite 1 para SIM e 2 para NÃO");
                    teste = in.nextInt();
                    if (teste == 1) {
                        criarDependentes(funHorista, ler, in);
                    } else {
                        ArrayList<Dependentes> naoDependetes = new ArrayList<>();
                        funHorista.setListaDeptes(naoDependetes);
                    }
                     
                    System.out.println("Infome o Salário Base:");
                    funHorista.setSalarioBase(in.nextDouble());
                    funHorista.DescontoINSS();
                    funHorista.DescontoIRRF();
                    funHorista.DescontoVT();
                    funHorista.DescontoVR(funHorista);
                    funHorista.salLiquido();
                    listaFuncionario.add(funHorista);
                    break;

                case 3:
                    Comissionario funComissao = new Comissionario();
                    funComissao.setMatricula(aleatorio.nextInt(100));
                    System.out.println("Informe o nome do funcionário:");
                    funComissao.setNome(ler.nextLine());
                    System.out.println("Informe o CPF:");
                    funComissao.setCpf(ler.nextLine());
                    
                    // TESTE DOS DEPENDENTES
                    System.out.println("Possui dependentes\nDigite 1 para SIM e 2 para NÃO");
                    teste = in.nextInt();
                    if (teste == 1) {
                        criarDependentes(funComissao, ler, in);
                    } else {
                        ArrayList<Dependentes> naoDependetes = new ArrayList<>();
                        funComissao.setListaDeptes(naoDependetes);
                    }
                    
                    //     TESTE DOS DEPENDENTES
                    System.out.println("Infome o Salário Base:");
                    funComissao.setSalarioBase(in.nextDouble());
                    funComissao.DescontoINSS();
                    funComissao.DescontoIRRF();
                    funComissao.DescontoVT();
                    funComissao.DescontoVR(funComissao);
                    funComissao.salLiquido();
                    listaFuncionario.add(funComissao);
                    break;

                case 4:
                    CargoConfianca funCargoConfianca = new CargoConfianca();
                    funCargoConfianca.setMatricula(aleatorio.nextInt(100));
                    System.out.println("Informe o nome do funcionário:");
                    funCargoConfianca.setNome(ler.nextLine());
                    System.out.println("Informe o CPF:");
                    
                    
                    System.out.println("Possui dependentes\nDigite 1 para SIM e 2 para NÃO");
                    teste = in.nextInt();
                    if (teste == 1) {
                        criarDependentes(funCargoConfianca, ler, in);
                    } else {
                        ArrayList<Dependentes> naoDependetes = new ArrayList<>();
                        funCargoConfianca.setListaDeptes(naoDependetes);
                    }
                    
                    
                    funCargoConfianca.setCpf(ler.nextLine());
                    System.out.println("Infome o Salário Base:");
                    funCargoConfianca.setSalarioBase(in.nextDouble());
                    funCargoConfianca.DescontoINSS();
                    funCargoConfianca.DescontoIRRF();
                    funCargoConfianca.DescontoVT();
                    funCargoConfianca.DescontoVR(funCargoConfianca);
                    funCargoConfianca.salLiquido();
                    listaFuncionario.add(funCargoConfianca);
                    break;

                case 5:
                    for (Funcionario fun : listaFuncionario) {
                        System.out.println(fun.imprimirFolhaPagamento());
                    }
                    break;

                case 0:
                    System.out.println("");
                    break;
            }

        } while (opcao != 0);

    }

}
