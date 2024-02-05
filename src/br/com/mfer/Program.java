package br.com.mfer;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Program {

    public static void main(String[] args){
        executaLeituraAnotacao();
    }

    private static void executaLeituraAnotacao(){

        Tabela1 prod = new Tabela1();
        for(Field field : prod.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(Tabela.class)) {
                Tabela annotation = field.getAnnotation(Tabela.class);
                System.out.println("Nome da anotação: " + annotation.toString());
            }
        }
    }
}
