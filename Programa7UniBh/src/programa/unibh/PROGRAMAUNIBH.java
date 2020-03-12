
package programa.unibh;

import java.util.Scanner;

public class PROGRAMAUNIBH {

    public static void main(String[] args) {
            String n1,s1,n2,s2,classifi;
            int ano1,ano2;
            float salario1,salario2;
        System.out.println("1° Pessoa");
        System.out.print("Digite o seu primeiro nome");
        Scanner ent = new Scanner (System.in);
        n1 = ent.next();
        System.out.print("Digite o seu sobrenome");
        s1 = ent.next();
        System.out.print("Digite o seu ano de nascimento");
        ano1 = ent.nextInt();
        System.out.print("Digite o valor do seu salário");
        salario1 = ent.nextFloat();
        System.out.println("2° pessoa");
        System.out.print("Digite o seu primeiro nome");
        n2 = ent.next();
        System.out.print("Digite o seu sobrenome");
        s2 = ent.next();
        System.out.print("Digite o ano do seu nascimento");
        ano2 = ent.nextInt();
        System.out.print("Digite o valor do seu salário");
        salario2 = ent.nextFloat();
        
        System.out.printf("\nOlá %s.%s. Seja" +   " Bem Vindo",n1.substring(0,1),s1);
        System.out.printf("\nOlá %s.%s. Seja"  +  " Bem Vindo",n2.substring(0,1),s2);
        
        if ((n1 + s1).equals(n2+s2))
            System.out.println("\nSão homônimos");
        
        if (salario1 >= 1000 && salario1 <= 2000)
            classifi = "Baixo";
        else if (salario1 >= 2000.01 && salario1 <= 3500)
            classifi = "Médio";
        else if (salario1 > 3500)
            classifi = "Alto";
        else
            classifi = "Inválido";
        System.out.printf("\nOlá %s. Você tem %d anos, nasceu em %d e você tem um salário %s",n1+""+s1,2018-ano1,ano1,classifi);
        
        if (salario2 >= 1000 && salario2 <= 2000)
            classifi = "Baixo";
        else if (salario2 >= 2000.01 && salario2 <= 3500)
            classifi = "Médio";
        else if (salario2 > 3500)
            classifi = "Alto";
        else
            classifi = "Inválido";
        System.out.printf("\nOlá %s. Você tem %d anos, nasceu em %d e você tem um salário %s",n2+""+s2,2018-ano2,ano2,classifi);
            }
    
}
