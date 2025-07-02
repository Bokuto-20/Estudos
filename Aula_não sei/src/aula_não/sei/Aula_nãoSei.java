
package aula_não.sei;
public class Aula_nãoSei {

    public static void main(String[] args) {
    Aluno al1 = new Aluno("5555", "TI", "Jubileu",22, "Masculino");
    Professor pf1 = new Professor ("Matematica", 1.578, "Arnalda", 45, "Feminino");
    Funcionario fn1 = new Funcionario ("Caixa", true, "Sherek", 77, "Nao binario");
    
        System.out.println(al1.toString());
        System.out.println(pf1.toString());
        System.out.println(fn1.toString());
    
}
}
