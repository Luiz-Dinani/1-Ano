package com.mycompany.projeto13.enums;

/**
 *
 * @author aluno
 */
public enum LocalizacaoEnums { //Um enum é um outro jeito de declarar constantes
    //Cada região é na verdade um novo objeto
    
    SUL("S", 1), SUDESTE("SE", 2), CENTRO_OESTE("C", 3), NORDESTE("NE", 4), NORTE("N", 5); //São todas constantes

    private final String abreviacao; //São atributos que os objetos deverão ter
    private final Integer codigo;

    private LocalizacaoEnums(String abreviacao, Integer codigo) {
        this.abreviacao = abreviacao;
        this.codigo = codigo;
    }

    public static LocalizacaoEnums fromCodigo(Integer codigo){
        for (LocalizacaoEnums local : LocalizacaoEnums.values()) {
            if (codigo == local.codigo) {
                return local;
            }
        }
        return null;
    }
    public static LocalizacaoEnums getSUL() {
        return SUL;
    }

    public static LocalizacaoEnums getSUDESTE() {
        return SUDESTE;
    }

    public static LocalizacaoEnums getCENTRO_OESTE() {
        return CENTRO_OESTE;
    }

    public static LocalizacaoEnums getNORDESTE() {
        return NORDESTE;
    }

    public static LocalizacaoEnums getNORTE() {
        return NORTE;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
