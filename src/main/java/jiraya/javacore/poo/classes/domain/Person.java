package jiraya.javacore.poo.classes.domain;

public class Person{
    private String name;
    private int age;
    private char sexo;
    //Só poderão ser acessados pelo próprio objeto

    public void imprimir(){
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Sexo: " + this.sexo);
    }

    public void setName(String name){
        this.name = name;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAge(int age){
        if (age < 0){
            System.out.println("Idade inválida!");
            return;
        }
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
